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

public class KndCStructDeclaratorListAImpl extends KndCStructDeclaratorListImpl implements KndCStructDeclaratorListA {

  public KndCStructDeclaratorListAImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCStructDeclaratorListA(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCStructDeclarator getCStructDeclarator() {
    return findNotNullChildByClass(KndCStructDeclarator.class);
  }

  @Override
  @NotNull
  public KndCStructDeclaratorList getCStructDeclaratorList() {
    return findNotNullChildByClass(KndCStructDeclaratorList.class);
  }

}
