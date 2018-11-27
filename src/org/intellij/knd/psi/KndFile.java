package org.intellij.knd.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.knd.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class KndFile extends PsiFileBase {
    public KndFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, KndLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return KndFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "KND File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
