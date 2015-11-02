package ast.arithmetic;

import java.util.Vector;

/**
 * A[a];
 */

public class Array extends ArithExpr {

	private String name;
	private ArithExpr arrayIndexExpression;

	public void ArrayExpr(String name, ArithExpr index) {
		this.name = name;
		this.arrayIndexExpression = index;
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
	public int evaluate() {
		// TODO Auto-generated method stub
		return 0;
	}
}