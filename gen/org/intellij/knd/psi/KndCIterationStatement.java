// This is a generated file. Not intended for manual editing.
package org.intellij.knd.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KndCIterationStatement extends PsiElement {

  @Nullable
  KndCDeclaration getCDeclaration();

  @Nullable
  KndCExpression getCExpression();

  @NotNull
  List<KndCExpressionStatement> getCExpressionStatementList();

  @NotNull
  KndCStatement getCStatement();

}
