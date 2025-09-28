package ch.hslu.ad.Week2_2;

public class List {
    int size;
    Node head;
    public boolean add(int value){  
        Node node = new Node(value, null);
        node.next = head; 
        head = node;
        size++;
        return true;
    }

    public boolean search(int searchValue){
        Node node = head;
        while(node != null) {
            if (node.value == searchValue) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public Node deleteFirst(){
        Node deletedNode = head;
        Node node = head.next;
        head = node;
        size--;
        return deletedNode;
    }

    public boolean delete(int deleteValue){
        Node node = head;
        Node lastNode = head;
        if(head.value == deleteValue){
            deleteFirst();
            size--;
            return true;
        }else{
           while(node != null) {
                if (node.value == deleteValue) {
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

    public int size(){
        return size;
    }
}
