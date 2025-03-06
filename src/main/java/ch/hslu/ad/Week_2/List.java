package ch.hslu.ad.Week_2;

public class List<T> {
    private Node<T> head;
    private int numOfObjects;

public List(){
    this.head = null;
    this.numOfObjects = 0;
    }

public void addElement(T data){
    Node<T> node = new Node<T>(data);
    node.setNextNode(head);
    head = node;
    numOfObjects++;
    }

public int size(){
    return numOfObjects;
    }

public Node<T> getFirstNode(){
    return head;
    }

public Node<T> search(Node<T> node){
    int iterator;
    iterator = size();
    if (equals(getFirstNode(), node)){
        return getFirstNode();
        } else {
    while (iterator != 1) {
        if (equals(getFirstNode().getNextNode(), node)){
            return getFirstNode().getNextNode();
        } else {
        iterator = iterator - 1; 
        }
        

    }    
    }

}
}
