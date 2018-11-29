package org.intellij.knd;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.knd.psi.KndTypes;
import com.intellij.psi.TokenType;

%%

%class KndLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \v\n\t\f]

// DEF_BEGIN

D_SEPARATOR=[:=]
D_DOT=[.]
D_PLATFORM_CHAR=[:jletterdigit:]
D_KEY_CHAR=[^:=\ \n\t\f\\.] | "\\ "
D_FIRST_VALUE_CHAR=[^ \n\f\\] | "\\"{CRLF} | "\\".
D_VALUE_CHAR= [^\n\f\\] | "\\"{CRLF} | "\\".
D_COMMENT=("#"|"!")[^\r\n]*

// C_END

C_O=[0-7]
C_D=[0-9]
C_NZ=[1-9]
C_L=[a-zA-Z_]
C_A=[a-zA-Z_0-9]
C_H=[a-fA-F0-9]
C_HP=(0[xX])
C_E=([Ee][+-]?{C_D}+)
C_P=([Pp][+-]?{C_D}+)
C_FS=(f|F|l|L)
C_IS=(((u|U)(l|L|ll|LL)?)|((l|L|ll|LL)(u|U)?))
C_CP=(u|U|L)
C_SP=(u8|u|U|L)
//C_ES=(\\(['"\?\\abfnrtv]|[0-7]{1,3}|x[a-fA-F0-9]+))

%state D_WAITING_PLATFORM
%state D_WAITING_VALUE
%state C_END

%%

{WHITE_SPACE}+ { return TokenType.WHITE_SPACE; }

<YYINITIAL> {
  --- { yybegin(C_END); return KndTypes.DELIM; }
  compilerOpts
    | excludeDependentModules
    | excludedFunctions
    | headerFilter
    | headers
    | libraryPaths
    | linkerOpts
    | nonStrictEnums
    | noStringConversion
    | package
    | staticLibraries
    | strictEnums
      { yybegin(D_WAITING_PLATFORM); return KndTypes.DEF_KEY_KNOWN; }
  {D_KEY_CHAR}+ { yybegin(D_WAITING_PLATFORM); return KndTypes.DEF_KEY_UNKNOWN; }
  {D_COMMENT} { return KndTypes.DEF_COMMENT; }
}

<D_WAITING_PLATFORM> {
  {D_DOT} { return KndTypes.DEF_DOT; }
  {D_PLATFORM_CHAR}+ { return KndTypes.DEF_PLATFORM; }
  {D_SEPARATOR} { yybegin(D_WAITING_VALUE); return KndTypes.DEF_SEPARATOR; }
}

<D_WAITING_VALUE> {
  {D_FIRST_VALUE_CHAR}{D_VALUE_CHAR}* { yybegin(YYINITIAL); return KndTypes.DEF_VALUE; }
}

<D_WAITING_PLATFORM,D_WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+ { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<C_END> {C_D} { return KndTypes.DIGIT; }

[^] { return TokenType.BAD_CHARACTER; }