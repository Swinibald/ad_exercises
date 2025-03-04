package ch.hslu.ad.Week_2;

public class Node<T> {
    private Node<T> nextNode;
    private T data;

public Node(T data){
    this.data = data;
    this.nextNode = null;
}

public void setNextNode(Node nextNode){
    this.nextNode = nextNode;
}

public Node getNextNode(){
    return nextNode;
}

public void setData(T data){
    this.data = data;
}

public T getData(){
    return data;
}
}
