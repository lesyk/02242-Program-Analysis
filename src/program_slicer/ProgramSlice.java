package program_slicer;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

import free_var.*;
import free_var.FreeVar.VarPosition;
import graphs.flow.FlowGraph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ProgramSlice {
	private static int interestPoint;
	private static List<Integer> slice;
	private static List<Integer> workList;
	private static final int FIRST_ELEMENT = 0;

	private static void initialize(int _interestPoint) {
		interestPoint = _interestPoint;
		workList = new LinkedList<Integer>();
		slice = new LinkedList<Integer>();
	}
	
	private static void generateReachingDefinitions(FlowGraph flowGraph){
		RDAnalysis.initialize(flowGraph);
		RDAnalysis.analyze();
		RDAnalysis.printAnalysis();
//		find boolean ancestor
	}

	public static List<Integer> getUDChain(FreeVar fv, int pOfInterest) {
		List<Integer> udChain = new LinkedList<Integer>();
		RDSetStorage rdEntry = new RDSetStorage();
		rdEntry = RDAnalysis.getRdEntry(pOfInterest);
		for (RD rd : rdEntry) {
			if (rd.getVarName().compareTo(fv.getVarName()) == 0) {
				udChain.add(rd.getLineNumber());
			}
		}
		return udChain;
	}

	public static List<Integer> getProgramSlice(FlowGraph fg, int pointOfInterest) {
//		init
		int currentLineOfInterest;
		Vector<FreeVar> variablesInLine = new Vector<>();
		List<Integer> udChain = new LinkedList<>();
		
		initialize(pointOfInterest);
//		-----------
//		check on point of interest 
		if(pointOfInterest > FlowGraph.getBlocks().size() || pointOfInterest <= FIRST_ELEMENT ){
			System.out.println("Point of interest outside the number of lines in the program.");
			return null;
		}
//		-----------
//		starting RD
		generateReachingDefinitions(fg);
//		

		workList.add(pointOfInterest);
		
		while (!workList.isEmpty()) {
			currentLineOfInterest = workList.get(FIRST_ELEMENT);
			workList.remove(FIRST_ELEMENT);
			slice.add(currentLineOfInterest);
			variablesInLine = FreeVarGen.getFreeVarsInLine(currentLineOfInterest);
			
			if (!variablesInLine.isEmpty()) {
				for (FreeVar fv : variablesInLine) {
					if (fv.getVarPosition() != VarPosition.left && !( fv.getVarPosition() == VarPosition.write && slice.size() >1)) {
						udChain = getUDChain(fv, currentLineOfInterest);
						
						for (int label : udChain) {
							if (!slice.contains(label) && !workList.contains(label) && label !=0) {
								workList.add(label);
							}
						}
					}
			
				}
//				work on boolean ancestor
			}
		}
		Collections.sort(slice);
		return slice;
	}

	public int getPointOfInterest() {
		return interestPoint;
	}

	public static void printProgramSlice() {
		System.out.print("The program slice when point of interest "+ interestPoint+" is: ");
		String str="";
		
		for(int i=0;i<slice.size();i++){
			str+=slice.get(i)+",";			
		}
		
		if(!str.isEmpty()){
			str=str.substring(0, str.length()-1);
			System.out.println(str);
		}
		
		System.out.println();
	}
}