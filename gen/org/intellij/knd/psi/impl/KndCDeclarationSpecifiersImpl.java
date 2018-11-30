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

public class KndCDeclarationSpecifiersImpl extends ASTWrapperPsiElement implements KndCDeclarationSpecifiers {

  public KndCDeclarationSpecifiersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCDeclarationSpecifiers(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KndCAlignmentSpecifier getCAlignmentSpecifier() {
    return findChildByClass(KndCAlignmentSpecifier.class);
  }

  @Override
  @Nullable
  public KndCDeclarationSpecifiers getCDeclarationSpecifiers() {
    return findChildByClass(KndCDeclarationSpecifiers.class);
  }

  @Override
  @Nullable
  public KndCFunctionSpecifier getCFunctionSpecifier() {
    return findChildByClass(KndCFunctionSpecifier.class);
  }

  @Override
  @Nullable
  public KndCStorageClassSpecifier getCStorageClassSpecifier() {
    return findChildByClass(KndCStorageClassSpecifier.class);
  }

  @Override
  @Nullable
  public KndCTypeQualifier getCTypeQualifier() {
    return findChildByClass(KndCTypeQualifier.class);
  }

  @Override
  @Nullable
  public KndCTypeSpecifier getCTypeSpecifier() {
    return findChildByClass(KndCTypeSpecifier.class);
  }

}
