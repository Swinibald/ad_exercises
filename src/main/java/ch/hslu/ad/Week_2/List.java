package ch.hslu.ad.Week_2;

import java.util.Iterator;

public class List<T> implements Iterable<T>{
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

//public Node<T> search(Node<T> node){
//    int iterator;
//    iterator = size();
//    if (node.equals(getFirstNode())){
//        return getFirstNode();
//        } else {
//                
//       while (iterator != 0) { // 5 Durchgänge
//            Node<T> nodeCall = getFirstNode(); // Starte immer mit getFirstNode()
//            while (iterator != 1) { // Danach methode() (i-1-mal)
//                nodeCall = nodeCall.getNextNode();//               
//                    if (nodeCall.equals(node)){
//                   iterator = 1;
//                   return nodeCall;                    
//               }else{
//                   iterator = iterator - 1 ;
//                        }
//                   }
//               }
//           }
//               return node;
//       }

    public Node<T> search(T data) {  // Suchparameter ist nur das gesuchte Data
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) { // Vergleich mit Datenwert
                return current;
            }
            current = current.getNextNode();
        }
        return null; // Falls nicht gefunden
    }
    
    public Node<T> searchAndDestroy(T data){
        int pos = 0;
        Node<T> current = head;
        Node<T> node = head;
        if (head == null) { // Falls Liste leer ist, gibt es nichts zu entfernen
            return null;
        } else {
            
            while (current != null) {
                pos++;
                if (current.getData().equals(data)) { // Vergleich mit Datenwert
                    current.setNextNode(null);
                    for (int i = pos; i != 1; i = i - 1){
                        node = node.getNextNode();
                    }
                    node.setNextNode(current.getNextNode());
                    current.setNextNode(null);
                    return current;
                }
                current = current.getNextNode();
                
            }
            return null; // Falls nicht gefunden
        }
    }

    public Node<T> removeHead() {
        if (head == null) { // Falls Liste leer ist, gibt es nichts zu entfernen
            return null;
        }
    
        Node<T> removedHead = head;  // Speichere aktuelles head
        head = head.getNextNode();   // Setze neuen head
    
        removedHead.setNextNode(null); // Verbindung zum Rest der Liste lösen (optional)
    
        return removedHead;  // Gibt entfernte Node zurück
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<T>(this);
    }
    
    }

