package org.intellij.knd.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.knd.KndLanguage;
import org.jetbrains.annotations.*;

public class KndElementType extends IElementType {
    public KndElementType(@NotNull @NonNls String debugName) {
        super(debugName, KndLanguage.INSTANCE);
    }
}