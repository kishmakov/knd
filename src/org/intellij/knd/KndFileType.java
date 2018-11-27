package org.intellij.knd;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class KndFileType extends LanguageFileType {
    public static final KndFileType INSTANCE = new KndFileType();

    private KndFileType() {
        super(KndLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "KND";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Kotlin/Native c interop definition file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "def";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return KndIcons.FILE;
    }
}