package program_slicer;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

import free_var.FreeVar;
import free_var.FreeVarGen;
import free_var.FreeVar.VarPosition;
import graphs.Block;
import graphs.flow.FlowGraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class KillGenAnalysis {
	private static Vector<Block> blocks;
	private static List<RDSetStorage> genRD;
	private static List<RDSetStorage> killRD;

	public static void intialize() {
		genRD = new LinkedList<RDSetStorage>();
		killRD = new LinkedList<RDSetStorage>();
		blocks = FlowGraph.getBlocks();
	}

	public static void analyze() {
		int label = 0;
		for (Block block : blocks) {
			++label;
			if (block instanceof Read Statement) {
				killGenForReadStmt(label);
			} else if (block instanceof Array Assign Statement) {
				killGenForArrayAssignStmt(label);
			} else if (block instanceof Assign Statement) {
				killGenForAssignStmt(label);
			} else {
				RDSetStorage rdst = null;
				killRD.add(rdst);
				genRD.add(rdst);
			}

		}
	}

	private static void killGenForReadStmt(int label) {
		Vector<FreeVar> variablesInLine = FreeVarGen.getFreeVarsInLine(label);
		for (FreeVar fv : variablesInLine) {
				createKillRD(fv.getVarName(), label);
				createGenRD(fv.getVarName(), label);
			}
	}

	private static void killGenForAssignStmt(int label) {
		boolean created=false;
		Vector<FreeVar> variablesInLine = FreeVarGen.getFreeVarsInLine(label);
		
		for (FreeVar fv : variablesInLine) {
			if (fv.getVarPosition() == VarPosition.left){
				createKillRD(fv.getVarName(), label);
				createGenRD(fv.getVarName(), label);
				created=true;
			}
		}
		
		if(created== false) {
			RDSetStorage rdst = null;
			killRD.add(rdst);
			genRD.add(rdst);
		}
	}
	
	private static void killGenForArrayAssignStmt(int label) {
		boolean created=false;
		Vector<FreeVar> variablesInLine = FreeVarGen.getFreeVarsInLine(label);
		
		for (FreeVar fv : variablesInLine) {
			if (fv.getVarPosition() == VarPosition.left){
				createKillRD(fv.getVarName(), label);
				createGenRD(fv.getVarName(), label);
				created=true;
			}
		}
		
		if(created== false){
			RDSetStorage rdst = null;
			killRD.add(rdst);
			genRD.add(rdst);
		}
	}

	private static void createKillRD(String variableName, int label) {
		RDSetStorage krdst = new RDSetStorage();
		krdst.add(new RD(variableName, 0));
		Vector<Integer> lineNumbers = FreeVarGen.getAssignLinesOfFreeVars(variableName);
		
		for (int i : lineNumbers) {
			krdst.add(new RD(variableName, i));
		}
		
		if (killRD.size() > (label - 1)) {
			killRD.get(label - 1).union(krdst);
		} else {
			killRD.add(krdst);
		}
	}

	private static void createGenRD(String variableName, int label) {
		RDSetStorage grdst = new RDSetStorage();
		grdst.add(new RD(variableName, label));
		genRD.add(grdst);
	}

	public static RDSetStorage getKillRD(int label) {
		return killRD.get(label - 1);
	}

	public static RDSetStorage getGenRD(int label) {
		return genRD.get(label - 1);
	}

	public static void printKillGenAnalysis() {
		if (!killRD.isEmpty()) {
			System.out.println("killRD:");
			int label = 0;
			for (RDSetStorage rdc : killRD) {
				if (rdc == null) {
					System.out.println("killRD(" + ++label + ") = {}");
				} else {
					System.out.println("killRD(" + ++label + ") = {" + rdc.toString() + "}");
				}
			}
		}
		
		if (!genRD.isEmpty()) {
			System.out.println("genRD:");
			int label = 0;
			for (RDSetStorage rdc : genRD) {
				if (rdc == null) {
					System.out.println("genRD(" + ++label + ") = {}");
				} else {
					System.out.println("genRD(" + ++label + ") = {" + rdc.toString() + "}");
				}
			}
		}
		System.out.println();
	}
}