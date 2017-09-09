/*
 * This code is part of a compiler for the Player programming language
 * Created: 2004-2005
 * Revised: 09/2017
 */
package playerc.abstractsyntax;

/**
 * @author Sergey Golitsynskiy
 * @version 3.1
 */
public class GreaterEqlExpression extends BinaryOpExpression {
  public GreaterEqlExpression(Expression left, Expression right, int lineNumber) {
    super(left, right, lineNumber);
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
