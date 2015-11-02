package graphs.flow;

import java.util.ArrayList;

import ast.expression.Variable;

public class VarSet extends ArrayList<Variable> {

	public final static VarSet emptySet = new VarSet();

    public static VarSet factory() {
        return new VarSet();
    }

    public VarSet addVariable(Variable variable) {
        super.add(variable);

        return this;
    }

    public VarSet union(VarSet otherSet) {
        for (Variable v : otherSet) {
            if (!this.contains(v))
                this.add(v);
        }
        return this;
    }

    @Override
    public String toString() {
        String buffer = "(";

        for (Variable var : this) {
            buffer += var;
            if (var != this.get(this.size() - 1))
            	buffer += ",";
        }
        
        return buffer + ")";
    }
}