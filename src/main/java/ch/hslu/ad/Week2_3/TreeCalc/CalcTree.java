package ch.hslu.ad.Week2_3.TreeCalc;

public class CalcTree {

    private Node root;

    public CalcTree(int value){
       this.root = Node.create(value);
    }

    public CalcTree(String value){
        this.root = Node.create(value);
    }

    public void add(int value){
        Node currentNode = root;
        while(true){
            if (currentNode.getChildLeft() == null) {
            currentNode.setChildLeft(Node.create(value));
            return;
        }else if (currentNode.getChildRight() == null) {
            currentNode.setChildRight(Node.create(value));
            return;
        }else if (currentNode.getChildLeft() != null)
            currentNode = currentNode.getChildLeft();
        }
        
    }

    public static void main(String[] args) {
    
    }
}
