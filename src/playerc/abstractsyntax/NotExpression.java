package playerc.abstractsyntax;

/**
 * @author  Sergey Golitsynskiy
 * @version 3.1
 * created  May 15 2006
 * modified Sep 04 2017
 */
public class NotExpression extends UnaryOpExpression
{   
	public NotExpression(Expression exp, int lineNumber) 
	{ 
		super(exp, lineNumber);
	}
	
	public void accept(Visitor v) { v.visit(this); }
}
