package org.intellij.knd;

import com.intellij.lang.Language;

public class KndLanguage extends Language {
    public static final KndLanguage INSTANCE = new KndLanguage();

    private KndLanguage() {
        super("KND");
    }
}