package graphs.flow;

/*
 * 
 * @author Viktor Lesyk
 * 
 */

public class Flow {

    private Node from;
    private Node to;
    
    public Flow(Node source, Node target) {
        this.from = source;
        this.to = target;
    }

    public Node getSource() {
        return from;
    }

    public Node getTarget() {
        return to;
    }
    
    @Override
    public String toString() {
        return "("+this.from.getLabel() + ", " + this.to.getLabel() + ")";
    }
}