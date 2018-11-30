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

public class KndCFunctionDefinitionImpl extends ASTWrapperPsiElement implements KndCFunctionDefinition {

  public KndCFunctionDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCFunctionDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCCompoundStatement getCCompoundStatement() {
    return findNotNullChildByClass(KndCCompoundStatement.class);
  }

  @Override
  @Nullable
  public KndCDeclarationList getCDeclarationList() {
    return findChildByClass(KndCDeclarationList.class);
  }

  @Override
  @NotNull
  public KndCDeclarationSpecifiers getCDeclarationSpecifiers() {
    return findNotNullChildByClass(KndCDeclarationSpecifiers.class);
  }

  @Override
  @NotNull
  public KndCDeclarator getCDeclarator() {
    return findNotNullChildByClass(KndCDeclarator.class);
  }

}
