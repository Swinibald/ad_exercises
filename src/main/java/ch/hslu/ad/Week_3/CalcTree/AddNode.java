package ch.hslu.ad.Week_3.CalcTree;

public class AddNode extends Node {

    public AddNode(Node Left, Node Right){
        setNodeChildLeft(Left);
        setNodeChildRight(Right);
    }

    public int add(){
        return nodeChildLeft.getNodeValue() + nodeChildRight.getNodeValue();
    }
    @Override
    public int getNodeValue(){
        return add();
    }

    public String toString(){
        return "+";
    }

}
