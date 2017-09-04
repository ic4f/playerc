package playerc.abstractsyntax;

/**
 * @author  Sergey Golitsynskiy
 * @version 3.1
 * created  Aug 14 2005
 * modified Sep 04 2017
 */
public class Program extends AbstractSyntaxTree
{
	private Identifier id;
	private DeclarationList decls;
	private StatementList stms;
	
	public Program(Identifier id, DeclarationList decls, StatementList stms, int lineNumber)
	{
		super(lineNumber);
		this.id = id;
		this.decls = decls;
		this.stms = stms;
	}
	
	public Identifier id() { return id; }
	
	public DeclarationList declarations() { return decls; }
	
	public StatementList statements() { return stms; }

	public void accept(Visitor v) { v.visit(this); }
}
