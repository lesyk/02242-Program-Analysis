package ast.statement;

/**
 * S1 S2
 */

import java.util.Vector;

public class Sequence extends Statement {

	private Statement statement1;
	private Statement statement2;

	public void SeqStatement(Statement statement1, Statement statement2) {
		this.statement1 = statement1;
		this.statement2 = statement2;
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