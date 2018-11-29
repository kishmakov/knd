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
            createTextAttributesKey("Operators", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey STRING_LITERAL =
            createTextAttributesKey("String literals", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("DEF_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey DEF_KEYWORD =
            createTextAttributesKey("Def keywords", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey DEF_VALUE =
            createTextAttributesKey("DEF_VALUE", DefaultLanguageHighlighterColors.STRING);

    public static final TextAttributesKey C_KEYWORD =
            createTextAttributesKey("C keywords", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("DEF_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] OPERATORS_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_LITERAL};

    private static final TextAttributesKey[] DEF_KEYWORDS_KEYS = new TextAttributesKey[]{DEF_KEYWORD};
    private static final TextAttributesKey[] C_KEYWORDS_KEYS = new TextAttributesKey[]{C_KEYWORD};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{DEF_VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

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
        if (tokenType.equals(KndTypes.DEF_SEPARATOR)) {
            return OPERATORS_KEYS;
        } else if (tokenType.equals(KndTypes.DEF_KEY_KNOWN)) {
            return DEF_KEYWORDS_KEYS;
        } else if (tokenType.equals(KndTypes.DEF_VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(KndTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(KndTypes.C_STRING_LITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(KndTypes.C_CHAR)
                || tokenType.equals(KndTypes.C_CONST)
                || tokenType.equals(KndTypes.C_IF)
                || tokenType.equals(KndTypes.C_ELSE)
                || tokenType.equals(KndTypes.C_INLINE)
                || tokenType.equals(KndTypes.C_STATIC))
        {
            return C_KEYWORDS_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}