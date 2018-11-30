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

public class KndCAssignmentExpressionImpl extends ASTWrapperPsiElement implements KndCAssignmentExpression {

  public KndCAssignmentExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCAssignmentExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KndCAssignmentExpression getCAssignmentExpression() {
    return findChildByClass(KndCAssignmentExpression.class);
  }

  @Override
  @Nullable
  public KndCAssignmentOperator getCAssignmentOperator() {
    return findChildByClass(KndCAssignmentOperator.class);
  }

  @Override
  @Nullable
  public KndCConditionalExpression getCConditionalExpression() {
    return findChildByClass(KndCConditionalExpression.class);
  }

  @Override
  @Nullable
  public KndCUnaryExpression getCUnaryExpression() {
    return findChildByClass(KndCUnaryExpression.class);
  }

}
