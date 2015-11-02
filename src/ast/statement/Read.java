package ast.statement;

/**
 * read x;
 */


import java.util.Vector;

public class Read extends Statement {
	String name; // variable name

	public void ReadStatement(String name) {
		this.name = name;
	}

	@Override
	public Vector<String> getVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<String> getArrays() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int printWithLabels(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		
	}
}