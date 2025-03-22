package ch.hslu.ad.Week_4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("rawtypes")
public class HashTable implements HashTableInterface{

    private static Logger log = LoggerFactory.getLogger(HashTable.class);
    private Object[] hashTable = null;

    public HashTable() {
        this.hashTable = new Object[10];
    }

    @Override
    public void addHash(Object element) {
        int index = Math.abs(element.hashCode()) % 9;
        boolean foundPlace = false;
        while (foundPlace == false){
            if (!isFull()){
            if(hashTable[index] == null){
                hashTable[index] = element; 
                foundPlace = true;
            }else{
                index++;
            }}else{
                log.info("Table full");
                throw new IllegalStateException("Table is full");
            }
        }
            
    }

    @Override
    public boolean search(Object element) {
        int i = 0;
        while(i != 10){
            if (element.equals(hashTable[i])){
                return true;
            }else
            i++;
        }
        return false;
    }

    @Override
    public void delete(Object element) {
        int i = 0;
        while(i != 10){
            if (element.equals(hashTable[i])){
                hashTable[i] = null;
            }
            i++;
        }
    }

    public boolean isFull(){
            for (int i = 0; i != 10; i++){
                if (hashTable[i] == null){
                    return false;
                }
           
        } return true;
    }
    public Object[] getTable(){
        return hashTable;
    }
}
