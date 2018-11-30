// This is a generated file. Not intended for manual editing.
package org.intellij.knd.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.knd.psi.KndTypes.*;
import org.intellij.knd.psi.*;

public class KndCDirectAbstractDeclaratorGImpl extends KndCDirectAbstractDeclaratorImpl implements KndCDirectAbstractDeclaratorG {

  public KndCDirectAbstractDeclaratorGImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCDirectAbstractDeclaratorG(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCDirectAbstractDeclarator getCDirectAbstractDeclarator() {
    return findNotNullChildByClass(KndCDirectAbstractDeclarator.class);
  }

  @Override
  @NotNull
  public KndCTypeQualifierList getCTypeQualifierList() {
    return findNotNullChildByClass(KndCTypeQualifierList.class);
  }

}
