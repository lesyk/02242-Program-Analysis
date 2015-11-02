package ast.bool;

import java.util.Vector;

public class BoolVal extends BoolExpr {

	private boolean value;
	
	public void BoolValueExpr(boolean value) {
		this.value = value;
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