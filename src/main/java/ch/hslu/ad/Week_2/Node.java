package ch.hslu.ad.Week_2;

import java.util.Objects;

public class Node<T> {
    private Node<T> nextNode;
    private T data;

public Node(T data){
    this.data = data;
    this.nextNode = null;
}

public void setNextNode(Node<T> nextNode){
    this.nextNode = nextNode;
}

public Node<T> getNextNode(){
    return nextNode;
}

public void setData(T data){
    this.data = data;
}

public T getData(){
    if (data != null){
        return data;
    }else{
        return null;}
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Node<?> node = (Node<?>) obj;
    return Objects.equals(data, node.data);
}

}
