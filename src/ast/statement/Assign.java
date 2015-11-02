package ast.statement;

/**
 * x := a;
 */

import java.util.Vector;

import ast.arithmetic.ArithExpr;

public class Assign extends Statement {

	private String name; // variable name
	private ArithExpr expression; // value expression
	
	public Assign(String name, ArithExpr expression) {
		this.name = name;
		this.expression = expression;
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