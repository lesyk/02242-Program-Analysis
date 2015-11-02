package ast.statement;

/**
 * if b then S1 else S2 fi
 */

import java.util.Vector;

import ast.bool.BoolExpr;

public class If extends Statement {

	private BoolExpr condition;
	private Statement ifBranch;
	private Statement elseBranch;

	public void IfStatement(BoolExpr condition, Statement ifBranch, Statement elseBranch) {
		this.condition = condition;
		this.ifBranch = ifBranch;
		this.elseBranch = elseBranch;
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