package ch.hslu.ad.Week_3;

public class Node {
    private int nodeValue;
    private Node nodeChildRight;
    private Node nodeChildLeft;
    private Node nodeParent;

    public Node (int root){
        this.nodeValue = root;
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

    public int getNodeValue(){
        return nodeValue;
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

    public void addNodeChild(int child){

    }

    
    
}
