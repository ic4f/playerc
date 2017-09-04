package playerc.abstractsyntax;

/**
 * @author  Sergey Golitsynskiy
 * @version 3.1
 * created  Aug 14 2005
 * modified Sep 04 2017
 */
public class RealExpression extends Expression
{
	private double value;
	
	public RealExpression(double value, int lineNumber)
	{
		super(lineNumber);
		this.value = value;
	}
	
	public double value() { return value; }

	public void accept(Visitor v) { v.visit(this); }
}
