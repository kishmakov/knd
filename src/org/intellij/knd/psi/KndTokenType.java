package org.intellij.knd.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.knd.KndLanguage;
import org.jetbrains.annotations.*;

public class KndTokenType extends IElementType {
    public KndTokenType(@NotNull @NonNls String debugName) {
        super(debugName, KndLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "KndTokenType." + super.toString();
    }
}
