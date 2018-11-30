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
        return "# You are reading the \".properties\" entry.\n" +
                "! The exclamation mark can also mark text as comments.\n" +
                "website = http://en.wikipedia.org/\n" +
                "language = English\n" +
                "# The backslash below tells the application to continue reading\n" +
                "# the value onto the next line.\n" +
                "message = Welcome to \\\n" +
                "          Wikipedia!\n" +
                "# Add spaces to the key\n" +
                "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                "# Unicode\n" +
                "tab : \\u0009";
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