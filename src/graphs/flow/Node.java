package graphs.flow;

import java.util.Objects;

import ast.statement.Statement;

public class Node {

	 protected Statement s;

    public Node(Statement s) {
        this.s = s;
    }

    public VarSet getVariables(){
		return s.getVariables();
    }
    
    public int getLabel() {
        return s.getLabel();
    }

    @Override
    public String toString() {
        return ""+ s.getLabel();
    }

    public int compareTo(Node n) {
        return n.s.getLabel() - s.getLabel();
    }

    public Statement getStatement() {
        return s;
    }
    
    public boolean equals (Node n) {
        return this.s.getLabel() == n.s.getLabel();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }
}