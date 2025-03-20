package ch.hslu.ad.Week_3.CalcTree;

public class MulNode extends Node {

    public MulNode(Node Left, Node Right){
        setNodeChildLeft(Left);
        setNodeChildRight(Right);
    }
    @Override
    public int getNodeValue(){
        return mul();
    }

    public int mul(){
        return nodeChildLeft.getNodeValue() * nodeChildRight.getNodeValue();
    }

    public String toString(){
        return "*";
    }


}
