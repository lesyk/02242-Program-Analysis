package ast.bool;

import java.util.Vector;

public class Not extends BoolExpr {

	private BoolExpr expression;
	
	public void NotExpr(BoolExpr expression) {
		this.expression = expression;
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