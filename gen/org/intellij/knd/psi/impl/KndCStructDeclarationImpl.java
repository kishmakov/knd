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

public class KndCStructDeclarationImpl extends ASTWrapperPsiElement implements KndCStructDeclaration {

  public KndCStructDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCStructDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KndCSpecifierQualifierList getCSpecifierQualifierList() {
    return findChildByClass(KndCSpecifierQualifierList.class);
  }

  @Override
  @Nullable
  public KndCStaticAssertDeclaration getCStaticAssertDeclaration() {
    return findChildByClass(KndCStaticAssertDeclaration.class);
  }

  @Override
  @Nullable
  public KndCStructDeclaratorList getCStructDeclaratorList() {
    return findChildByClass(KndCStructDeclaratorList.class);
  }

}
