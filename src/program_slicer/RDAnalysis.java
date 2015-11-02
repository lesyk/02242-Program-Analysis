package program_slicer;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

import free_var.*;
import graphs.flow.Flow;
import graphs.flow.FlowGraph;

import java.util.List;
import java.util.LinkedList;
import java.util.Vector;

public class RDAnalysis {

	private static List<RDSetStorage> rdEntry;
	private static List<RDSetStorage> rdExit;
	private static FlowGraph flowGraph;
	private static Vector<Flow> workList;
	private static final int FIRST_ELEMENT = 0;

	public static void initialize(FlowGraph _flowGraph) {
		flowGraph = _flowGraph;
		workList = new Vector<Flow>();
		addFlowsToWorkList();
		initRDEqn();
		KillGenAnalysis.intialize();
		KillGenAnalysis.analyze();
		KillGenAnalysis.printKillGenAnalysis();
	}

	private static void addFlowsToWorkList() {
		workList.addAll(flowGraph.getFlow());
	}

	private static void initRDEqn() {
		rdEntry = new LinkedList<RDSetStorage>();
		rdExit = new LinkedList<RDSetStorage>();
//		for each label in FlowGraph
			rdEntry.add(new RDSetStorage());
			rdExit.add(new RDSetStorage());
//			if label eq FlowGraphs label
				for (FreeVar fv : FreeVarGen.getFreeVars()) {
//					adding to entry free var
					rdEntry.get(label - 1).add(new RD(fv.getVarName(), 0));
				}
//			-------------
//-------------
	}

	public static void analyze() {
		while (!workList.isEmpty()) {
			Flow flow = workList.firstElement();
			workList.remove(FIRST_ELEMENT);

//			compute RDExit of flow's from
			computeRDExit(flow.from);
			
			RDSetStorage prevRDExit = rdExit.get(flow.flow.from - 1);
			RDSetStorage nextRDEntry = rdEntry.get(flow.to - 1);
			
			Boolean isSubSet = prevRDExit.isSubsetOrEquals(nextRDEntry);
			
			if (!isSubSet) {
				nextRDEntry.union(prevRDExit);
				for (Flow nextFlow : flowGraph.getFlow()) {
					if (nextFlow.from == flow.to)
						workList.add(nextFlow);
				}
			}
		}
		computeRDExit(rdExit.size());
	}

	private static void computeRDExit(int label) {
		RDSetStorage rdc = new RDSetStorage();
		
		rdc.union(rdEntry.get(label - 1));
		if (KillGenAnalysis.getKillRD(label) != null)
			rdc.complement(KillGenAnalysis.getKillRD(label));

		if (KillGenAnalysis.getGenRD(label) != null)
			rdc.union(KillGenAnalysis.getGenRD(label));
		
		if (rdc != null)
			rdExit.get(label - 1).union(rdc);
	}

	public static RDSetStorage getRdExit(int line) {
		return rdExit.get(line - 1);
	}

	public static RDSetStorage getRdEntry(int line) {
		return rdEntry.get(line - 1);
	}

	public static void printAnalysis() {
		if (!rdEntry.isEmpty()) {
			System.out.println("RDEntry:");
			int label = 0;
			for (RDSetStorage rdc : rdEntry) {
				System.out.println("RDEntry(" + ++label + ") = {"
						+ rdc.toString() + "}");
			}
		}
		
		if (!rdExit.isEmpty()) {
			System.out.println("RDExit:");
			int label = 0;
			for (RDSetStorage rdc : rdExit) {
				System.out.println("RDExit(" + ++label + ") = {"
						+ rdc.toString() + "}");
			}
		}
		
		System.out.println();
	}
}