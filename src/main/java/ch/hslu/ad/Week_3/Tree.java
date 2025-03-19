package ch.hslu.ad.Week_3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Tree implements treeInterface {
    private int root;
    private static Logger log = LoggerFactory.getLogger(Tree.class);
 

    public Tree (int root){
        this.root = root;       
    }

    @Override
    public int getRoot() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoot'");
    }

    @Override
    public void addNode(int node) {
        Node currentNode = new Node(root);
        Node parentNode = new Node(root);
        while (currentNode != null) {

            if(node < currentNode.getNodeValue()){
                parentNode = currentNode;
                currentNode = currentNode.getNodeChildLeft();
                log.info(String.valueOf(currentNode.getNodeValue()));
            } else if (node > currentNode.getNodeValue()) {
                currentNode = currentNode.getNodeChildRight();
                log.info(String.valueOf(currentNode.getNodeValue()));
            }else{
                currentNode.setParent(parentNode);
                log.info("New Node "+String.valueOf(currentNode.getNodeValue()) +" was set.");
            }
        }       
    }


    @Override
    public void deleteNode(int node) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteNode'");
    }

    @Override
    public int searcheNode(int node) {
        Node currentNode = new Node(root);
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

    public void sort(){

    }

}
