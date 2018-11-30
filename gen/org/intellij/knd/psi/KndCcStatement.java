// This is a generated file. Not intended for manual editing.
package org.intellij.knd.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface KndCcStatement extends PsiElement {

  @Nullable
  KndCcCompoundStatement getCcCompoundStatement();

  @Nullable
  KndCcExpressionStatement getCcExpressionStatement();

  @Nullable
  KndCcIterationStatement getCcIterationStatement();

  @Nullable
  KndCcJumpStatement getCcJumpStatement();

  @Nullable
  KndCcLabeledStatement getCcLabeledStatement();

  @Nullable
  KndCcSelectionStatement getCcSelectionStatement();

}
