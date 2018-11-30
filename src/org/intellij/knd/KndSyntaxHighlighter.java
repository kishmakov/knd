package org.intellij.knd;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.intellij.knd.psi.KndTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class KndSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("Operator", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey DOT =
            createTextAttributesKey("Dot", DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON =
            createTextAttributesKey("Semicolon", DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COMMA =
            createTextAttributesKey("Comma", DefaultLanguageHighlighterColors.COMMA);

    public static final TextAttributesKey BRACE =
            createTextAttributesKey("Braces", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey BRACKET =
            createTextAttributesKey("Brackets", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey PAREN =
            createTextAttributesKey("Parentheses", DefaultLanguageHighlighterColors.PARENTHESES);

    public static final TextAttributesKey CONSTANT =
            createTextAttributesKey("Constant", DefaultLanguageHighlighterColors.CONSTANT);
    public static final TextAttributesKey STRING_LITERAL =
            createTextAttributesKey("String literal", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey("Identifier", DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("Comment", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey DEF_KEYWORD =
            createTextAttributesKey("Def keyword", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey C_KEYWORD =
            createTextAttributesKey("C keyword", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DEF_VALUE =
            createTextAttributesKey("Def value", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("Bad char", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] OPERATORS_KEYS = new TextAttributesKey[]{OPERATOR};

    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] SEMICOLON_KEYS = new TextAttributesKey[]{SEMICOLON};
    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};

    private static final TextAttributesKey[] BRACE_KEYS = new TextAttributesKey[]{BRACE};
    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKET};
    private static final TextAttributesKey[] PAREN_KEYS = new TextAttributesKey[]{PAREN};

    private static final TextAttributesKey[] CONSTANT_KEYS = new TextAttributesKey[]{CONSTANT};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_LITERAL};

    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

    private static final TextAttributesKey[] DEF_KEYWORD_KEYS = new TextAttributesKey[]{DEF_KEYWORD};
    private static final TextAttributesKey[] C_KEYWORDS_KEYS = new TextAttributesKey[]{C_KEYWORD};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{DEF_VALUE};

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new KndLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(KndTypes.DEF_SEPARATOR)
                || tokenType.equals(KndTypes.C_RIGHT_ASSIGN)
                || tokenType.equals(KndTypes.C_LEFT_ASSIGN)
                || tokenType.equals(KndTypes.C_ADD_ASSIGN)
                || tokenType.equals(KndTypes.C_SUB_ASSIGN)
                || tokenType.equals(KndTypes.C_MUL_ASSIGN)
                || tokenType.equals(KndTypes.C_DIV_ASSIGN)
                || tokenType.equals(KndTypes.C_MOD_ASSIGN)
                || tokenType.equals(KndTypes.C_AND_ASSIGN)
                || tokenType.equals(KndTypes.C_XOR_ASSIGN)
                || tokenType.equals(KndTypes.C_OR_ASSIGN)
                || tokenType.equals(KndTypes.C_RIGHT_OP)
                || tokenType.equals(KndTypes.C_LEFT_OP)
                || tokenType.equals(KndTypes.C_INC_OP)
                || tokenType.equals(KndTypes.C_DEC_OP)
                || tokenType.equals(KndTypes.C_PTR_OP)
                || tokenType.equals(KndTypes.C_AND_OP)
                || tokenType.equals(KndTypes.C_OR_OP)
                || tokenType.equals(KndTypes.C_LE_OP)
                || tokenType.equals(KndTypes.C_GE_OP)
                || tokenType.equals(KndTypes.C_EQ_OP)
                || tokenType.equals(KndTypes.C_NE_OP)
                || tokenType.equals(KndTypes.C_EQ_SIGN)
                || tokenType.equals(KndTypes.C_AND)
                || tokenType.equals(KndTypes.C_EX_MARK)
                || tokenType.equals(KndTypes.C_TILDE)
                || tokenType.equals(KndTypes.C_MINUS)
                || tokenType.equals(KndTypes.C_PLUS)
                || tokenType.equals(KndTypes.C_MULT)
                || tokenType.equals(KndTypes.C_SLASH)
                || tokenType.equals(KndTypes.C_PERCENT)
                || tokenType.equals(KndTypes.C_LESS)
                || tokenType.equals(KndTypes.C_GREATER)
                || tokenType.equals(KndTypes.C_CARET)
                || tokenType.equals(KndTypes.C_VBAR)
                || tokenType.equals(KndTypes.C_QU_MARK)) {
            return OPERATORS_KEYS;
        } else if (tokenType.equals(KndTypes.C_DOT)) {
            return DOT_KEYS;
        } else if (tokenType.equals(KndTypes.C_SEMICOLON)) {
            return SEMICOLON_KEYS;
        } else if (tokenType.equals(KndTypes.C_COMMA)) {
            return COMMA_KEYS;
        } else if (tokenType.equals(KndTypes.C_L_CURLY) || tokenType.equals(KndTypes.C_R_CURLY)) {
            return BRACE_KEYS;
        } else if (tokenType.equals(KndTypes.C_L_BRACKET) || tokenType.equals(KndTypes.C_R_BRACKET)) {
            return BRACKET_KEYS;
        } else if (tokenType.equals(KndTypes.C_L_PAREN) || tokenType.equals(KndTypes.C_R_PAREN)) {
            return PAREN_KEYS;
        } else if (tokenType.equals(KndTypes.C_STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(KndTypes.C_IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (tokenType.equals(KndTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(KndTypes.C_I_CONSTANT) || tokenType.equals(KndTypes.C_F_CONSTANT)) {
            return CONSTANT_KEYS;
        } else if (tokenType.equals(KndTypes.C_AUTO)
                || tokenType.equals(KndTypes.C_BREAK)
                || tokenType.equals(KndTypes.C_CASE)
                || tokenType.equals(KndTypes.C_CHAR)
                || tokenType.equals(KndTypes.C_CONST)
                || tokenType.equals(KndTypes.C_CONTINUE)
                || tokenType.equals(KndTypes.C_DEFAULT)
                || tokenType.equals(KndTypes.C_DO)
                || tokenType.equals(KndTypes.C_DOUBLE)
                || tokenType.equals(KndTypes.C_ELSE)
                || tokenType.equals(KndTypes.C_ENUM)
                || tokenType.equals(KndTypes.C_EXTERN)
                || tokenType.equals(KndTypes.C_FLOAT)
                || tokenType.equals(KndTypes.C_FOR)
                || tokenType.equals(KndTypes.C_GOTO)
                || tokenType.equals(KndTypes.C_IF)
                || tokenType.equals(KndTypes.C_INLINE)
                || tokenType.equals(KndTypes.C_INT)
                || tokenType.equals(KndTypes.C_LONG)
                || tokenType.equals(KndTypes.C_REGISTER)
                || tokenType.equals(KndTypes.C_RESTRICT)
                || tokenType.equals(KndTypes.C_RETURN)
                || tokenType.equals(KndTypes.C_SHORT)
                || tokenType.equals(KndTypes.C_SIGNED)
                || tokenType.equals(KndTypes.C_SIZEOF)
                || tokenType.equals(KndTypes.C_STATIC)
                || tokenType.equals(KndTypes.C_STRUCT)
                || tokenType.equals(KndTypes.C_SWITCH)
                || tokenType.equals(KndTypes.C_TYPEDEF)
                || tokenType.equals(KndTypes.C_UNION)
                || tokenType.equals(KndTypes.C_UNSIGNED)
                || tokenType.equals(KndTypes.C_VOID)
                || tokenType.equals(KndTypes.C_VOLATILE)
                || tokenType.equals(KndTypes.C_WHILE)
                || tokenType.equals(KndTypes.C_ALIGNAS)
                || tokenType.equals(KndTypes.C_ALIGNOF)
                || tokenType.equals(KndTypes.C_ATOMIC)
                || tokenType.equals(KndTypes.C_BOOL)
                || tokenType.equals(KndTypes.C_COMPLEX)
                || tokenType.equals(KndTypes.C_GENERIC)
                || tokenType.equals(KndTypes.C_IMAGINARY)
                || tokenType.equals(KndTypes.C_NORETURN)
                || tokenType.equals(KndTypes.C_STATIC_ASSERT)
                || tokenType.equals(KndTypes.C_THREAD_LOCAL)
                || tokenType.equals(KndTypes.C_FUNC_NAME))
        {
            return C_KEYWORDS_KEYS;
        } else if (tokenType.equals(KndTypes.DEF_KEY_KNOWN)) {
            return DEF_KEYWORD_KEYS;
        } else if (tokenType.equals(KndTypes.DEF_VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}