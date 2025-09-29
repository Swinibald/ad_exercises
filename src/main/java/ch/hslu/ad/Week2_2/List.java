package ch.hslu.ad.Week2_2;

import java.util.Iterator;
import java.util.Objects;

public class List<E> implements Iterable<E> {

    private int size;
    private Node<E> head;

    public boolean add(E value){  
        Node<E> node = new Node<E>(value, head);
        head = node;
        size++;
        return true;
    }

    public boolean search(E searchValue){
        Node<E> node = head;
        while(node != null) {
            if (Objects.equals(node.value, searchValue)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public E deleteFirst(){
        if (head == null) {
            return null;
        }else{
            Node<E> deletedNode = head;
            head = head.next;
            size--;
            return deletedNode.value;    
        }
    }

    public boolean delete(E deleteValue){
        if (head == null) {
            return false;
        }else{
            Node<E> node = head;
            Node<E> lastNode = head;
            if(Objects.equals(head.value, deleteValue)){
                deleteFirst();
                return true;
            }else{
            while(node != null) {
                    if (Objects.equals(node.value, deleteValue)) {
                        lastNode.next = node.next;
                        size--;
                        return true;
                    }else{
                        lastNode = node;
                        node = node.next;
                    }
                } 
                return false;
            }
        }   
    }

    public int size(){
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E value = current.value;
                current = current.next;
                return value;
            }
        };
    }

}
