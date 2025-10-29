package ch.hslu.ad.Week2_3.TreeCalc;

public class Node {

    private Node childLeft;
    private Node childRight;
    
    protected Node(){

    }

    public static Node create (String input){
        switch (input) {
            case "*" -> {
                return new multNode();
            }
            case "-" -> {
                return new subNode();
            }
            case "+" -> {
                return new plusNode();
            }
            default -> throw new IllegalArgumentException("Unknown Input:" + input);
        }
    }

    public static Node create (int input){
        return new numNode(input);
    }

    public Node getChildRight() {
        return childRight;
    }

    public void setChildRight(Node childRight) {
        this.childRight = childRight;
    }

    public Node getChildLeft() {
        return childLeft;
    }

    public void setChildLeft(Node childLeft) {
        this.childLeft = childLeft;
    }
}
