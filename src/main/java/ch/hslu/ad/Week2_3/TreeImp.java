package ch.hslu.ad.Week2_3;

public class TreeImp implements Tree{

    private Node root = null;
    private int size = 0;

    public TreeImp(){
        Node node5 = new Node(5);
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
                return true;
            }
            else if (searchable < currentNode.getValue()) {
                currentNode = currentNode.getChildLeft();
            }
            else if (searchable > currentNode.getValue()) {
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

    public String inOrder(){
        Node current = root;
        int tree = new Array[int];
        int i = 0;
        for(size){
            while(current.getChildLeft() != null || current.getChildLeft().getValue() == tree[i]){
                current = current.getChildLeft();   
            }
            tree[i] = current.getValue();
        }
        System.out.println(tree)
    }
    
    public static void main(String[] args) {
        TreeImp imp = new TreeImp()
        imp.inOrder()
    }
}

