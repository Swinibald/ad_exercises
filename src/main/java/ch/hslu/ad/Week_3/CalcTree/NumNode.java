package ch.hslu.ad.Week_3.CalcTree;

public class NumNode extends Node{
    private int nodeValue;

    public NumNode  (int nodeValue){
        this.nodeValue = nodeValue;
    }
    @Override
    public int getNodeValue(){
        return nodeValue;
    }

    public String toString(){
        return String.valueOf(nodeValue);
    }
}
