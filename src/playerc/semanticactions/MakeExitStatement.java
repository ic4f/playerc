/*
 * This code is part of a compiler for the Player programming language
 * Created: 2004-2005
 * Revised: 09/2017
 */
package playerc.semanticactions;

import java.util.Stack;

import playerc.SemanticAction;
import playerc.Token;
import playerc.abstractsyntax.ExitStatement;

/**
 * @author Sergey Golitsynskiy
 * @version 3.1
 */
public class MakeExitStatement extends SemanticAction {
  private String actionName;

  public MakeExitStatement(String actionName, int lineNumber) {
    super(lineNumber);
    this.actionName = actionName;
  }

  public void execute(Stack semanticStack, Token lastToken) {
    semanticStack.push(new ExitStatement(lineNumber()));
  }

  public String toString() {
    return actionName;
  }
}