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

public class KndCInitializerListAImpl extends KndCInitializerListImpl implements KndCInitializerListA {

  public KndCInitializerListAImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCInitializerListA(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCDesignation getCDesignation() {
    return findNotNullChildByClass(KndCDesignation.class);
  }

  @Override
  @NotNull
  public KndCInitializer getCInitializer() {
    return findNotNullChildByClass(KndCInitializer.class);
  }

  @Override
  @NotNull
  public KndCInitializerList getCInitializerList() {
    return findNotNullChildByClass(KndCInitializerList.class);
  }

}
