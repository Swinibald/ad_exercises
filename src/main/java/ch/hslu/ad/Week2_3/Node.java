package ch.hslu.ad.Week2_3;

public class Node {

    private int value;
    private Node childLeft = null;
    private Node childRight = null;

    public Node(int value){
        this.value = value;
    }

    public void setChildLeft(Node childLeft) {
        this.childLeft = childLeft;
    }

    public void setChildRight(Node childRight) {
        this.childRight = childRight;
    }

    public Node getChildLeft() {
        return childLeft;
    }

    public Node getChildRight() {
        return childRight;
    }

    public int getValue() {
        return value;
    }

}
