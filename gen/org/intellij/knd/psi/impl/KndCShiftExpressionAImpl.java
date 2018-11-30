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

public class KndCShiftExpressionAImpl extends KndCShiftExpressionImpl implements KndCShiftExpressionA {

  public KndCShiftExpressionAImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KndVisitor visitor) {
    visitor.visitCShiftExpressionA(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KndVisitor) accept((KndVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public KndCAdditiveExpression getCAdditiveExpression() {
    return findNotNullChildByClass(KndCAdditiveExpression.class);
  }

  @Override
  @NotNull
  public KndCShiftExpression getCShiftExpression() {
    return findNotNullChildByClass(KndCShiftExpression.class);
  }

}
