package org.intellij.knd;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class KndLexerAdapter extends FlexAdapter {
    public KndLexerAdapter() {
        super(new KndLexer((Reader) null));
    }
}
