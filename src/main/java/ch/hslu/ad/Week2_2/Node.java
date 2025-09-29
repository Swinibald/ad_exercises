package ch.hslu.ad.Week2_2;

public class Node<E> {
    E value;
    Node<E> next;

    Node (E value, Node<E> next){
        this.value = value;
        this.next = next;
    }
}