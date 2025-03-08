package ch.hslu.ad.Week_2;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T>{
    private Node<T> current;

    public ListIterator(List<T> list) { 
        current = list.getFirstNode(); 
    }
    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        Node<T> current = null;
        current = current.getNextNode();
        return current.getData();            
        }        
        
}
