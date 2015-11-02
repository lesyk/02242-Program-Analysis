import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import free_var.FreeVarGen;

import antlr.RecognitionException;
import program_slicer.ProgramSlice;
import parser.TheLangLexer;
import parser.TheLangParser;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

public class Main {
	
	public static void main(String args[]) throws Exception {
		if (args.length <= 1) {
			printCommands();
			return;
		}
		
		String cmd = args[1];
		
	    TheLangLexer lex = new TheLangLexer(new ANTLRFileStream(args[0]));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	    TheLangParser parser = new TheLangParser(tokens);
	    
	    try {
	        TheLangParser.program_return parserResult = parser.program();
	        if (parserResult != null) {
	          CommonTree tree = (CommonTree) parserResult.tree;
	          System.out.println(tree.toStringTree());
	  
	  		if (cmd.equals("1")) {
//	  			generate all free variables
	  			FreeVarGen.extractVars();
//	  			output free variables
	  			FreeVarGen.printVars();
//	  			Program slicing
	  			ProgramSlice.getProgramSlice(FlowGraph, 6);
//	  			output program slicing
	  			ProgramSlice.printProgramSlice();
	        }
	      } catch (RecognitionException e) {
	        e.printStackTrace();
	      }
	}

	public static void printCommands() {
		System.out.println("Usage: File cmd; cmd:\t1 - program slice.");
	}
}