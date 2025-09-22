package ch.hslu.ad.Week_3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Tree implements treeInterface {
    private static Node root;
        private static Logger log = LoggerFactory.getLogger(Tree.class);
     
    
        public Tree (int rootValue){
            root = new Node(rootValue);       
        }
    
        @Override
        public int getRoot() {
            
            throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
        }
    
        @Override
        public void addNode(int node) {
            Node currentNode = root;
            Node parentNode = null;
            while (currentNode != null) {
                parentNode = currentNode;
                if (node < currentNode.getNodeValue()) {
                    currentNode = currentNode.getNodeChildLeft();
                } else if (node > currentNode.getNodeValue()) {
                    currentNode = currentNode.getNodeChildRight();
                } else {
                    log.info("Node with value " + node + " already exists.");
                    return;
                }
            }
    
            Node newNode = new Node(node);
            if (node < parentNode.getNodeValue()) {
                parentNode.setNodeChildLeft(newNode);
            } else {
                parentNode.setNodeChildRight(newNode);
            }
            newNode.setParent(parentNode);
            log.info("New Node " + node + " was added.");
        }
    
    
        @Override
        public void deleteNode(int node) {
            //  Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
        }
    
        @Override
        public int searcheNode(int node) {
            Node currentNode = root;
            while (currentNode != null) {
                
                if (node == currentNode.getNodeValue()){
                    return currentNode.getNodeValue();
                }else{
                    if(node < currentNode.getNodeValue()){
                        currentNode = currentNode.getNodeChildLeft();
                        log.info(String.valueOf(currentNode.getNodeValue()));
                    }else{
                        currentNode = currentNode.getNodeChildRight();
                        log.info(String.valueOf(currentNode.getNodeValue()));
                    }
                }
            }
            return -1;
        }
    
        public void inOrderTravers(Node currentNode){
            if (currentNode != null){
                inOrderTravers(currentNode.getNodeChildLeft());
                log.info(String.valueOf(currentNode.getNodeValue()));
                inOrderTravers(currentNode.getNodeChildRight());
            }
        }
    
        public static void main(String[] args) {
            Tree tree = new Tree(12);
            tree.addNode(11);
            tree.addNode(19);
            tree.addNode(10);
            tree.addNode(13);
            tree.searcheNode(13);
            tree.inOrderTravers(root);
    }
}

