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

public class KndCDirectDeclaratorHImpl extends KndCDirectDeclaratorImpl implements KndCDirectDeclaratorH {

  public KndCDirectDeclaratorHImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCDirectDeclaratorH(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCDirectDeclarator getCDirectDeclarator() {
    return findNotNullChildByClass(KndCDirectDeclarator.class);
  }

  @Override
  @NotNull
  public KndCTypeQualifierList getCTypeQualifierList() {
    return findNotNullChildByClass(KndCTypeQualifierList.class);
  }

}
