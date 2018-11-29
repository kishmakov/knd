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
    if (t == C_ABSTRACT_DECLARATOR) {
      r = C_ABSTRACT_DECLARATOR(b, 0);
    }
    else if (t == C_ADDITIVE_EXPRESSION) {
      r = C_ADDITIVE_EXPRESSION(b, 0);
    }
    else if (t == C_ALIGNMENT_SPECIFIER) {
      r = C_ALIGNMENT_SPECIFIER(b, 0);
    }
    else if (t == C_AND_EXPRESSION) {
      r = C_AND_EXPRESSION(b, 0);
    }
    else if (t == C_ARGUMENT_EXPRESSION_LIST) {
      r = C_ARGUMENT_EXPRESSION_LIST(b, 0);
    }
    else if (t == C_ASSIGNMENT_EXPRESSION) {
      r = C_ASSIGNMENT_EXPRESSION(b, 0);
    }
    else if (t == C_ASSIGNMENT_OPERATOR) {
      r = C_ASSIGNMENT_OPERATOR(b, 0);
    }
    else if (t == C_ATOMIC_TYPE_SPECIFIER) {
      r = C_ATOMIC_TYPE_SPECIFIER(b, 0);
    }
    else if (t == C_BLOCK_ITEM) {
      r = C_BLOCK_ITEM(b, 0);
    }
    else if (t == C_BLOCK_ITEM_LIST) {
      r = C_BLOCK_ITEM_LIST(b, 0);
    }
    else if (t == C_CAST_EXPRESSION) {
      r = C_CAST_EXPRESSION(b, 0);
    }
    else if (t == C_COMPOUND_STATEMENT) {
      r = C_COMPOUND_STATEMENT(b, 0);
    }
    else if (t == C_CONDITIONAL_EXPRESSION) {
      r = C_CONDITIONAL_EXPRESSION(b, 0);
    }
    else if (t == C_CONSTANT) {
      r = C_CONSTANT(b, 0);
    }
    else if (t == C_CONSTANT_EXPRESSION) {
      r = C_CONSTANT_EXPRESSION(b, 0);
    }
    else if (t == C_DECLARATION) {
      r = C_DECLARATION(b, 0);
    }
    else if (t == C_DECLARATION_LIST) {
      r = C_DECLARATION_LIST(b, 0);
    }
    else if (t == C_DECLARATION_SPECIFIERS) {
      r = C_DECLARATION_SPECIFIERS(b, 0);
    }
    else if (t == C_DECLARATOR) {
      r = C_DECLARATOR(b, 0);
    }
    else if (t == C_DESIGNATION) {
      r = C_DESIGNATION(b, 0);
    }
    else if (t == C_DESIGNATOR) {
      r = C_DESIGNATOR(b, 0);
    }
    else if (t == C_DESIGNATOR_LIST) {
      r = C_DESIGNATOR_LIST(b, 0);
    }
    else if (t == C_DIRECT_ABSTRACT_DECLARATOR) {
      r = C_DIRECT_ABSTRACT_DECLARATOR(b, 0);
    }
    else if (t == C_DIRECT_DECLARATOR) {
      r = C_DIRECT_DECLARATOR(b, 0);
    }
    else if (t == C_END) {
      r = C_END(b, 0);
    }
    else if (t == C_ENUMERATION_CONSTANT) {
      r = C_ENUMERATION_CONSTANT(b, 0);
    }
    else if (t == C_ENUMERATOR) {
      r = C_ENUMERATOR(b, 0);
    }
    else if (t == C_ENUMERATOR_LIST) {
      r = C_ENUMERATOR_LIST(b, 0);
    }
    else if (t == C_ENUM_SPECIFIER) {
      r = C_ENUM_SPECIFIER(b, 0);
    }
    else if (t == C_EQUALITY_EXPRESSION) {
      r = C_EQUALITY_EXPRESSION(b, 0);
    }
    else if (t == C_EXCLUSIVE_OR_EXPRESSION) {
      r = C_EXCLUSIVE_OR_EXPRESSION(b, 0);
    }
    else if (t == C_EXPRESSION) {
      r = C_EXPRESSION(b, 0);
    }
    else if (t == C_EXPRESSION_STATEMENT) {
      r = C_EXPRESSION_STATEMENT(b, 0);
    }
    else if (t == C_EXTERNAL_DECLARATION) {
      r = C_EXTERNAL_DECLARATION(b, 0);
    }
    else if (t == C_FUNCTION_DEFINITION) {
      r = C_FUNCTION_DEFINITION(b, 0);
    }
    else if (t == C_FUNCTION_SPECIFIER) {
      r = C_FUNCTION_SPECIFIER(b, 0);
    }
    else if (t == C_GENERIC_ASSOCIATION) {
      r = C_GENERIC_ASSOCIATION(b, 0);
    }
    else if (t == C_GENERIC_ASSOC_LIST) {
      r = C_GENERIC_ASSOC_LIST(b, 0);
    }
    else if (t == C_GENERIC_SELECTION) {
      r = C_GENERIC_SELECTION(b, 0);
    }
    else if (t == C_IDENTIFIER_LIST) {
      r = C_IDENTIFIER_LIST(b, 0);
    }
    else if (t == C_INCLUSIVE_OR_EXPRESSION) {
      r = C_INCLUSIVE_OR_EXPRESSION(b, 0);
    }
    else if (t == C_INITIALIZER) {
      r = C_INITIALIZER(b, 0);
    }
    else if (t == C_INITIALIZER_LIST) {
      r = C_INITIALIZER_LIST(b, 0);
    }
    else if (t == C_INIT_DECLARATOR) {
      r = C_INIT_DECLARATOR(b, 0);
    }
    else if (t == C_INIT_DECLARATOR_LIST) {
      r = C_INIT_DECLARATOR_LIST(b, 0);
    }
    else if (t == C_ITERATION_STATEMENT) {
      r = C_ITERATION_STATEMENT(b, 0);
    }
    else if (t == C_JUMP_STATEMENT) {
      r = C_JUMP_STATEMENT(b, 0);
    }
    else if (t == C_LABELED_STATEMENT) {
      r = C_LABELED_STATEMENT(b, 0);
    }
    else if (t == C_LOGICAL_AND_EXPRESSION) {
      r = C_LOGICAL_AND_EXPRESSION(b, 0);
    }
    else if (t == C_LOGICAL_OR_EXPRESSION) {
      r = C_LOGICAL_OR_EXPRESSION(b, 0);
    }
    else if (t == C_MULTIPLICATIVE_EXPRESSION) {
      r = C_MULTIPLICATIVE_EXPRESSION(b, 0);
    }
    else if (t == C_PARAMETER_DECLARATION) {
      r = C_PARAMETER_DECLARATION(b, 0);
    }
    else if (t == C_PARAMETER_LIST) {
      r = C_PARAMETER_LIST(b, 0);
    }
    else if (t == C_PARAMETER_TYPE_LIST) {
      r = C_PARAMETER_TYPE_LIST(b, 0);
    }
    else if (t == C_POINTER) {
      r = C_POINTER(b, 0);
    }
    else if (t == C_POSTFIX_EXPRESSION) {
      r = C_POSTFIX_EXPRESSION(b, 0);
    }
    else if (t == C_PRIMARY_EXPRESSION) {
      r = C_PRIMARY_EXPRESSION(b, 0);
    }
    else if (t == C_RELATIONAL_EXPRESSION) {
      r = C_RELATIONAL_EXPRESSION(b, 0);
    }
    else if (t == C_SELECTION_STATEMENT) {
      r = C_SELECTION_STATEMENT(b, 0);
    }
    else if (t == C_SHIFT_EXPRESSION) {
      r = C_SHIFT_EXPRESSION(b, 0);
    }
    else if (t == C_SPECIFIER_QUALIFIER_LIST) {
      r = C_SPECIFIER_QUALIFIER_LIST(b, 0);
    }
    else if (t == C_STATEMENT) {
      r = C_STATEMENT(b, 0);
    }
    else if (t == C_STATIC_ASSERT_DECLARATION) {
      r = C_STATIC_ASSERT_DECLARATION(b, 0);
    }
    else if (t == C_STORAGE_CLASS_SPECIFIER) {
      r = C_STORAGE_CLASS_SPECIFIER(b, 0);
    }
    else if (t == C_STRING) {
      r = C_STRING(b, 0);
    }
    else if (t == C_STRUCT_DECLARATION) {
      r = C_STRUCT_DECLARATION(b, 0);
    }
    else if (t == C_STRUCT_DECLARATION_LIST) {
      r = C_STRUCT_DECLARATION_LIST(b, 0);
    }
    else if (t == C_STRUCT_DECLARATOR) {
      r = C_STRUCT_DECLARATOR(b, 0);
    }
    else if (t == C_STRUCT_DECLARATOR_LIST) {
      r = C_STRUCT_DECLARATOR_LIST(b, 0);
    }
    else if (t == C_STRUCT_OR_UNION) {
      r = C_STRUCT_OR_UNION(b, 0);
    }
    else if (t == C_STRUCT_OR_UNION_SPECIFIER) {
      r = C_STRUCT_OR_UNION_SPECIFIER(b, 0);
    }
    else if (t == C_TYPE_NAME) {
      r = C_TYPE_NAME(b, 0);
    }
    else if (t == C_TYPE_QUALIFIER) {
      r = C_TYPE_QUALIFIER(b, 0);
    }
    else if (t == C_TYPE_QUALIFIER_LIST) {
      r = C_TYPE_QUALIFIER_LIST(b, 0);
    }
    else if (t == C_TYPE_SPECIFIER) {
      r = C_TYPE_SPECIFIER(b, 0);
    }
    else if (t == C_UNARY_EXPRESSION) {
      r = C_UNARY_EXPRESSION(b, 0);
    }
    else if (t == C_UNARY_OPERATOR) {
      r = C_UNARY_OPERATOR(b, 0);
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
  // C_POINTER C_DIRECT_ABSTRACT_DECLARATOR
  // 	| C_POINTER	| C_DIRECT_ABSTRACT_DECLARATOR
  public static boolean C_ABSTRACT_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ABSTRACT_DECLARATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ABSTRACT_DECLARATOR, "<c abstract declarator>");
    r = C_ABSTRACT_DECLARATOR_0(b, l + 1);
    if (!r) r = C_POINTER(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_POINTER C_DIRECT_ABSTRACT_DECLARATOR
  private static boolean C_ABSTRACT_DECLARATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ABSTRACT_DECLARATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POINTER(b, l + 1);
    r = r && C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_MULTIPLICATIVE_EXPRESSION
  // 	| C_ADDITIVE_EXPRESSION C_PLUS C_MULTIPLICATIVE_EXPRESSION
  // 	| C_ADDITIVE_EXPRESSION C_MINUS C_MULTIPLICATIVE_EXPRESSION
  public static boolean C_ADDITIVE_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ADDITIVE_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ADDITIVE_EXPRESSION, "<c additive expression>");
    r = C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    if (!r) r = C_ADDITIVE_EXPRESSION_1(b, l + 1);
    if (!r) r = C_ADDITIVE_EXPRESSION_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_ADDITIVE_EXPRESSION C_PLUS C_MULTIPLICATIVE_EXPRESSION
  private static boolean C_ADDITIVE_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ADDITIVE_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ADDITIVE_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_PLUS);
    r = r && C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ADDITIVE_EXPRESSION C_MINUS C_MULTIPLICATIVE_EXPRESSION
  private static boolean C_ADDITIVE_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ADDITIVE_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ADDITIVE_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_MINUS);
    r = r && C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ALIGNAS C_L_PAREN C_TYPE_NAME C_R_PAREN
  // 	| C_ALIGNAS C_L_PAREN C_CONSTANT_EXPRESSION C_R_PAREN
  public static boolean C_ALIGNMENT_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ALIGNMENT_SPECIFIER")) return false;
    if (!nextTokenIs(b, C_ALIGNAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ALIGNMENT_SPECIFIER_0(b, l + 1);
    if (!r) r = C_ALIGNMENT_SPECIFIER_1(b, l + 1);
    exit_section_(b, m, C_ALIGNMENT_SPECIFIER, r);
    return r;
  }

  // C_ALIGNAS C_L_PAREN C_TYPE_NAME C_R_PAREN
  private static boolean C_ALIGNMENT_SPECIFIER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ALIGNMENT_SPECIFIER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ALIGNAS, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ALIGNAS C_L_PAREN C_CONSTANT_EXPRESSION C_R_PAREN
  private static boolean C_ALIGNMENT_SPECIFIER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ALIGNMENT_SPECIFIER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ALIGNAS, C_L_PAREN);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_EQUALITY_EXPRESSION
  // 	| C_AND_EXPRESSION C_AND C_EQUALITY_EXPRESSION
  public static boolean C_AND_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_AND_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_AND_EXPRESSION, "<c and expression>");
    r = C_EQUALITY_EXPRESSION(b, l + 1);
    if (!r) r = C_AND_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_AND_EXPRESSION C_AND C_EQUALITY_EXPRESSION
  private static boolean C_AND_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_AND_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_AND_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_AND);
    r = r && C_EQUALITY_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ASSIGNMENT_EXPRESSION
  // 	| C_ARGUMENT_EXPRESSION_LIST C_COMMA C_ASSIGNMENT_EXPRESSION
  public static boolean C_ARGUMENT_EXPRESSION_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ARGUMENT_EXPRESSION_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ARGUMENT_EXPRESSION_LIST, "<c argument expression list>");
    r = C_ASSIGNMENT_EXPRESSION(b, l + 1);
    if (!r) r = C_ARGUMENT_EXPRESSION_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_ARGUMENT_EXPRESSION_LIST C_COMMA C_ASSIGNMENT_EXPRESSION
  private static boolean C_ARGUMENT_EXPRESSION_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ARGUMENT_EXPRESSION_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ARGUMENT_EXPRESSION_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_CONDITIONAL_EXPRESSION
  // 	| C_UNARY_EXPRESSION C_ASSIGNMENT_OPERATOR C_ASSIGNMENT_EXPRESSION
  public static boolean C_ASSIGNMENT_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ASSIGNMENT_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ASSIGNMENT_EXPRESSION, "<c assignment expression>");
    r = C_CONDITIONAL_EXPRESSION(b, l + 1);
    if (!r) r = C_ASSIGNMENT_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_UNARY_EXPRESSION C_ASSIGNMENT_OPERATOR C_ASSIGNMENT_EXPRESSION
  private static boolean C_ASSIGNMENT_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ASSIGNMENT_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_UNARY_EXPRESSION(b, l + 1);
    r = r && C_ASSIGNMENT_OPERATOR(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_EQ_SIGN	| C_MUL_ASSIGN | C_DIV_ASSIGN | C_MOD_ASSIGN | C_ADD_ASSIGN
  // 	| C_SUB_ASSIGN | C_LEFT_ASSIGN | C_RIGHT_ASSIGN | C_AND_ASSIGN | C_XOR_ASSIGN | C_OR_ASSIGN
  public static boolean C_ASSIGNMENT_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ASSIGNMENT_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ASSIGNMENT_OPERATOR, "<c assignment operator>");
    r = consumeToken(b, C_EQ_SIGN);
    if (!r) r = consumeToken(b, C_MUL_ASSIGN);
    if (!r) r = consumeToken(b, C_DIV_ASSIGN);
    if (!r) r = consumeToken(b, C_MOD_ASSIGN);
    if (!r) r = consumeToken(b, C_ADD_ASSIGN);
    if (!r) r = consumeToken(b, C_SUB_ASSIGN);
    if (!r) r = consumeToken(b, C_LEFT_ASSIGN);
    if (!r) r = consumeToken(b, C_RIGHT_ASSIGN);
    if (!r) r = consumeToken(b, C_AND_ASSIGN);
    if (!r) r = consumeToken(b, C_XOR_ASSIGN);
    if (!r) r = consumeToken(b, C_OR_ASSIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_ATOMIC C_L_PAREN C_TYPE_NAME C_R_PAREN
  public static boolean C_ATOMIC_TYPE_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ATOMIC_TYPE_SPECIFIER")) return false;
    if (!nextTokenIs(b, C_ATOMIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ATOMIC, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, C_ATOMIC_TYPE_SPECIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATION | C_STATEMENT
  public static boolean C_BLOCK_ITEM(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_BLOCK_ITEM")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_BLOCK_ITEM, "<c block item>");
    r = C_DECLARATION(b, l + 1);
    if (!r) r = C_STATEMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_BLOCK_ITEM | C_BLOCK_ITEM_LIST C_BLOCK_ITEM
  public static boolean C_BLOCK_ITEM_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_BLOCK_ITEM_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_BLOCK_ITEM_LIST, "<c block item list>");
    r = C_BLOCK_ITEM(b, l + 1);
    if (!r) r = C_BLOCK_ITEM_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_BLOCK_ITEM_LIST C_BLOCK_ITEM
  private static boolean C_BLOCK_ITEM_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_BLOCK_ITEM_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_BLOCK_ITEM_LIST(b, l + 1);
    r = r && C_BLOCK_ITEM(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_UNARY_EXPRESSION | C_L_PAREN C_TYPE_NAME C_R_PAREN C_CAST_EXPRESSION
  public static boolean C_CAST_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CAST_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_CAST_EXPRESSION, "<c cast expression>");
    r = C_UNARY_EXPRESSION(b, l + 1);
    if (!r) r = C_CAST_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_PAREN C_TYPE_NAME C_R_PAREN C_CAST_EXPRESSION
  private static boolean C_CAST_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CAST_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_CAST_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_L_CURLY C_R_CURLY
  // 	| C_L_CURLY  C_BLOCK_ITEM_LIST C_R_CURLY
  public static boolean C_COMPOUND_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_COMPOUND_STATEMENT")) return false;
    if (!nextTokenIs(b, C_L_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, C_L_CURLY, C_R_CURLY);
    if (!r) r = C_COMPOUND_STATEMENT_1(b, l + 1);
    exit_section_(b, m, C_COMPOUND_STATEMENT, r);
    return r;
  }

  // C_L_CURLY  C_BLOCK_ITEM_LIST C_R_CURLY
  private static boolean C_COMPOUND_STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_COMPOUND_STATEMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_CURLY);
    r = r && C_BLOCK_ITEM_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_LOGICAL_OR_EXPRESSION
  // 	| C_LOGICAL_OR_EXPRESSION C_QU_MARK C_EXPRESSION C_COLON C_CONDITIONAL_EXPRESSION
  public static boolean C_CONDITIONAL_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CONDITIONAL_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_CONDITIONAL_EXPRESSION, "<c conditional expression>");
    r = C_LOGICAL_OR_EXPRESSION(b, l + 1);
    if (!r) r = C_CONDITIONAL_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_LOGICAL_OR_EXPRESSION C_QU_MARK C_EXPRESSION C_COLON C_CONDITIONAL_EXPRESSION
  private static boolean C_CONDITIONAL_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CONDITIONAL_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_LOGICAL_OR_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_QU_MARK);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_COLON);
    r = r && C_CONDITIONAL_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_I_CONSTANT		/* includes character_constant */
  // 	| C_F_CONSTANT | C_ENUMERATION_CONSTANT
  public static boolean C_CONSTANT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CONSTANT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_CONSTANT, "<c constant>");
    r = consumeToken(b, C_I_CONSTANT);
    if (!r) r = consumeToken(b, C_F_CONSTANT);
    if (!r) r = C_ENUMERATION_CONSTANT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_CONDITIONAL_EXPRESSION
  public static boolean C_CONSTANT_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_CONSTANT_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_CONSTANT_EXPRESSION, "<c constant expression>");
    r = C_CONDITIONAL_EXPRESSION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATION_SPECIFIERS C_SEMICOLON
  // 	| C_DECLARATION_SPECIFIERS C_INIT_DECLARATOR_LIST C_SEMICOLON
  // 	| C_STATIC_ASSERT_DECLARATION
  public static boolean C_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DECLARATION, "<c declaration>");
    r = C_DECLARATION_0(b, l + 1);
    if (!r) r = C_DECLARATION_1(b, l + 1);
    if (!r) r = C_STATIC_ASSERT_DECLARATION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_SEMICOLON
  private static boolean C_DECLARATION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_INIT_DECLARATOR_LIST C_SEMICOLON
  private static boolean C_DECLARATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && C_INIT_DECLARATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATION | C_DECLARATION_LIST C_DECLARATION
  public static boolean C_DECLARATION_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DECLARATION_LIST, "<c declaration list>");
    r = C_DECLARATION(b, l + 1);
    if (!r) r = C_DECLARATION_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DECLARATION_LIST C_DECLARATION
  private static boolean C_DECLARATION_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_LIST(b, l + 1);
    r = r && C_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_STORAGE_CLASS_SPECIFIER C_DECLARATION_SPECIFIERS
  // 	| C_STORAGE_CLASS_SPECIFIER
  // 	| C_TYPE_SPECIFIER C_DECLARATION_SPECIFIERS
  // 	| C_TYPE_SPECIFIER
  // 	| C_TYPE_QUALIFIER C_DECLARATION_SPECIFIERS
  // 	| C_TYPE_QUALIFIER
  // 	| C_FUNCTION_SPECIFIER C_DECLARATION_SPECIFIERS
  // 	| C_FUNCTION_SPECIFIER
  // 	| C_ALIGNMENT_SPECIFIER C_DECLARATION_SPECIFIERS
  // 	| C_ALIGNMENT_SPECIFIER
  public static boolean C_DECLARATION_SPECIFIERS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DECLARATION_SPECIFIERS, "<c declaration specifiers>");
    r = C_DECLARATION_SPECIFIERS_0(b, l + 1);
    if (!r) r = C_STORAGE_CLASS_SPECIFIER(b, l + 1);
    if (!r) r = C_DECLARATION_SPECIFIERS_2(b, l + 1);
    if (!r) r = C_TYPE_SPECIFIER(b, l + 1);
    if (!r) r = C_DECLARATION_SPECIFIERS_4(b, l + 1);
    if (!r) r = C_TYPE_QUALIFIER(b, l + 1);
    if (!r) r = C_DECLARATION_SPECIFIERS_6(b, l + 1);
    if (!r) r = C_FUNCTION_SPECIFIER(b, l + 1);
    if (!r) r = C_DECLARATION_SPECIFIERS_8(b, l + 1);
    if (!r) r = C_ALIGNMENT_SPECIFIER(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_STORAGE_CLASS_SPECIFIER C_DECLARATION_SPECIFIERS
  private static boolean C_DECLARATION_SPECIFIERS_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STORAGE_CLASS_SPECIFIER(b, l + 1);
    r = r && C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_TYPE_SPECIFIER C_DECLARATION_SPECIFIERS
  private static boolean C_DECLARATION_SPECIFIERS_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_SPECIFIER(b, l + 1);
    r = r && C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_TYPE_QUALIFIER C_DECLARATION_SPECIFIERS
  private static boolean C_DECLARATION_SPECIFIERS_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_QUALIFIER(b, l + 1);
    r = r && C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_FUNCTION_SPECIFIER C_DECLARATION_SPECIFIERS
  private static boolean C_DECLARATION_SPECIFIERS_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_FUNCTION_SPECIFIER(b, l + 1);
    r = r && C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ALIGNMENT_SPECIFIER C_DECLARATION_SPECIFIERS
  private static boolean C_DECLARATION_SPECIFIERS_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATION_SPECIFIERS_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ALIGNMENT_SPECIFIER(b, l + 1);
    r = r && C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_POINTER C_DIRECT_DECLARATOR | C_DIRECT_DECLARATOR
  public static boolean C_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DECLARATOR, "<c declarator>");
    r = C_DECLARATOR_0(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_POINTER C_DIRECT_DECLARATOR
  private static boolean C_DECLARATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DECLARATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POINTER(b, l + 1);
    r = r && C_DIRECT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DESIGNATOR_LIST C_EQ_SIGN
  public static boolean C_DESIGNATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DESIGNATION")) return false;
    if (!nextTokenIs(b, "<c designation>", C_DOT, C_L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DESIGNATION, "<c designation>");
    r = C_DESIGNATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_EQ_SIGN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_L_BRACKET C_CONSTANT_EXPRESSION C_R_BRACKET | C_DOT C_IDENTIFIER
  public static boolean C_DESIGNATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DESIGNATOR")) return false;
    if (!nextTokenIs(b, "<c designator>", C_DOT, C_L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DESIGNATOR, "<c designator>");
    r = C_DESIGNATOR_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, C_DOT, C_IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_BRACKET C_CONSTANT_EXPRESSION C_R_BRACKET
  private static boolean C_DESIGNATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DESIGNATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_BRACKET);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DESIGNATOR | C_DESIGNATOR_LIST C_DESIGNATOR
  public static boolean C_DESIGNATOR_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DESIGNATOR_LIST")) return false;
    if (!nextTokenIs(b, "<c designator list>", C_DOT, C_L_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DESIGNATOR_LIST, "<c designator list>");
    r = C_DESIGNATOR(b, l + 1);
    if (!r) r = C_DESIGNATOR_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DESIGNATOR_LIST C_DESIGNATOR
  private static boolean C_DESIGNATOR_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DESIGNATOR_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DESIGNATOR_LIST(b, l + 1);
    r = r && C_DESIGNATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_L_PAREN C_ABSTRACT_DECLARATOR C_R_PAREN
  // 	| C_L_BRACKET C_R_BRACKET
  // 	| C_L_BRACKET C_MULT C_R_BRACKET
  // 	| C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  // 	| C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_MULT C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_L_PAREN C_R_PAREN
  // 	| C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_PAREN C_R_PAREN
  // 	| C_DIRECT_ABSTRACT_DECLARATOR C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  public static boolean C_DIRECT_ABSTRACT_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR")) return false;
    if (!nextTokenIs(b, "<c direct abstract declarator>", C_L_BRACKET, C_L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DIRECT_ABSTRACT_DECLARATOR, "<c direct abstract declarator>");
    r = C_DIRECT_ABSTRACT_DECLARATOR_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, C_L_BRACKET, C_R_BRACKET);
    if (!r) r = parseTokens(b, 0, C_L_BRACKET, C_MULT, C_R_BRACKET);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_3(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_4(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_5(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_6(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_7(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_8(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_9(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_10(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_11(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_12(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_13(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_14(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_15(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_16(b, l + 1);
    if (!r) r = parseTokens(b, 0, C_L_PAREN, C_R_PAREN);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_18(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_19(b, l + 1);
    if (!r) r = C_DIRECT_ABSTRACT_DECLARATOR_20(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_PAREN C_ABSTRACT_DECLARATOR C_R_PAREN
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_BRACKET);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_MULT C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_MULT, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_PARAMETER_TYPE_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_PAREN C_R_PAREN
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_PAREN, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_ABSTRACT_DECLARATOR C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  private static boolean C_DIRECT_ABSTRACT_DECLARATOR_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_ABSTRACT_DECLARATOR_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_ABSTRACT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_PAREN);
    r = r && C_PARAMETER_TYPE_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_IDENTIFIER
  // 	| C_L_PAREN C_DECLARATOR C_R_PAREN
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_MULT C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_MULT C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  // 	| C_DIRECT_DECLARATOR C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  // 	| C_DIRECT_DECLARATOR C_L_PAREN C_R_PAREN
  // 	| C_DIRECT_DECLARATOR C_L_PAREN C_IDENTIFIER_LIST C_R_PAREN
  public static boolean C_DIRECT_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR")) return false;
    if (!nextTokenIs(b, "<c direct declarator>", C_IDENTIFIER, C_L_PAREN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_DIRECT_DECLARATOR, "<c direct declarator>");
    r = consumeToken(b, C_IDENTIFIER);
    if (!r) r = C_DIRECT_DECLARATOR_1(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_2(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_3(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_4(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_5(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_6(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_7(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_8(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_9(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_10(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_11(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_12(b, l + 1);
    if (!r) r = C_DIRECT_DECLARATOR_13(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_PAREN C_DECLARATOR C_R_PAREN
  private static boolean C_DIRECT_DECLARATOR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_MULT C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_MULT, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_STATIC C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_BRACKET, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_MULT C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_MULT, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_STATIC C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_STATIC);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_TYPE_QUALIFIER_LIST C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_BRACKET C_ASSIGNMENT_EXPRESSION C_R_BRACKET
  private static boolean C_DIRECT_DECLARATOR_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_PAREN C_PARAMETER_TYPE_LIST C_R_PAREN
  private static boolean C_DIRECT_DECLARATOR_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_PAREN);
    r = r && C_PARAMETER_TYPE_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_PAREN C_R_PAREN
  private static boolean C_DIRECT_DECLARATOR_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_PAREN, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DIRECT_DECLARATOR C_L_PAREN C_IDENTIFIER_LIST C_R_PAREN
  private static boolean C_DIRECT_DECLARATOR_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_DIRECT_DECLARATOR_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DIRECT_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_L_PAREN);
    r = r && C_IDENTIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_EXTERNAL_DECLARATION | C_END C_EXTERNAL_DECLARATION
  public static boolean C_END(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_END")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_END, "<c end>");
    r = C_EXTERNAL_DECLARATION(b, l + 1);
    if (!r) r = C_END_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_END C_EXTERNAL_DECLARATION
  private static boolean C_END_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_END_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_END(b, l + 1);
    r = r && C_EXTERNAL_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_IDENTIFIER
  public static boolean C_ENUMERATION_CONSTANT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUMERATION_CONSTANT")) return false;
    if (!nextTokenIs(b, C_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_IDENTIFIER);
    exit_section_(b, m, C_ENUMERATION_CONSTANT, r);
    return r;
  }

  /* ********************************************************** */
  // C_ENUMERATION_CONSTANT C_EQ_SIGN C_CONSTANT_EXPRESSION	| C_ENUMERATION_CONSTANT
  public static boolean C_ENUMERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUMERATOR")) return false;
    if (!nextTokenIs(b, C_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ENUMERATOR_0(b, l + 1);
    if (!r) r = C_ENUMERATION_CONSTANT(b, l + 1);
    exit_section_(b, m, C_ENUMERATOR, r);
    return r;
  }

  // C_ENUMERATION_CONSTANT C_EQ_SIGN C_CONSTANT_EXPRESSION
  private static boolean C_ENUMERATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUMERATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ENUMERATION_CONSTANT(b, l + 1);
    r = r && consumeToken(b, C_EQ_SIGN);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ENUMERATOR | C_ENUMERATOR_LIST C_COMMA C_ENUMERATOR
  public static boolean C_ENUMERATOR_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUMERATOR_LIST")) return false;
    if (!nextTokenIs(b, C_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ENUMERATOR(b, l + 1);
    if (!r) r = C_ENUMERATOR_LIST_1(b, l + 1);
    exit_section_(b, m, C_ENUMERATOR_LIST, r);
    return r;
  }

  // C_ENUMERATOR_LIST C_COMMA C_ENUMERATOR
  private static boolean C_ENUMERATOR_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUMERATOR_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ENUMERATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_ENUMERATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ENUM C_L_CURLY C_ENUMERATOR_LIST C_R_CURLY
  // 	| C_ENUM C_L_CURLY C_ENUMERATOR_LIST C_COMMA C_R_CURLY
  // 	| C_ENUM C_IDENTIFIER C_L_CURLY C_ENUMERATOR_LIST C_R_CURLY
  // 	| C_ENUM C_IDENTIFIER C_L_CURLY C_ENUMERATOR_LIST C_COMMA C_R_CURLY
  // 	| C_ENUM C_IDENTIFIER
  public static boolean C_ENUM_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUM_SPECIFIER")) return false;
    if (!nextTokenIs(b, C_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_ENUM_SPECIFIER_0(b, l + 1);
    if (!r) r = C_ENUM_SPECIFIER_1(b, l + 1);
    if (!r) r = C_ENUM_SPECIFIER_2(b, l + 1);
    if (!r) r = C_ENUM_SPECIFIER_3(b, l + 1);
    if (!r) r = parseTokens(b, 0, C_ENUM, C_IDENTIFIER);
    exit_section_(b, m, C_ENUM_SPECIFIER, r);
    return r;
  }

  // C_ENUM C_L_CURLY C_ENUMERATOR_LIST C_R_CURLY
  private static boolean C_ENUM_SPECIFIER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUM_SPECIFIER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ENUM, C_L_CURLY);
    r = r && C_ENUMERATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ENUM C_L_CURLY C_ENUMERATOR_LIST C_COMMA C_R_CURLY
  private static boolean C_ENUM_SPECIFIER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUM_SPECIFIER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ENUM, C_L_CURLY);
    r = r && C_ENUMERATOR_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ENUM C_IDENTIFIER C_L_CURLY C_ENUMERATOR_LIST C_R_CURLY
  private static boolean C_ENUM_SPECIFIER_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUM_SPECIFIER_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ENUM, C_IDENTIFIER, C_L_CURLY);
    r = r && C_ENUMERATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ENUM C_IDENTIFIER C_L_CURLY C_ENUMERATOR_LIST C_COMMA C_R_CURLY
  private static boolean C_ENUM_SPECIFIER_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ENUM_SPECIFIER_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ENUM, C_IDENTIFIER, C_L_CURLY);
    r = r && C_ENUMERATOR_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_RELATIONAL_EXPRESSION
  // 	| C_EQUALITY_EXPRESSION C_EQ_OP C_RELATIONAL_EXPRESSION
  // 	| C_EQUALITY_EXPRESSION C_NE_OP C_RELATIONAL_EXPRESSION
  public static boolean C_EQUALITY_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EQUALITY_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_EQUALITY_EXPRESSION, "<c equality expression>");
    r = C_RELATIONAL_EXPRESSION(b, l + 1);
    if (!r) r = C_EQUALITY_EXPRESSION_1(b, l + 1);
    if (!r) r = C_EQUALITY_EXPRESSION_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_EQUALITY_EXPRESSION C_EQ_OP C_RELATIONAL_EXPRESSION
  private static boolean C_EQUALITY_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EQUALITY_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_EQUALITY_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_EQ_OP);
    r = r && C_RELATIONAL_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_EQUALITY_EXPRESSION C_NE_OP C_RELATIONAL_EXPRESSION
  private static boolean C_EQUALITY_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EQUALITY_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_EQUALITY_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_NE_OP);
    r = r && C_RELATIONAL_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_AND_EXPRESSION
  // 	| C_EXCLUSIVE_OR_EXPRESSION C_CARET C_AND_EXPRESSION
  public static boolean C_EXCLUSIVE_OR_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXCLUSIVE_OR_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_EXCLUSIVE_OR_EXPRESSION, "<c exclusive or expression>");
    r = C_AND_EXPRESSION(b, l + 1);
    if (!r) r = C_EXCLUSIVE_OR_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_EXCLUSIVE_OR_EXPRESSION C_CARET C_AND_EXPRESSION
  private static boolean C_EXCLUSIVE_OR_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXCLUSIVE_OR_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_EXCLUSIVE_OR_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_CARET);
    r = r && C_AND_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ASSIGNMENT_EXPRESSION | C_EXPRESSION C_COMMA C_ASSIGNMENT_EXPRESSION
  public static boolean C_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_EXPRESSION, "<c expression>");
    r = C_ASSIGNMENT_EXPRESSION(b, l + 1);
    if (!r) r = C_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_EXPRESSION C_COMMA C_ASSIGNMENT_EXPRESSION
  private static boolean C_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_SEMICOLON | C_EXPRESSION C_SEMICOLON
  public static boolean C_EXPRESSION_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXPRESSION_STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_EXPRESSION_STATEMENT, "<c expression statement>");
    r = consumeToken(b, C_SEMICOLON);
    if (!r) r = C_EXPRESSION_STATEMENT_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_EXPRESSION C_SEMICOLON
  private static boolean C_EXPRESSION_STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXPRESSION_STATEMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_FUNCTION_DEFINITION | C_DECLARATION
  public static boolean C_EXTERNAL_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_EXTERNAL_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_EXTERNAL_DECLARATION, "<c external declaration>");
    r = C_FUNCTION_DEFINITION(b, l + 1);
    if (!r) r = C_DECLARATION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATION_SPECIFIERS C_DECLARATOR C_DECLARATION_LIST C_COMPOUND_STATEMENT
  // 	| C_DECLARATION_SPECIFIERS C_DECLARATOR C_COMPOUND_STATEMENT
  public static boolean C_FUNCTION_DEFINITION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_FUNCTION_DEFINITION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_FUNCTION_DEFINITION, "<c function definition>");
    r = C_FUNCTION_DEFINITION_0(b, l + 1);
    if (!r) r = C_FUNCTION_DEFINITION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_DECLARATOR C_DECLARATION_LIST C_COMPOUND_STATEMENT
  private static boolean C_FUNCTION_DEFINITION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_FUNCTION_DEFINITION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && C_DECLARATOR(b, l + 1);
    r = r && C_DECLARATION_LIST(b, l + 1);
    r = r && C_COMPOUND_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_DECLARATOR C_COMPOUND_STATEMENT
  private static boolean C_FUNCTION_DEFINITION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_FUNCTION_DEFINITION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && C_DECLARATOR(b, l + 1);
    r = r && C_COMPOUND_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_INLINE | C_NORETURN
  public static boolean C_FUNCTION_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_FUNCTION_SPECIFIER")) return false;
    if (!nextTokenIs(b, "<c function specifier>", C_INLINE, C_NORETURN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_FUNCTION_SPECIFIER, "<c function specifier>");
    r = consumeToken(b, C_INLINE);
    if (!r) r = consumeToken(b, C_NORETURN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_TYPE_NAME C_COLON C_ASSIGNMENT_EXPRESSION
  // 	| C_DEFAULT C_COLON C_ASSIGNMENT_EXPRESSION
  public static boolean C_GENERIC_ASSOCIATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_ASSOCIATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_GENERIC_ASSOCIATION, "<c generic association>");
    r = C_GENERIC_ASSOCIATION_0(b, l + 1);
    if (!r) r = C_GENERIC_ASSOCIATION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_TYPE_NAME C_COLON C_ASSIGNMENT_EXPRESSION
  private static boolean C_GENERIC_ASSOCIATION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_ASSOCIATION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_COLON);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DEFAULT C_COLON C_ASSIGNMENT_EXPRESSION
  private static boolean C_GENERIC_ASSOCIATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_ASSOCIATION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_DEFAULT, C_COLON);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_GENERIC_ASSOCIATION	| C_GENERIC_ASSOC_LIST C_COMMA C_GENERIC_ASSOCIATION
  public static boolean C_GENERIC_ASSOC_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_ASSOC_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_GENERIC_ASSOC_LIST, "<c generic assoc list>");
    r = C_GENERIC_ASSOCIATION(b, l + 1);
    if (!r) r = C_GENERIC_ASSOC_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_GENERIC_ASSOC_LIST C_COMMA C_GENERIC_ASSOCIATION
  private static boolean C_GENERIC_ASSOC_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_ASSOC_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_GENERIC_ASSOC_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_GENERIC_ASSOCIATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_GENERIC C_L_PAREN C_ASSIGNMENT_EXPRESSION C_COMMA C_GENERIC_ASSOC_LIST C_R_PAREN
  public static boolean C_GENERIC_SELECTION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_GENERIC_SELECTION")) return false;
    if (!nextTokenIs(b, C_GENERIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_GENERIC, C_L_PAREN);
    r = r && C_ASSIGNMENT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_GENERIC_ASSOC_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, C_GENERIC_SELECTION, r);
    return r;
  }

  /* ********************************************************** */
  // C_IDENTIFIER | C_IDENTIFIER_LIST C_COMMA C_IDENTIFIER
  public static boolean C_IDENTIFIER_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_IDENTIFIER_LIST")) return false;
    if (!nextTokenIs(b, C_IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_IDENTIFIER);
    if (!r) r = C_IDENTIFIER_LIST_1(b, l + 1);
    exit_section_(b, m, C_IDENTIFIER_LIST, r);
    return r;
  }

  // C_IDENTIFIER_LIST C_COMMA C_IDENTIFIER
  private static boolean C_IDENTIFIER_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_IDENTIFIER_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_IDENTIFIER_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_EXCLUSIVE_OR_EXPRESSION
  // 	| C_INCLUSIVE_OR_EXPRESSION C_VBAR C_EXCLUSIVE_OR_EXPRESSION
  public static boolean C_INCLUSIVE_OR_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INCLUSIVE_OR_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_INCLUSIVE_OR_EXPRESSION, "<c inclusive or expression>");
    r = C_EXCLUSIVE_OR_EXPRESSION(b, l + 1);
    if (!r) r = C_INCLUSIVE_OR_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_INCLUSIVE_OR_EXPRESSION C_VBAR C_EXCLUSIVE_OR_EXPRESSION
  private static boolean C_INCLUSIVE_OR_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INCLUSIVE_OR_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_INCLUSIVE_OR_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_VBAR);
    r = r && C_EXCLUSIVE_OR_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_L_CURLY C_INITIALIZER_LIST C_R_CURLY
  // 	| C_L_CURLY C_INITIALIZER_LIST C_COMMA C_R_CURLY
  // 	| C_ASSIGNMENT_EXPRESSION
  public static boolean C_INITIALIZER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_INITIALIZER, "<c initializer>");
    r = C_INITIALIZER_0(b, l + 1);
    if (!r) r = C_INITIALIZER_1(b, l + 1);
    if (!r) r = C_ASSIGNMENT_EXPRESSION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_CURLY C_INITIALIZER_LIST C_R_CURLY
  private static boolean C_INITIALIZER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_CURLY);
    r = r && C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_CURLY C_INITIALIZER_LIST C_COMMA C_R_CURLY
  private static boolean C_INITIALIZER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_CURLY);
    r = r && C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DESIGNATION C_INITIALIZER
  //     | C_INITIALIZER
  // 	| C_INITIALIZER_LIST C_COMMA C_DESIGNATION C_INITIALIZER
  // 	| C_INITIALIZER_LIST C_COMMA C_INITIALIZER
  public static boolean C_INITIALIZER_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_INITIALIZER_LIST, "<c initializer list>");
    r = C_INITIALIZER_LIST_0(b, l + 1);
    if (!r) r = C_INITIALIZER(b, l + 1);
    if (!r) r = C_INITIALIZER_LIST_2(b, l + 1);
    if (!r) r = C_INITIALIZER_LIST_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DESIGNATION C_INITIALIZER
  private static boolean C_INITIALIZER_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DESIGNATION(b, l + 1);
    r = r && C_INITIALIZER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_INITIALIZER_LIST C_COMMA C_DESIGNATION C_INITIALIZER
  private static boolean C_INITIALIZER_LIST_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_LIST_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_DESIGNATION(b, l + 1);
    r = r && C_INITIALIZER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_INITIALIZER_LIST C_COMMA C_INITIALIZER
  private static boolean C_INITIALIZER_LIST_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INITIALIZER_LIST_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_INITIALIZER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATOR C_EQ_SIGN C_INITIALIZER | C_DECLARATOR
  public static boolean C_INIT_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INIT_DECLARATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_INIT_DECLARATOR, "<c init declarator>");
    r = C_INIT_DECLARATOR_0(b, l + 1);
    if (!r) r = C_DECLARATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DECLARATOR C_EQ_SIGN C_INITIALIZER
  private static boolean C_INIT_DECLARATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INIT_DECLARATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_EQ_SIGN);
    r = r && C_INITIALIZER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_INIT_DECLARATOR | C_INIT_DECLARATOR_LIST C_COMMA C_INIT_DECLARATOR
  public static boolean C_INIT_DECLARATOR_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INIT_DECLARATOR_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_INIT_DECLARATOR_LIST, "<c init declarator list>");
    r = C_INIT_DECLARATOR(b, l + 1);
    if (!r) r = C_INIT_DECLARATOR_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_INIT_DECLARATOR_LIST C_COMMA C_INIT_DECLARATOR
  private static boolean C_INIT_DECLARATOR_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_INIT_DECLARATOR_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_INIT_DECLARATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_INIT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_WHILE C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  // 	| C_DO C_STATEMENT C_WHILE C_L_PAREN C_EXPRESSION C_R_PAREN C_SEMICOLON
  // 	| C_FOR C_L_PAREN C_EXPRESSION_STATEMENT C_EXPRESSION_STATEMENT C_R_PAREN C_STATEMENT
  // 	| C_FOR C_L_PAREN C_EXPRESSION_STATEMENT C_EXPRESSION_STATEMENT C_EXPRESSION C_R_PAREN C_STATEMENT
  // 	| C_FOR C_L_PAREN C_DECLARATION C_EXPRESSION_STATEMENT C_R_PAREN C_STATEMENT
  // 	| C_FOR C_L_PAREN C_DECLARATION C_EXPRESSION_STATEMENT C_EXPRESSION C_R_PAREN C_STATEMENT
  public static boolean C_ITERATION_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_ITERATION_STATEMENT, "<c iteration statement>");
    r = C_ITERATION_STATEMENT_0(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT_1(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT_2(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT_3(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT_4(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_WHILE C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  private static boolean C_ITERATION_STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_WHILE, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DO C_STATEMENT C_WHILE C_L_PAREN C_EXPRESSION C_R_PAREN C_SEMICOLON
  private static boolean C_ITERATION_STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_DO);
    r = r && C_STATEMENT(b, l + 1);
    r = r && consumeTokens(b, 0, C_WHILE, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeTokens(b, 0, C_R_PAREN, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_FOR C_L_PAREN C_EXPRESSION_STATEMENT C_EXPRESSION_STATEMENT C_R_PAREN C_STATEMENT
  private static boolean C_ITERATION_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_FOR, C_L_PAREN);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_FOR C_L_PAREN C_EXPRESSION_STATEMENT C_EXPRESSION_STATEMENT C_EXPRESSION C_R_PAREN C_STATEMENT
  private static boolean C_ITERATION_STATEMENT_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_FOR, C_L_PAREN);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_FOR C_L_PAREN C_DECLARATION C_EXPRESSION_STATEMENT C_R_PAREN C_STATEMENT
  private static boolean C_ITERATION_STATEMENT_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_FOR, C_L_PAREN);
    r = r && C_DECLARATION(b, l + 1);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_FOR C_L_PAREN C_DECLARATION C_EXPRESSION_STATEMENT C_EXPRESSION C_R_PAREN C_STATEMENT
  private static boolean C_ITERATION_STATEMENT_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_ITERATION_STATEMENT_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_FOR, C_L_PAREN);
    r = r && C_DECLARATION(b, l + 1);
    r = r && C_EXPRESSION_STATEMENT(b, l + 1);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_GOTO C_IDENTIFIER C_SEMICOLON
  // 	| C_CONTINUE C_SEMICOLON
  // 	| C_BREAK C_SEMICOLON
  // 	| C_RETURN C_SEMICOLON
  // 	| C_RETURN C_EXPRESSION C_SEMICOLON
  public static boolean C_JUMP_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_JUMP_STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_JUMP_STATEMENT, "<c jump statement>");
    r = parseTokens(b, 0, C_GOTO, C_IDENTIFIER, C_SEMICOLON);
    if (!r) r = parseTokens(b, 0, C_CONTINUE, C_SEMICOLON);
    if (!r) r = parseTokens(b, 0, C_BREAK, C_SEMICOLON);
    if (!r) r = parseTokens(b, 0, C_RETURN, C_SEMICOLON);
    if (!r) r = C_JUMP_STATEMENT_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_RETURN C_EXPRESSION C_SEMICOLON
  private static boolean C_JUMP_STATEMENT_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_JUMP_STATEMENT_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_RETURN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_IDENTIFIER C_COLON C_STATEMENT
  // 	| C_CASE C_CONSTANT_EXPRESSION C_COLON C_STATEMENT
  // 	| C_DEFAULT C_COLON C_STATEMENT
  public static boolean C_LABELED_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LABELED_STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_LABELED_STATEMENT, "<c labeled statement>");
    r = C_LABELED_STATEMENT_0(b, l + 1);
    if (!r) r = C_LABELED_STATEMENT_1(b, l + 1);
    if (!r) r = C_LABELED_STATEMENT_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_IDENTIFIER C_COLON C_STATEMENT
  private static boolean C_LABELED_STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LABELED_STATEMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_IDENTIFIER, C_COLON);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_CASE C_CONSTANT_EXPRESSION C_COLON C_STATEMENT
  private static boolean C_LABELED_STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LABELED_STATEMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_CASE);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_COLON);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DEFAULT C_COLON C_STATEMENT
  private static boolean C_LABELED_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LABELED_STATEMENT_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_DEFAULT, C_COLON);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_INCLUSIVE_OR_EXPRESSION
  // 	| C_LOGICAL_AND_EXPRESSION C_AND_OP C_INCLUSIVE_OR_EXPRESSION
  public static boolean C_LOGICAL_AND_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LOGICAL_AND_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_LOGICAL_AND_EXPRESSION, "<c logical and expression>");
    r = C_INCLUSIVE_OR_EXPRESSION(b, l + 1);
    if (!r) r = C_LOGICAL_AND_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_LOGICAL_AND_EXPRESSION C_AND_OP C_INCLUSIVE_OR_EXPRESSION
  private static boolean C_LOGICAL_AND_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LOGICAL_AND_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_LOGICAL_AND_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_AND_OP);
    r = r && C_INCLUSIVE_OR_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_LOGICAL_AND_EXPRESSION
  // 	| C_LOGICAL_OR_EXPRESSION C_OR_OP C_LOGICAL_AND_EXPRESSION
  public static boolean C_LOGICAL_OR_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LOGICAL_OR_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_LOGICAL_OR_EXPRESSION, "<c logical or expression>");
    r = C_LOGICAL_AND_EXPRESSION(b, l + 1);
    if (!r) r = C_LOGICAL_OR_EXPRESSION_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_LOGICAL_OR_EXPRESSION C_OR_OP C_LOGICAL_AND_EXPRESSION
  private static boolean C_LOGICAL_OR_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_LOGICAL_OR_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_LOGICAL_OR_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_OR_OP);
    r = r && C_LOGICAL_AND_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_CAST_EXPRESSION
  // 	| C_MULTIPLICATIVE_EXPRESSION C_MULT C_CAST_EXPRESSION
  // 	| C_MULTIPLICATIVE_EXPRESSION C_SLASH C_CAST_EXPRESSION
  // 	| C_MULTIPLICATIVE_EXPRESSION C_PERCENT C_CAST_EXPRESSION
  public static boolean C_MULTIPLICATIVE_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_MULTIPLICATIVE_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_MULTIPLICATIVE_EXPRESSION, "<c multiplicative expression>");
    r = C_CAST_EXPRESSION(b, l + 1);
    if (!r) r = C_MULTIPLICATIVE_EXPRESSION_1(b, l + 1);
    if (!r) r = C_MULTIPLICATIVE_EXPRESSION_2(b, l + 1);
    if (!r) r = C_MULTIPLICATIVE_EXPRESSION_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_MULTIPLICATIVE_EXPRESSION C_MULT C_CAST_EXPRESSION
  private static boolean C_MULTIPLICATIVE_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_MULTIPLICATIVE_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_MULT);
    r = r && C_CAST_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_MULTIPLICATIVE_EXPRESSION C_SLASH C_CAST_EXPRESSION
  private static boolean C_MULTIPLICATIVE_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_MULTIPLICATIVE_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_SLASH);
    r = r && C_CAST_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_MULTIPLICATIVE_EXPRESSION C_PERCENT C_CAST_EXPRESSION
  private static boolean C_MULTIPLICATIVE_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_MULTIPLICATIVE_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_MULTIPLICATIVE_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_PERCENT);
    r = r && C_CAST_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_DECLARATION_SPECIFIERS C_DECLARATOR
  // 	| C_DECLARATION_SPECIFIERS C_ABSTRACT_DECLARATOR
  // 	| C_DECLARATION_SPECIFIERS
  public static boolean C_PARAMETER_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_PARAMETER_DECLARATION, "<c parameter declaration>");
    r = C_PARAMETER_DECLARATION_0(b, l + 1);
    if (!r) r = C_PARAMETER_DECLARATION_1(b, l + 1);
    if (!r) r = C_DECLARATION_SPECIFIERS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_DECLARATOR
  private static boolean C_PARAMETER_DECLARATION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_DECLARATION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && C_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DECLARATION_SPECIFIERS C_ABSTRACT_DECLARATOR
  private static boolean C_PARAMETER_DECLARATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_DECLARATION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATION_SPECIFIERS(b, l + 1);
    r = r && C_ABSTRACT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_PARAMETER_DECLARATION | C_PARAMETER_LIST C_COMMA C_PARAMETER_DECLARATION
  public static boolean C_PARAMETER_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_PARAMETER_LIST, "<c parameter list>");
    r = C_PARAMETER_DECLARATION(b, l + 1);
    if (!r) r = C_PARAMETER_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_PARAMETER_LIST C_COMMA C_PARAMETER_DECLARATION
  private static boolean C_PARAMETER_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_PARAMETER_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_PARAMETER_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_PARAMETER_LIST C_COMMA C_ELLIPSIS	| C_PARAMETER_LIST
  public static boolean C_PARAMETER_TYPE_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_TYPE_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_PARAMETER_TYPE_LIST, "<c parameter type list>");
    r = C_PARAMETER_TYPE_LIST_0(b, l + 1);
    if (!r) r = C_PARAMETER_LIST(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_PARAMETER_LIST C_COMMA C_ELLIPSIS
  private static boolean C_PARAMETER_TYPE_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PARAMETER_TYPE_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_PARAMETER_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_ELLIPSIS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_MULT C_TYPE_QUALIFIER_LIST C_POINTER
  // 	| C_MULT C_TYPE_QUALIFIER_LIST
  // 	| C_MULT C_POINTER
  // 	| C_MULT
  public static boolean C_POINTER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POINTER")) return false;
    if (!nextTokenIs(b, C_MULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POINTER_0(b, l + 1);
    if (!r) r = C_POINTER_1(b, l + 1);
    if (!r) r = C_POINTER_2(b, l + 1);
    if (!r) r = consumeToken(b, C_MULT);
    exit_section_(b, m, C_POINTER, r);
    return r;
  }

  // C_MULT C_TYPE_QUALIFIER_LIST C_POINTER
  private static boolean C_POINTER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POINTER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_MULT);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_POINTER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_MULT C_TYPE_QUALIFIER_LIST
  private static boolean C_POINTER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POINTER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_MULT);
    r = r && C_TYPE_QUALIFIER_LIST(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_MULT C_POINTER
  private static boolean C_POINTER_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POINTER_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_MULT);
    r = r && C_POINTER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_PRIMARY_EXPRESSION
  // 	| C_POSTFIX_EXPRESSION C_L_BRACKET C_EXPRESSION C_R_BRACKET
  // 	| C_POSTFIX_EXPRESSION C_L_PAREN C_R_PAREN
  // 	| C_POSTFIX_EXPRESSION C_L_PAREN C_ARGUMENT_EXPRESSION_LIST C_R_PAREN
  // 	| C_POSTFIX_EXPRESSION C_DOT C_IDENTIFIER
  // 	| C_POSTFIX_EXPRESSION C_PTR_OP C_IDENTIFIER
  // 	| C_POSTFIX_EXPRESSION C_INC_OP
  // 	| C_POSTFIX_EXPRESSION C_DEC_OP
  // 	| C_L_PAREN C_TYPE_NAME C_R_PAREN C_L_CURLY C_INITIALIZER_LIST C_R_CURLY
  // 	| C_L_PAREN C_TYPE_NAME C_R_PAREN C_L_CURLY C_INITIALIZER_LIST C_COMMA C_R_CURLY
  public static boolean C_POSTFIX_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_POSTFIX_EXPRESSION, "<c postfix expression>");
    r = C_PRIMARY_EXPRESSION(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_1(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_2(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_3(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_4(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_5(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_6(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_7(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_8(b, l + 1);
    if (!r) r = C_POSTFIX_EXPRESSION_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_L_BRACKET C_EXPRESSION C_R_BRACKET
  private static boolean C_POSTFIX_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_L_BRACKET);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_L_PAREN C_R_PAREN
  private static boolean C_POSTFIX_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeTokens(b, 0, C_L_PAREN, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_L_PAREN C_ARGUMENT_EXPRESSION_LIST C_R_PAREN
  private static boolean C_POSTFIX_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_L_PAREN);
    r = r && C_ARGUMENT_EXPRESSION_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_DOT C_IDENTIFIER
  private static boolean C_POSTFIX_EXPRESSION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeTokens(b, 0, C_DOT, C_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_PTR_OP C_IDENTIFIER
  private static boolean C_POSTFIX_EXPRESSION_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeTokens(b, 0, C_PTR_OP, C_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_INC_OP
  private static boolean C_POSTFIX_EXPRESSION_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_INC_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_POSTFIX_EXPRESSION C_DEC_OP
  private static boolean C_POSTFIX_EXPRESSION_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_DEC_OP);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_PAREN C_TYPE_NAME C_R_PAREN C_L_CURLY C_INITIALIZER_LIST C_R_CURLY
  private static boolean C_POSTFIX_EXPRESSION_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeTokens(b, 0, C_R_PAREN, C_L_CURLY);
    r = r && C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_L_PAREN C_TYPE_NAME C_R_PAREN C_L_CURLY C_INITIALIZER_LIST C_COMMA C_R_CURLY
  private static boolean C_POSTFIX_EXPRESSION_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_POSTFIX_EXPRESSION_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeTokens(b, 0, C_R_PAREN, C_L_CURLY);
    r = r && C_INITIALIZER_LIST(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_IDENTIFIER | C_CONSTANT | C_STRING | C_L_PAREN C_EXPRESSION C_R_PAREN | C_GENERIC_SELECTION
  public static boolean C_PRIMARY_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PRIMARY_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_PRIMARY_EXPRESSION, "<c primary expression>");
    r = consumeToken(b, C_IDENTIFIER);
    if (!r) r = C_CONSTANT(b, l + 1);
    if (!r) r = C_STRING(b, l + 1);
    if (!r) r = C_PRIMARY_EXPRESSION_3(b, l + 1);
    if (!r) r = C_GENERIC_SELECTION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_L_PAREN C_EXPRESSION C_R_PAREN
  private static boolean C_PRIMARY_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_PRIMARY_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_SHIFT_EXPRESSION
  // 	| C_RELATIONAL_EXPRESSION C_LESS C_SHIFT_EXPRESSION
  // 	| C_RELATIONAL_EXPRESSION C_GREATER C_SHIFT_EXPRESSION
  // 	| C_RELATIONAL_EXPRESSION C_LE_OP C_SHIFT_EXPRESSION
  // 	| C_RELATIONAL_EXPRESSION C_GE_OP C_SHIFT_EXPRESSION
  public static boolean C_RELATIONAL_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_RELATIONAL_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_RELATIONAL_EXPRESSION, "<c relational expression>");
    r = C_SHIFT_EXPRESSION(b, l + 1);
    if (!r) r = C_RELATIONAL_EXPRESSION_1(b, l + 1);
    if (!r) r = C_RELATIONAL_EXPRESSION_2(b, l + 1);
    if (!r) r = C_RELATIONAL_EXPRESSION_3(b, l + 1);
    if (!r) r = C_RELATIONAL_EXPRESSION_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_RELATIONAL_EXPRESSION C_LESS C_SHIFT_EXPRESSION
  private static boolean C_RELATIONAL_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_RELATIONAL_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_RELATIONAL_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_LESS);
    r = r && C_SHIFT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_RELATIONAL_EXPRESSION C_GREATER C_SHIFT_EXPRESSION
  private static boolean C_RELATIONAL_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_RELATIONAL_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_RELATIONAL_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_GREATER);
    r = r && C_SHIFT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_RELATIONAL_EXPRESSION C_LE_OP C_SHIFT_EXPRESSION
  private static boolean C_RELATIONAL_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_RELATIONAL_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_RELATIONAL_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_LE_OP);
    r = r && C_SHIFT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_RELATIONAL_EXPRESSION C_GE_OP C_SHIFT_EXPRESSION
  private static boolean C_RELATIONAL_EXPRESSION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_RELATIONAL_EXPRESSION_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_RELATIONAL_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_GE_OP);
    r = r && C_SHIFT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_IF C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT C_ELSE C_STATEMENT
  // 	| C_IF C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  // 	| C_SWITCH C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  public static boolean C_SELECTION_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SELECTION_STATEMENT")) return false;
    if (!nextTokenIs(b, "<c selection statement>", C_IF, C_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_SELECTION_STATEMENT, "<c selection statement>");
    r = C_SELECTION_STATEMENT_0(b, l + 1);
    if (!r) r = C_SELECTION_STATEMENT_1(b, l + 1);
    if (!r) r = C_SELECTION_STATEMENT_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_IF C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT C_ELSE C_STATEMENT
  private static boolean C_SELECTION_STATEMENT_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SELECTION_STATEMENT_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_IF, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    r = r && consumeToken(b, C_ELSE);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_IF C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  private static boolean C_SELECTION_STATEMENT_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SELECTION_STATEMENT_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_IF, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_SWITCH C_L_PAREN C_EXPRESSION C_R_PAREN C_STATEMENT
  private static boolean C_SELECTION_STATEMENT_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SELECTION_STATEMENT_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_SWITCH, C_L_PAREN);
    r = r && C_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    r = r && C_STATEMENT(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_ADDITIVE_EXPRESSION
  // 	| C_SHIFT_EXPRESSION C_LEFT_OP C_ADDITIVE_EXPRESSION
  // 	| C_SHIFT_EXPRESSION C_RIGHT_OP C_ADDITIVE_EXPRESSION
  public static boolean C_SHIFT_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SHIFT_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_SHIFT_EXPRESSION, "<c shift expression>");
    r = C_ADDITIVE_EXPRESSION(b, l + 1);
    if (!r) r = C_SHIFT_EXPRESSION_1(b, l + 1);
    if (!r) r = C_SHIFT_EXPRESSION_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_SHIFT_EXPRESSION C_LEFT_OP C_ADDITIVE_EXPRESSION
  private static boolean C_SHIFT_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SHIFT_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_SHIFT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_LEFT_OP);
    r = r && C_ADDITIVE_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_SHIFT_EXPRESSION C_RIGHT_OP C_ADDITIVE_EXPRESSION
  private static boolean C_SHIFT_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SHIFT_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_SHIFT_EXPRESSION(b, l + 1);
    r = r && consumeToken(b, C_RIGHT_OP);
    r = r && C_ADDITIVE_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_TYPE_SPECIFIER C_SPECIFIER_QUALIFIER_LIST
  // 	| C_TYPE_SPECIFIER
  // 	| C_TYPE_QUALIFIER C_SPECIFIER_QUALIFIER_LIST
  // 	| C_TYPE_QUALIFIER
  public static boolean C_SPECIFIER_QUALIFIER_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SPECIFIER_QUALIFIER_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_SPECIFIER_QUALIFIER_LIST, "<c specifier qualifier list>");
    r = C_SPECIFIER_QUALIFIER_LIST_0(b, l + 1);
    if (!r) r = C_TYPE_SPECIFIER(b, l + 1);
    if (!r) r = C_SPECIFIER_QUALIFIER_LIST_2(b, l + 1);
    if (!r) r = C_TYPE_QUALIFIER(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_TYPE_SPECIFIER C_SPECIFIER_QUALIFIER_LIST
  private static boolean C_SPECIFIER_QUALIFIER_LIST_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SPECIFIER_QUALIFIER_LIST_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_SPECIFIER(b, l + 1);
    r = r && C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_TYPE_QUALIFIER C_SPECIFIER_QUALIFIER_LIST
  private static boolean C_SPECIFIER_QUALIFIER_LIST_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_SPECIFIER_QUALIFIER_LIST_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_QUALIFIER(b, l + 1);
    r = r && C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_LABELED_STATEMENT
  // 	| C_COMPOUND_STATEMENT
  // 	| C_EXPRESSION_STATEMENT
  // 	| C_SELECTION_STATEMENT
  // 	| C_ITERATION_STATEMENT
  // 	| C_JUMP_STATEMENT
  public static boolean C_STATEMENT(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STATEMENT")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STATEMENT, "<c statement>");
    r = C_LABELED_STATEMENT(b, l + 1);
    if (!r) r = C_COMPOUND_STATEMENT(b, l + 1);
    if (!r) r = C_EXPRESSION_STATEMENT(b, l + 1);
    if (!r) r = C_SELECTION_STATEMENT(b, l + 1);
    if (!r) r = C_ITERATION_STATEMENT(b, l + 1);
    if (!r) r = C_JUMP_STATEMENT(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_STATIC_ASSERT C_L_PAREN C_CONSTANT_EXPRESSION C_COMMA C_STRING_LITERAL C_R_PAREN C_SEMICOLON
  public static boolean C_STATIC_ASSERT_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STATIC_ASSERT_DECLARATION")) return false;
    if (!nextTokenIs(b, C_STATIC_ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_STATIC_ASSERT, C_L_PAREN);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    r = r && consumeTokens(b, 0, C_COMMA, C_STRING_LITERAL, C_R_PAREN, C_SEMICOLON);
    exit_section_(b, m, C_STATIC_ASSERT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // C_TYPEDEF	/* identifiers must be flagged as C_TYPEDEF_NAME */
  // 	| C_EXTERN | C_STATIC | C_THREAD_LOCAL | C_AUTO	| C_REGISTER
  public static boolean C_STORAGE_CLASS_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STORAGE_CLASS_SPECIFIER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STORAGE_CLASS_SPECIFIER, "<c storage class specifier>");
    r = consumeToken(b, C_TYPEDEF);
    if (!r) r = consumeToken(b, C_EXTERN);
    if (!r) r = consumeToken(b, C_STATIC);
    if (!r) r = consumeToken(b, C_THREAD_LOCAL);
    if (!r) r = consumeToken(b, C_AUTO);
    if (!r) r = consumeToken(b, C_REGISTER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_STRING_LITERAL | C_FUNC_NAME
  public static boolean C_STRING(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRING")) return false;
    if (!nextTokenIs(b, "<c string>", C_FUNC_NAME, C_STRING_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRING, "<c string>");
    r = consumeToken(b, C_STRING_LITERAL);
    if (!r) r = consumeToken(b, C_FUNC_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_SPECIFIER_QUALIFIER_LIST C_SEMICOLON	/* for anonymous struct/union */
  // 	| C_SPECIFIER_QUALIFIER_LIST C_STRUCT_DECLARATOR_LIST C_SEMICOLON
  // 	| C_STATIC_ASSERT_DECLARATION
  public static boolean C_STRUCT_DECLARATION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_DECLARATION, "<c struct declaration>");
    r = C_STRUCT_DECLARATION_0(b, l + 1);
    if (!r) r = C_STRUCT_DECLARATION_1(b, l + 1);
    if (!r) r = C_STATIC_ASSERT_DECLARATION(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_SPECIFIER_QUALIFIER_LIST C_SEMICOLON
  private static boolean C_STRUCT_DECLARATION_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATION_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_SPECIFIER_QUALIFIER_LIST C_STRUCT_DECLARATOR_LIST C_SEMICOLON
  private static boolean C_STRUCT_DECLARATION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    r = r && C_STRUCT_DECLARATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_STRUCT_DECLARATION | C_STRUCT_DECLARATION_LIST C_STRUCT_DECLARATION
  public static boolean C_STRUCT_DECLARATION_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATION_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_DECLARATION_LIST, "<c struct declaration list>");
    r = C_STRUCT_DECLARATION(b, l + 1);
    if (!r) r = C_STRUCT_DECLARATION_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_STRUCT_DECLARATION_LIST C_STRUCT_DECLARATION
  private static boolean C_STRUCT_DECLARATION_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATION_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STRUCT_DECLARATION_LIST(b, l + 1);
    r = r && C_STRUCT_DECLARATION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_COLON C_CONSTANT_EXPRESSION
  // 	| C_DECLARATOR C_COLON C_CONSTANT_EXPRESSION
  // 	| C_DECLARATOR
  public static boolean C_STRUCT_DECLARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_DECLARATOR, "<c struct declarator>");
    r = C_STRUCT_DECLARATOR_0(b, l + 1);
    if (!r) r = C_STRUCT_DECLARATOR_1(b, l + 1);
    if (!r) r = C_DECLARATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_COLON C_CONSTANT_EXPRESSION
  private static boolean C_STRUCT_DECLARATOR_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATOR_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_COLON);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DECLARATOR C_COLON C_CONSTANT_EXPRESSION
  private static boolean C_STRUCT_DECLARATOR_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATOR_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_DECLARATOR(b, l + 1);
    r = r && consumeToken(b, C_COLON);
    r = r && C_CONSTANT_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_STRUCT_DECLARATOR
  // 	| C_STRUCT_DECLARATOR_LIST C_COMMA C_STRUCT_DECLARATOR
  public static boolean C_STRUCT_DECLARATOR_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATOR_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_DECLARATOR_LIST, "<c struct declarator list>");
    r = C_STRUCT_DECLARATOR(b, l + 1);
    if (!r) r = C_STRUCT_DECLARATOR_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_STRUCT_DECLARATOR_LIST C_COMMA C_STRUCT_DECLARATOR
  private static boolean C_STRUCT_DECLARATOR_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_DECLARATOR_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STRUCT_DECLARATOR_LIST(b, l + 1);
    r = r && consumeToken(b, C_COMMA);
    r = r && C_STRUCT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_STRUCT | C_UNION
  public static boolean C_STRUCT_OR_UNION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_OR_UNION")) return false;
    if (!nextTokenIs(b, "<c struct or union>", C_STRUCT, C_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_OR_UNION, "<c struct or union>");
    r = consumeToken(b, C_STRUCT);
    if (!r) r = consumeToken(b, C_UNION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_STRUCT_OR_UNION C_L_CURLY C_STRUCT_DECLARATION_LIST C_R_CURLY
  // 	| C_STRUCT_OR_UNION C_IDENTIFIER C_L_CURLY C_STRUCT_DECLARATION_LIST C_R_CURLY
  // 	| C_STRUCT_OR_UNION C_IDENTIFIER
  public static boolean C_STRUCT_OR_UNION_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_OR_UNION_SPECIFIER")) return false;
    if (!nextTokenIs(b, "<c struct or union specifier>", C_STRUCT, C_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_STRUCT_OR_UNION_SPECIFIER, "<c struct or union specifier>");
    r = C_STRUCT_OR_UNION_SPECIFIER_0(b, l + 1);
    if (!r) r = C_STRUCT_OR_UNION_SPECIFIER_1(b, l + 1);
    if (!r) r = C_STRUCT_OR_UNION_SPECIFIER_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_STRUCT_OR_UNION C_L_CURLY C_STRUCT_DECLARATION_LIST C_R_CURLY
  private static boolean C_STRUCT_OR_UNION_SPECIFIER_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_OR_UNION_SPECIFIER_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STRUCT_OR_UNION(b, l + 1);
    r = r && consumeToken(b, C_L_CURLY);
    r = r && C_STRUCT_DECLARATION_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_STRUCT_OR_UNION C_IDENTIFIER C_L_CURLY C_STRUCT_DECLARATION_LIST C_R_CURLY
  private static boolean C_STRUCT_OR_UNION_SPECIFIER_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_OR_UNION_SPECIFIER_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STRUCT_OR_UNION(b, l + 1);
    r = r && consumeTokens(b, 0, C_IDENTIFIER, C_L_CURLY);
    r = r && C_STRUCT_DECLARATION_LIST(b, l + 1);
    r = r && consumeToken(b, C_R_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_STRUCT_OR_UNION C_IDENTIFIER
  private static boolean C_STRUCT_OR_UNION_SPECIFIER_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_STRUCT_OR_UNION_SPECIFIER_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_STRUCT_OR_UNION(b, l + 1);
    r = r && consumeToken(b, C_IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_SPECIFIER_QUALIFIER_LIST C_ABSTRACT_DECLARATOR | C_SPECIFIER_QUALIFIER_LIST
  public static boolean C_TYPE_NAME(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_NAME")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_TYPE_NAME, "<c type name>");
    r = C_TYPE_NAME_0(b, l + 1);
    if (!r) r = C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_SPECIFIER_QUALIFIER_LIST C_ABSTRACT_DECLARATOR
  private static boolean C_TYPE_NAME_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_NAME_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_SPECIFIER_QUALIFIER_LIST(b, l + 1);
    r = r && C_ABSTRACT_DECLARATOR(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_CONST | C_RESTRICT | C_VOLATILE | C_ATOMIC
  public static boolean C_TYPE_QUALIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_QUALIFIER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_TYPE_QUALIFIER, "<c type qualifier>");
    r = consumeToken(b, C_CONST);
    if (!r) r = consumeToken(b, C_RESTRICT);
    if (!r) r = consumeToken(b, C_VOLATILE);
    if (!r) r = consumeToken(b, C_ATOMIC);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_TYPE_QUALIFIER | C_TYPE_QUALIFIER_LIST C_TYPE_QUALIFIER
  public static boolean C_TYPE_QUALIFIER_LIST(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_QUALIFIER_LIST")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_TYPE_QUALIFIER_LIST, "<c type qualifier list>");
    r = C_TYPE_QUALIFIER(b, l + 1);
    if (!r) r = C_TYPE_QUALIFIER_LIST_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_TYPE_QUALIFIER_LIST C_TYPE_QUALIFIER
  private static boolean C_TYPE_QUALIFIER_LIST_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_QUALIFIER_LIST_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_TYPE_QUALIFIER_LIST(b, l + 1);
    r = r && C_TYPE_QUALIFIER(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_VOID	| C_CHAR | C_SHORT | C_INT | C_LONG	| C_FLOAT | C_DOUBLE
  // 	| C_SIGNED | C_UNSIGNED | C_BOOL | C_COMPLEX | C_IMAGINARY | C_ATOMIC_TYPE_SPECIFIER
  // 	| C_STRUCT_OR_UNION_SPECIFIER | C_ENUM_SPECIFIER | C_TYPEDEF_NAME
  public static boolean C_TYPE_SPECIFIER(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_TYPE_SPECIFIER")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_TYPE_SPECIFIER, "<c type specifier>");
    r = consumeToken(b, C_VOID);
    if (!r) r = consumeToken(b, C_CHAR);
    if (!r) r = consumeToken(b, C_SHORT);
    if (!r) r = consumeToken(b, C_INT);
    if (!r) r = consumeToken(b, C_LONG);
    if (!r) r = consumeToken(b, C_FLOAT);
    if (!r) r = consumeToken(b, C_DOUBLE);
    if (!r) r = consumeToken(b, C_SIGNED);
    if (!r) r = consumeToken(b, C_UNSIGNED);
    if (!r) r = consumeToken(b, C_BOOL);
    if (!r) r = consumeToken(b, C_COMPLEX);
    if (!r) r = consumeToken(b, C_IMAGINARY);
    if (!r) r = C_ATOMIC_TYPE_SPECIFIER(b, l + 1);
    if (!r) r = C_STRUCT_OR_UNION_SPECIFIER(b, l + 1);
    if (!r) r = C_ENUM_SPECIFIER(b, l + 1);
    if (!r) r = consumeToken(b, C_TYPEDEF_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // C_POSTFIX_EXPRESSION
  // 	| C_INC_OP C_UNARY_EXPRESSION
  // 	| C_DEC_OP C_UNARY_EXPRESSION
  // 	| C_UNARY_OPERATOR C_CAST_EXPRESSION
  // 	| C_SIZEOF C_UNARY_EXPRESSION
  // 	| C_SIZEOF C_L_PAREN C_TYPE_NAME C_R_PAREN
  // 	| C_ALIGNOF C_L_PAREN C_TYPE_NAME C_R_PAREN
  public static boolean C_UNARY_EXPRESSION(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_UNARY_EXPRESSION, "<c unary expression>");
    r = C_POSTFIX_EXPRESSION(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_1(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_2(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_3(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_4(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_5(b, l + 1);
    if (!r) r = C_UNARY_EXPRESSION_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // C_INC_OP C_UNARY_EXPRESSION
  private static boolean C_UNARY_EXPRESSION_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_INC_OP);
    r = r && C_UNARY_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_DEC_OP C_UNARY_EXPRESSION
  private static boolean C_UNARY_EXPRESSION_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_DEC_OP);
    r = r && C_UNARY_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_UNARY_OPERATOR C_CAST_EXPRESSION
  private static boolean C_UNARY_EXPRESSION_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = C_UNARY_OPERATOR(b, l + 1);
    r = r && C_CAST_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_SIZEOF C_UNARY_EXPRESSION
  private static boolean C_UNARY_EXPRESSION_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, C_SIZEOF);
    r = r && C_UNARY_EXPRESSION(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_SIZEOF C_L_PAREN C_TYPE_NAME C_R_PAREN
  private static boolean C_UNARY_EXPRESSION_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_SIZEOF, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // C_ALIGNOF C_L_PAREN C_TYPE_NAME C_R_PAREN
  private static boolean C_UNARY_EXPRESSION_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_EXPRESSION_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, C_ALIGNOF, C_L_PAREN);
    r = r && C_TYPE_NAME(b, l + 1);
    r = r && consumeToken(b, C_R_PAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // C_AND | C_MULT	| C_PLUS | C_MINUS | C_TILDE | C_EX_MARK
  public static boolean C_UNARY_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "C_UNARY_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, C_UNARY_OPERATOR, "<c unary operator>");
    r = consumeToken(b, C_AND);
    if (!r) r = consumeToken(b, C_MULT);
    if (!r) r = consumeToken(b, C_PLUS);
    if (!r) r = consumeToken(b, C_MINUS);
    if (!r) r = consumeToken(b, C_TILDE);
    if (!r) r = consumeToken(b, C_EX_MARK);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  // DEF_DEFINITION | COMMENT
  static boolean def_item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "def_item_")) return false;
    boolean r;
    r = DEF_DEFINITION(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

}
