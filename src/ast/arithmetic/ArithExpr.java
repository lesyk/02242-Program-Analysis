package ast.arithmetic;

import java.util.Vector;

public abstract class ArithExpr {

	public abstract int evaluate();
	public abstract Vector<String> getVariables();
	public abstract Vector<String> getArrays();
	
}