// This is a generated file. Not intended for manual editing.
package org.intellij.knd.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.knd.psi.KndTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.knd.psi.*;

public class KndDefDefinitionImpl extends ASTWrapperPsiElement implements KndDefDefinition {

  public KndDefDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitDefDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndDefKey getDefKey() {
    return findNotNullChildByClass(KndDefKey.class);
  }

}
