package ast.bool;

import graphs.Block;
import java.lang.String;
import java.util.Vector;

public abstract class BoolExpr implements Block{

	public abstract boolean evaluate();	
	public abstract Vector<String> getVariables();
}