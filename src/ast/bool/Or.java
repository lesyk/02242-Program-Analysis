package ast.bool;

import java.util.Vector;

public class Or extends BoolExpr {
	
	private BoolExpr expression1;
	private BoolExpr expression2;
	
	public void OrExpr(BoolExpr expression1, BoolExpr expression2) {
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