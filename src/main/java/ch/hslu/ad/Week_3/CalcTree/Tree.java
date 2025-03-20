package ch.hslu.ad.Week_3.CalcTree;

import ch.hslu.ad.Week_3.treeInterface;


public class Tree implements treeInterface {
    private static Node root;
    private static String equation = "";
         
        
            @SuppressWarnings("static-access")
            public Tree (Node rootNode){
                      this.root = rootNode;
            }
        
            @Override
            public int getRoot() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
            }
        
            @Override
            public void addNode(int node) {
                throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
            }
        
        
            @Override
            public void deleteNode(int node) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
            }
        
            @Override
            public int searcheNode(int node) {
                throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
            }
        
            public void inOrderTravers(Node currentNode){
                throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
            }
    
            public static void toStringRec(Node root){
                
                        Node currentNode = root;
                        if (currentNode != null){
                            toStringRec(currentNode.getNodeChildLeft());
                            equation = equation + currentNode.toString();
                        toStringRec(currentNode.getNodeChildRight());
                    }
                }
                @SuppressWarnings("unused")
                public static void main(String[] args) {
                    
                    Node n = new MulNode(new AddNode(new NumNode(2), new NumNode(3)), new NumNode(4));
                    Tree tree = new Tree(n);
                    System.out.println(n.getNodeValue());
                    toStringRec(root);
                    System.out.println(equation);

    }
}

