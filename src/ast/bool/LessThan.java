package ast.bool;

import java.util.Vector;

import ast.arithmetic.ArithExpr;

public class LessThan extends BoolExpr {

	private ArithExpr expression1;
	private ArithExpr expression2;
	
	public void LessThanExpr(ArithExpr expression1, ArithExpr expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public Vector<String> getArrays() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vector<String> getVariables() {
		// TODO Auto-generated method stub
		return null;
	}
}