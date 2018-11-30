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

public class KndCDirectDeclaratorLImpl extends KndCDirectDeclaratorImpl implements KndCDirectDeclaratorL {

  public KndCDirectDeclaratorLImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCDirectDeclaratorL(this);
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
  public KndCIdentifierList getCIdentifierList() {
    return findNotNullChildByClass(KndCIdentifierList.class);
  }

}
