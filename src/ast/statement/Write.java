package ast.statement;

/**
 * write a;
 */

import java.util.Vector;

import ast.arithmetic.ArithExpr;

public class Write extends Statement{
	ArithExpr expression;
	
	public void WriteStatement(ArithExpr expression) {
		this.expression = expression;
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