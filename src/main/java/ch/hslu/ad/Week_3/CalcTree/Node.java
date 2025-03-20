package ch.hslu.ad.Week_3.CalcTree;

public abstract class Node {

    protected Node nodeChildRight;
    protected Node nodeChildLeft;
    protected Node nodeParent;
    
    public Node (){

    }

    public void setNodeChildRight(Node nodeChildRight) {
        this.nodeChildRight = nodeChildRight;
    }
    
    public void setNodeChildLeft(Node nodeChildLeft) {
        this.nodeChildLeft = nodeChildLeft;
    }
    
    public void setNodeParent(Node nodeParent) {
        this.nodeParent = nodeParent;
    }
    
    public Node getNodeChildRight() {
        return nodeChildRight;
    }
    
    public Node getNodeChildLeft() {
        return nodeChildLeft;
    }
    
    public Node getNodeParent() {
        return nodeParent;
    }
    
    public void setParent(Node parent){
        this.nodeParent = parent;
    }
    public int getNodeValue() {
        // Default implementation, can be overridden by subclasses
        return 0;
    }
}

