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
public abstract class UnaryOpExpression extends Expression {
  public UnaryOpExpression(int lineNumber) {
    super(lineNumber);
  }
}
