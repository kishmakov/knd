package org.intellij.knd;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.knd.psi.KndTypes;
import com.intellij.psi.TokenType;
import java.io.IOException;

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

C_TRAD_COMMENT="/*" [^*]* ~"*/" | "/*" "*"+ "/"
C_LINEAR_COMMENT="//"[^\r\n]*
C_COMMENT={C_TRAD_COMMENT}|{C_LINEAR_COMMENT}
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
C_ES=(\\(['\"\?\\abfnrtv]|{C_O}{1,3}|x{C_H}+))

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
  {D_COMMENT} { return KndTypes.COMMENT; }
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

// Based on Lex specification of ANSI C grammar

<C_END> {
  {C_COMMENT} { return KndTypes.COMMENT; }
  auto { return KndTypes.C_AUTO; }
  break { return KndTypes.C_BREAK; }
  case { return KndTypes.C_CASE; }
  char { return KndTypes.C_CHAR; }
  const { return KndTypes.C_CONST; }
  continue { return KndTypes.C_CONTINUE; }
  default { return KndTypes.C_DEFAULT; }
  do { return KndTypes.C_DO; }
  double { return KndTypes.C_DOUBLE; }
  else { return KndTypes.C_ELSE; }
  enum { return KndTypes.C_ENUM; }
  extern { return KndTypes.C_EXTERN; }
  float { return KndTypes.C_FLOAT; }
  for { return KndTypes.C_FOR; }
  goto { return KndTypes.C_GOTO; }
  if { return KndTypes.C_IF; }
  inline { return KndTypes.C_INLINE; }
  int { return KndTypes.C_INT; }
  long { return KndTypes.C_LONG; }
  register { return KndTypes.C_REGISTER; }
  restrict { return KndTypes.C_RESTRICT; }
  return { return KndTypes.C_RETURN; }
  short { return KndTypes.C_SHORT; }
  signed { return KndTypes.C_SIGNED; }
  sizeof { return KndTypes.C_SIZEOF; }
  static { return KndTypes.C_STATIC; }
  struct { return KndTypes.C_STRUCT; }
  switch { return KndTypes.C_SWITCH; }
  typedef { return KndTypes.C_TYPEDEF; }
  union { return KndTypes.C_UNION; }
  unsigned { return KndTypes.C_UNSIGNED; }
  void { return KndTypes.C_VOID; }
  volatile { return KndTypes.C_VOLATILE; }
  while { return KndTypes.C_WHILE; }
  _Alignas { return KndTypes.C_ALIGNAS; }
  _Alignof { return KndTypes.C_ALIGNOF; }
  _Atomic { return KndTypes.C_ATOMIC; }
  _Bool { return KndTypes.C_BOOL; }
  _Complex { return KndTypes.C_COMPLEX; }
  _Generic { return KndTypes.C_GENERIC; }
  _Imaginary { return KndTypes.C_IMAGINARY; }
  _Noreturn { return KndTypes.C_NORETURN; }
  _Static_assert { return KndTypes.C_STATIC_ASSERT; }
  _Thread_local { return KndTypes.C_THREAD_LOCAL; }
  __func__ { return KndTypes.C_FUNC_NAME; }

  {C_L}{C_A}* { return KndTypes.C_IDENTIFIER; }

  {C_HP}{C_H}+{C_IS}?
  |	{C_NZ}{C_D}*{C_IS}?
  |	"0"{C_O}*{C_IS}?
  | {C_CP}?"'"([^'\\\n]|{C_ES})+"'"
    { return KndTypes.C_I_CONSTANT; }

  {C_D}+{C_E}{C_FS}?
  | {C_D}*"."{C_D}+{C_E}?{C_FS}?
  | {C_D}+"."{C_E}?{C_FS}?
  | {C_HP}{C_H}+{C_P}{C_FS}?
  | {C_HP}{C_H}*"."{C_H}+{C_P}{C_FS}?
  | {C_HP}{C_H}+"."{C_P}{C_FS}?
    { return KndTypes.C_F_CONSTANT; }

  ({C_SP}?\"([^\"\\\n]|{C_ES})*\"{WHITE_SPACE}*)+ { return KndTypes.C_STRING_LITERAL; }

  "..."	{ return KndTypes.C_ELLIPSIS; }
  ">>="	{ return KndTypes.C_RIGHT_ASSIGN; }
  "<<=" { return KndTypes.C_LEFT_ASSIGN; }
  "+=" { return KndTypes.C_ADD_ASSIGN; }
  "-=" { return KndTypes.C_SUB_ASSIGN; }
  "*=" { return KndTypes.C_MUL_ASSIGN; }
  "/=" { return KndTypes.C_DIV_ASSIGN; }
  "%=" { return KndTypes.C_MOD_ASSIGN; }
  "&=" { return KndTypes.C_AND_ASSIGN; }
  "^=" { return KndTypes.C_XOR_ASSIGN; }
  "|=" { return KndTypes.C_OR_ASSIGN; }
  ">>" { return KndTypes.C_RIGHT_OP; }
  "<<" { return KndTypes.C_LEFT_OP; }
  "++" { return KndTypes.C_INC_OP; }
  "--" { return KndTypes.C_DEC_OP; }
  "->" { return KndTypes.C_PTR_OP; }
  "&&" { return KndTypes.C_AND_OP; }
  "||" { return KndTypes.C_OR_OP; }
  "<=" { return KndTypes.C_LE_OP; }
  ">=" { return KndTypes.C_GE_OP; }
  "==" { return KndTypes.C_EQ_OP; }
  "!=" { return KndTypes.C_NE_OP; }
  ";" { return KndTypes.C_SEMICOLON; }
  ("{"|"<%") { return KndTypes.C_L_CURLY; }
  ("}"|"%>") { return KndTypes.C_R_CURLY; }
  "," { return KndTypes.C_COMMA; }
  ":" { return KndTypes.C_COLON; }
  "=" { return KndTypes.C_EQ_SIGN; }
  "(" { return KndTypes.C_L_PAREN; }
  ")" { return KndTypes.C_R_PAREN; }
  ("["|"<:") { return KndTypes.C_L_BRACKET; }
  ("]"|":>") { return KndTypes.C_R_BRACKET; }
  "." { return KndTypes.C_DOT; }
  "&" { return KndTypes.C_AND; }
  "!" { return KndTypes.C_EX_MARK; }
  "~" { return KndTypes.C_TILDE; }
  "-" { return KndTypes.C_MINUS; }
  "+" { return KndTypes.C_PLUS; }
  "*" { return KndTypes.C_MULT; }
  "/" { return KndTypes.C_SLASH; }
  "%" { return KndTypes.C_PERCENT; }
  "<" { return KndTypes.C_LESS; }
  ">" { return KndTypes.C_GREATER; }
  "^" { return KndTypes.C_CARET; }
  "|" { return KndTypes.C_VBAR; }
  "?" { return KndTypes.C_QU_MARK; }
}

[^] { return TokenType.BAD_CHARACTER; }