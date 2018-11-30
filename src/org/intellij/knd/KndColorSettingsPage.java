package org.intellij.knd;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;

import javax.swing.*;
import java.util.Map;

public class KndColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Operators", KndSyntaxHighlighter.OPERATOR),

            new AttributesDescriptor("Dot", KndSyntaxHighlighter.DOT),
            new AttributesDescriptor("Semicolon", KndSyntaxHighlighter.SEMICOLON),
            new AttributesDescriptor("Comma", KndSyntaxHighlighter.COMMA),

            new AttributesDescriptor("Braces", KndSyntaxHighlighter.BRACE),
            new AttributesDescriptor("Brackets", KndSyntaxHighlighter.BRACKET),
            new AttributesDescriptor("Parentheses", KndSyntaxHighlighter.PAREN),

            new AttributesDescriptor("Constant", KndSyntaxHighlighter.CONSTANT),
            new AttributesDescriptor("String literals", KndSyntaxHighlighter.STRING_LITERAL),

            new AttributesDescriptor("Identifier", KndSyntaxHighlighter.IDENTIFIER),

            new AttributesDescriptor("Comments", KndSyntaxHighlighter.COMMENT),

            new AttributesDescriptor("Def keywords", KndSyntaxHighlighter.DEF_KEYWORD),
            new AttributesDescriptor("C keywords", KndSyntaxHighlighter.C_KEYWORD),
            new AttributesDescriptor("Def value", KndSyntaxHighlighter.DEF_VALUE),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return KndIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new KndSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# Def known key and value\n" +
                "headers = curl/curl.h\n" +
                "compilerOpts.linux = -I/usr/include -I/usr/include/x86_64-linux-gnu\n" +
                "! Def unkonwn keys\n" +
                "Aba = caba\n" +
                "---\n" +
                "// C comment\n" +
                "struct Hash {\n" +
                "    int data[2];\n" +
                "};\n" +
                "\n" +
                "inline static int strangeSum(const void* buffer, int bufferSize) {\n" +
                "    int result = 20;\n" +
                "    const char * stringLiteral = \"This is a string\";\n" +
                "    for (int i = 0; i < bufferSize; ++i) {\n" +
                "        result += stringLiteral[i % 10] == i ? (i << 1) : (i % 3);\n" +
                "    }\n" +
                "    return result;\n" +
                "}\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "KND";
    }
}