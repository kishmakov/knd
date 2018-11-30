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

public class KndCStatementImpl extends ASTWrapperPsiElement implements KndCStatement {

  public KndCStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KndCCompoundStatement getCCompoundStatement() {
    return findChildByClass(KndCCompoundStatement.class);
  }

  @Override
  @Nullable
  public KndCExpressionStatement getCExpressionStatement() {
    return findChildByClass(KndCExpressionStatement.class);
  }

  @Override
  @Nullable
  public KndCIterationStatement getCIterationStatement() {
    return findChildByClass(KndCIterationStatement.class);
  }

  @Override
  @Nullable
  public KndCJumpStatement getCJumpStatement() {
    return findChildByClass(KndCJumpStatement.class);
  }

  @Override
  @Nullable
  public KndCLabeledStatement getCLabeledStatement() {
    return findChildByClass(KndCLabeledStatement.class);
  }

  @Override
  @Nullable
  public KndCSelectionStatement getCSelectionStatement() {
    return findChildByClass(KndCSelectionStatement.class);
  }

}
