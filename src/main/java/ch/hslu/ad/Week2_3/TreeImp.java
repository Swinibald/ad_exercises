package ch.hslu.ad.Week2_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreeImp implements Tree{

    private static Node root = null;
    private int size = 0;
    private static final Logger log = LoggerFactory.getLogger(TreeImp.class);

    public TreeImp(){
        Node node5 = new Node(5);
        this.root = node5;
        node5.setChildLeft(new Node(3));
        node5.setChildRight(new Node(7));
        Node node3 = node5.getChildLeft();
        Node node7 = node5.getChildRight();
        node3.setChildLeft(new Node(1));
        node3.setChildRight(new Node(4));
        node7.setChildLeft(new Node(6));
        node7.setChildRight(new Node(10));
        Node node1 = node3.getChildLeft();
        node1.setChildRight(new Node(2));
        Node node10 = node7.getChildRight();
        node10.setChildLeft(new Node(9));
        Node node9 = node10.getChildLeft();
        node9.setChildLeft(new Node(8));
        this.size = 10;
    }
    

    @Override
    public boolean search(int searchable) {
        Node currentNode = root;
        while (currentNode != null) {
            if (searchable == currentNode.getValue()) {
                log.info(String.valueOf(currentNode.getValue()));
                return true;
            }
            else if (searchable < currentNode.getValue()) {
                log.info(String.valueOf(currentNode.getValue()));
                currentNode = currentNode.getChildLeft();
            }
            else if (searchable > currentNode.getValue()) {
                log.info(String.valueOf(currentNode.getValue()));
                currentNode = currentNode.getChildRight();
            }
        }
        return false;
    }

    @Override
    public boolean delete(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void replaceRoot(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'replaceRoot'");
    }

    @Override
    public boolean add(int addative) {
        Node currentNode = root;
        if (root == null) {
            root = new Node(addative);
        }
        while (currentNode != null) {
            if (addative == currentNode.getValue()) {
                return false;
            }
            else if (addative < currentNode.getValue() && currentNode.getChildLeft() == null) {
                currentNode.setChildLeft(new Node(addative));
                return true;
            }
            else if (addative < currentNode.getValue()) {
                currentNode = currentNode.getChildLeft();
            }
            else if (addative > currentNode.getValue()) {
                currentNode.setChildRight(new Node(addative));
                return true;
            } 
            else if (addative > currentNode.getValue()) {
                currentNode = currentNode.getChildRight();
            }
        }
        return false;
    }

    public void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.getChildLeft());
        System.out.println(node.getValue());
        inOrder(node.getChildRight());
        }
    
    public static void main(String[] args) {
        TreeImp imp = new TreeImp();
        imp.search(8);
    }
}

