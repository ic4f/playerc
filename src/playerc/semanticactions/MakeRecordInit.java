/*
 * This code is part of a compiler for the Player programming language
 * Created: 2004-2005
 * Revised: 09/2017
 */
package playerc.semanticactions;

import java.util.Stack;

import playerc.SemanticAction;
import playerc.Token;
import playerc.abstractsyntax.Expression;
import playerc.abstractsyntax.Identifier;
import playerc.abstractsyntax.RecordInit;

/**
 * @author Sergey Golitsynskiy
 * @version 3.1
 */
public class MakeRecordInit extends SemanticAction {
  private String actionName;

  public MakeRecordInit(String actionName, int lineNumber) {
    super(lineNumber);
    this.actionName = actionName;
  }

  public void execute(Stack semanticStack, Token lastToken) {
    Expression exp = (Expression) semanticStack.pop();
    Identifier id = (Identifier) semanticStack.pop();
    semanticStack.push(new RecordInit(id, exp, lineNumber()));
  }

  public String toString() {
    return actionName;
  }
}