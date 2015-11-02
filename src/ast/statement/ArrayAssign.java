package ast.statement;

/**
 * A[a1] := a2;
 * 
 */

import java.util.Vector;

import ast.arithmetic.ArithExpr;

public class ArrayAssign extends Statement {

	private String name; // array name
	private ArithExpr arrayExpression; // array index expression
	private ArithExpr valueExpression; // value expression

	public void ArrayAssignStatement(String name, ArithExpr a1, ArithExpr a2) {
		this.name = name;
		this.arrayExpression = a1;
		this.valueExpression = a2;
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