package ast.statement;

/**
 * read A[a]; 
 */


import java.util.Vector;

import ast.arithmetic.ArithExpr;

public class ReadArray extends Statement {
	String name;
	ArithExpr arrayExpression;

	public void ReadArrayStatement(String name, ArithExpr arrayExpression) {
		this.name = name;
		this.arrayExpression = arrayExpression;
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