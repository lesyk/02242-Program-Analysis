package ast.statement;

/**
 * while b do S od
 */


import java.util.Vector;

import ast.bool.BoolExpr;

public class While extends Statement {

	private BoolExpr condition;
	private Statement body;
	
	public void WhileStatement(BoolExpr condition, Statement body) {
		this.condition = condition;
		this.body = body;
	}

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		
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
}