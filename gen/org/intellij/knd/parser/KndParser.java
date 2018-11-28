// This is a generated file. Not intended for manual editing.
package org.intellij.knd.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.knd.psi.KndTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KndParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == C_END) {
      r = C_END(b, 0);
    }
    else if (t == DEF_BEGIN) {
      r = DEF_BEGIN(b, 0);
    }
    else if (t == DEF_DEFINITION) {
      r = DEF_DEFINITION(b, 0);
    }
    else if (t == DEF_KEY) {
      r = DEF_KEY(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return ROOT(b, l + 1);
  }

  /* ********************************************************** */
  // DIGIT*
  public static boolean C_END(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_END")) return false;
    Marker m = enter_section_(b, l, _NONE_, C_END, "<c end>");
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, DIGIT)) break;
      if (!empty_element_parsed_guard_(b, "C_END", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // def_item_*
  public static boolean DEF_BEGIN(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_BEGIN")) return false;
    Marker m = enter_section_(b, l, _NONE_, DEF_BEGIN, "<def begin>");
    while (true) {
      int c = current_position_(b);
      if (!def_item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "DEF_BEGIN", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // DEF_KEY DEF_SEPARATOR DEF_VALUE
  public static boolean DEF_DEFINITION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_DEFINITION")) return false;
    if (!nextTokenIs(b, "<def definition>", DEF_KEY_KNOWN, DEF_KEY_UNKNOWN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEF_DEFINITION, "<def definition>");
    r = DEF_KEY(b, l + 1);
    r = r && consumeTokens(b, 0, DEF_SEPARATOR, DEF_VALUE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (DEF_KEY_KNOWN | DEF_KEY_UNKNOWN) (DEF_DOT DEF_PLATFORM)?
  public static boolean DEF_KEY(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_KEY")) return false;
    if (!nextTokenIs(b, "<def key>", DEF_KEY_KNOWN, DEF_KEY_UNKNOWN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DEF_KEY, "<def key>");
    r = DEF_KEY_0(b, l + 1);
    r = r && DEF_KEY_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // DEF_KEY_KNOWN | DEF_KEY_UNKNOWN
  private static boolean DEF_KEY_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_KEY_0")) return false;
    boolean r;
    r = consumeToken(b, DEF_KEY_KNOWN);
    if (!r) r = consumeToken(b, DEF_KEY_UNKNOWN);
    return r;
  }

  // (DEF_DOT DEF_PLATFORM)?
  private static boolean DEF_KEY_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_KEY_1")) return false;
    DEF_KEY_1_0(b, l + 1);
    return true;
  }

  // DEF_DOT DEF_PLATFORM
  private static boolean DEF_KEY_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DEF_KEY_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEF_DOT, DEF_PLATFORM);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEF_BEGIN (DELIM C_END?)?
  static boolean ROOT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ROOT")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = DEF_BEGIN(b, l + 1);
    r = r && ROOT_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DELIM C_END?)?
  private static boolean ROOT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ROOT_1")) return false;
    ROOT_1_0(b, l + 1);
    return true;
  }

  // DELIM C_END?
  private static boolean ROOT_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ROOT_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DELIM);
    r = r && ROOT_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_END?
  private static boolean ROOT_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ROOT_1_0_1")) return false;
    C_END(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // DEF_DEFINITION | DEF_COMMENT
  static boolean def_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_item_")) return false;
    boolean r;
    r = DEF_DEFINITION(b, l + 1);
    if (!r) r = consumeToken(b, DEF_COMMENT);
    return r;
  }

}
