// This is a generated file. Not intended for manual editing.
package org.intellij.knd.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.knd.psi.impl.*;

public interface KndTypes {

  IElementType PROPERTY = new KndElementType("PROPERTY");

  IElementType COMMENT = new KndTokenType("COMMENT");
  IElementType CRLF = new KndTokenType("CRLF");
  IElementType KEY = new KndTokenType("KEY");
  IElementType SEPARATOR = new KndTokenType("SEPARATOR");
  IElementType VALUE = new KndTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new KndPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
