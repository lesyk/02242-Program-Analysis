package program_slicer;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RDSetStorage implements Iterable<RD> {
	private Set<RD> rdSet;

	public RDSetStorage() {
		rdSet = new HashSet<RD>();
	}

	public boolean isSubsetOrEquals(RDSetStorage otherRDSet) {
		return otherRDSet.rdSet.containsAll(rdSet);
	}

	public boolean contains(RD rd) {
		return rdSet.contains(rd);
	}

	public void union(RDSetStorage otherRDList) {
		rdSet.addAll(otherRDList.rdSet);
	}

	public void add(RD rd) {
		rdSet.add(rd);
	}

	public void complement(RDSetStorage otherRDList) {
		rdSet.removeAll(otherRDList.rdSet);
	}

	@Override
	public Iterator<RD> iterator() {
		Iterator<RD> iRD = rdSet.iterator();
		return iRD;
	}

	@Override
	public String toString() {
		String rdc = "";

		for (RD rd : rdSet) {
			rdc += "(" + rd.toString() + ") ";
		}
		return rdc;
	}

}
