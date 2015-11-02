package ast.statement;

import graphs.Block;

import java.util.Vector;

public abstract class Statement implements Block{

	public abstract void evaluate();
	public abstract Vector<String> getVariables();
	public abstract Vector<String> getArrays();
	public abstract int printWithLabels(int i);
	public int getLabel() {
		return 0;
	}
}