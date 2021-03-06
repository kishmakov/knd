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

public class KndCUnaryExpressionImpl extends ASTWrapperPsiElement implements KndCUnaryExpression {

  public KndCUnaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCUnaryExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public KndCCastExpression getCCastExpression() {
    return findChildByClass(KndCCastExpression.class);
  }

  @Override
  @Nullable
  public KndCPostfixExpression getCPostfixExpression() {
    return findChildByClass(KndCPostfixExpression.class);
  }

  @Override
  @Nullable
  public KndCTypeName getCTypeName() {
    return findChildByClass(KndCTypeName.class);
  }

  @Override
  @Nullable
  public KndCUnaryExpression getCUnaryExpression() {
    return findChildByClass(KndCUnaryExpression.class);
  }

  @Override
  @Nullable
  public KndCUnaryOperator getCUnaryOperator() {
    return findChildByClass(KndCUnaryOperator.class);
  }

}
