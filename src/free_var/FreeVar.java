package free_var;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

public class FreeVar {
	
	private String varName;
//	positions of variable in statement
	public enum VarPosition {
		read,
		write,
		index,  //in an array index
		none,   //in a statement other than assignment statement
		left,   //in assignment operator
		right;  //in assignment operator
	}
	private VarPosition varPosition;
	private int label;
	
	public FreeVar(String varName, VarPosition varPosition,int label){
		this.varName = varName;
		this.varPosition = varPosition;
		this.label = label;	
	}
	
	public String getVarName(){
		return varName;
	}
	
	public VarPosition getVarPosition(){
		return varPosition;
	}
	
	public int getlabel(){
		return label;
	}
	 
	@Override
	public boolean equals(Object obj) {
	    if (obj == this)
	   	 return true;
	    
	    if (!(obj instanceof FreeVar))
	   	 return false;
	        
	    FreeVar other = (FreeVar) obj;
	    return (this.varName.equals(other.varName) && this.varPosition.equals(other.varPosition) && this.label==other.label);
	}
	
	@Override
	public String toString(){
		return varName + ", " + varPosition.toString() + ", " + String.valueOf(label);
	}
}