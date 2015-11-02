package ast.arithmetic;

import java.util.Vector;

public class Minus extends ArithExpr {

	private ArithExpr expression1;
	private ArithExpr expression2;
	
	public void MinusExpr(ArithExpr expression1, ArithExpr expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		return 0;
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
}