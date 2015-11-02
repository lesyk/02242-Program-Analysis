package free_var;

/*
 * 
 * @author Viktor Lesyk
 *
 */

//Input: Flow Graph
//Output: Variables in each line of the flow graph with their positions
//For each block in the flow graph 
//Get all variables used in the block
//For each occurance of variable in the block
//Get position of variable in statement from(left, right, write, index, none) Cons((variableInstatement,linenumber,variablePosition),Variables);
//return Variables;

import java.util.List;
import java.util.Vector;

import free_var.FreeVar.VarPosition;
import graphs.Block;
import graphs.flow.FlowGraph;

public class FreeVarGen {
	private static Vector<FreeVar> freeVars;
	private static int labelCounter;

	public static void extractVars() {
		freeVars = new Vector<FreeVar>();
		labelCounter = 1;
		
		//for each block from flow graph get block and run
		for (Block block : FlowGraph.getBlocks()) {
			extractFromBlock(block);
			labelCounter++;
		}
	}

	public static void extractFromBlock(Block block) {
//		check on statement kind
		if (block instanceof Array Assign Statement)
			addArrayAssignVars(((Array Assign Statement) block).getVariables());
		else if (block instanceof Assign Statement)
			addAssignFreeVars(((Assign Statement) block).getVariables());
		else if (block instanceof Write Statement)
			addWriteFreeVars(((Write Statement) block).getVariables());
		else if (block instanceof Read Statement)
			addReadFreeVariables(((Read Statement) block).getVariables());
		else if (block instanceof Boolean Expression) {
			addBoolFreeVars(((Boolean Exprression) block).getVariables());
		}
	}
	
	public static Vector<FreeVar> getFreeVars() {
		return freeVars;
	}
	
	private static void addArrayAssignVars(Vector<String> vars){
		List<String> varsArray = null;
		FreeVar fv = null;
		if (vars.contains("[")) {
			varsArray = vars.subList(vars.indexOf("[")+1, vars.indexOf("]"));
			if (varsArray != null) {
				for (String str : varsArray) {
					fv = new FreeVar(str, VarPosition.index, labelCounter);
					if (!freeVars.contains(fv))
						freeVars.add(fv);
				}
			}
			
			varsArray = vars.subList(0, vars.indexOf("["));
			if (varsArray != null) {
				for (String str : varsArray) {
					fv = new FreeVar(str, VarPosition.left, labelCounter);
					if (!freeVars.contains(fv))
						freeVars.add(fv);
				}
			}
			
			varsArray = vars.subList(vars.indexOf("=") + 1, vars.size());
			if (varsArray != null) {
				for (String str : varsArray) {
					fv = new FreeVar(str, VarPosition.right, labelCounter);
					if (!freeVars.contains(fv))
						freeVars.add(fv);
				}
			}
		}
	}
	
	private static void addAssignFreeVars(Vector<String> vars) {
		List<String> varsArray = null;
		FreeVar fv = null;
		if (vars.contains("=")) {
			varsArray = vars.subList(0, vars.indexOf("="));
			if (varsArray != null) {
				for (String str : varsArray) {
					fv = new FreeVar(str, VarPosition.left, labelCounter);
					if (!freeVars.contains(fv))
						freeVars.add(fv);
				}
			}

			varsArray = vars.subList(vars.indexOf("=") + 1, vars.size());
			if (varsArray != null) {
				for (String str : varsArray) {
					fv = new FreeVar(str, VarPosition.right, labelCounter);
					if (!freeVars.contains(fv))
						freeVars.add(fv);
				}
			}
		}
	}

	private static void addBoolFreeVars(Vector<String> vars) {
		for (String str : vars) {
			FreeVar fv = new FreeVar(str, VarPosition.none, labelCounter);
			freeVars.add(fv);
		}
	}

	private static void addReadFreeVars(Vector<String> vars) {
		for (String str : vars) {
			FreeVar fv = new FreeVar(str, VarPosition.read, labelCounter);
			freeVars.add(fv);
		}
	}

	private static void addWriteFreeVars(Vector<String> vars) {
		for (String str : vars) {
			FreeVar fv = new FreeVar(str, VarPosition.write, labelCounter);
			freeVars.add(fv);
		}
	}

	public static Vector<String> getAllVarsNames() {
		Vector<String> allVars = new Vector<String>();
		for (FreeVar fv : freeVars) {
			if (!allVars.contains(fv.getVarName()))
				allVars.add(fv.getVarName());
		}
		return allVars;
	}

	public static Vector<FreeVar> getFreeVarsInLine(int currLineOfInterest) {
		Vector<FreeVar> varsInLine = new Vector<>();
		for (FreeVar fv : freeVars) {
			if (fv.getlabel() == currLineOfInterest)
				varsInLine.add(fv);
		}
		return varsInLine;
	}

	public static Vector<Integer> getAssignLinesOfFreeVars(String varName) {
		Vector<Integer> linesOfFreeVar = new Vector<>();

		for (FreeVar fv : freeVars) {
			if (fv.getVarName().equalsIgnoreCase(varName) && (fv.getVarPosition() == (VarPosition.left) || fv.getVarPosition() == VarPosition.read))
				linesOfFreeVar.add(fv.getlabel());
		}
		return linesOfFreeVar;
	}
	
	public static void printVars() {
		String ret = "Free Variables: \n";
		if (freeVars.isEmpty()){
			ret = "Free Variables list is empty.";
		}else{
			for (FreeVar fv : freeVars) {
				ret += "(" + fv.toString() + ") ";
			}
		}
		
		System.out.println(ret);
	}
}