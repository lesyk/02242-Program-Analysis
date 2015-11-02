package program_slicer;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

public class RD {
	private int lineNumber;
	private String varName;

	public RD(String varName, int lineNumber) {
		this.lineNumber = lineNumber;
		this.varName = varName;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getVarName() {
		return varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof RD)) {
			return false;
		}
		RD other = (RD) obj;
		return (this.varName.equals(other.varName) && this.lineNumber == other.lineNumber);
	}

//	@Override
//	public int hashCode() {
//		return varName.hashCode() * lineNumber;
//	}

	@Override
	public String toString() {
		if(lineNumber != 0){
		return varName + "," + String.valueOf(lineNumber);
		}
		else{
			return varName + ",?";	
		}
	}
}
