package graphs.flow;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

import java.util.ArrayList;

public class FlowSet extends ArrayList<Flow> {
    
	private static final long serialVersionUID = 1L;
	public final static FlowSet emptySet = new FlowSet();
    
    public static FlowSet factory() {
        return new FlowSet();
    }
    
    public FlowSet addFlow(Flow f) {
        super.add(f);
        return this;
    }

    public FlowSet union(FlowSet fset) {
        for (Flow f : fset) {
            if (!this.contains(f))
                this.add(f);
        }
        return this;
    }

//    @Override
//    public String toString() {
//        String buffer = "(";
//        for (Flow flow : this) {
//            buffer += flow;
//            if (flow == this.get(this.size() - 1))  {
//            } else {
//                buffer += ",";
//            }
//        }
//        return buffer+")";
//    }

    public FlowSet flows(Node labelSource) {
        FlowSet flows = new FlowSet();
        for (Flow flow : this) {
            if (flow.getSource()==labelSource)
                flows.add(flow);
        }
        return flows;
    }
}