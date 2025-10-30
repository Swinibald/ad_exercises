package ch.hslu.ad.week2_4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class hashTableImp implements hashTable{

    private final int size;
    private int fillLevel = 0;
    private static final Logger log = LoggerFactory.getLogger(hashTableImp.class);
    
    int[] hashTable;

    public hashTableImp(int size){
        this.size = size;
        this.hashTable = new int[size];

    }

    @Override
    public void add(int data) {
        if (hashTable[convertToHash(data)] == 0) {
            hashTable[convertToHash(data)] = data;
            fillLevel++;
            }else{
                log.error("Input already in List.");
            }
        }

    @Override
    public boolean search(int data) {
        if (data == hashTable[convertToHash(data)]) {
            return true;
        }else{
            log.info("Input not found.");
            return false;
        }
    }

    @Override
    public boolean delete(int data) {
        if (data == hashTable[convertToHash(data)]) {
            hashTable[convertToHash(data)] = 0;
            fillLevel--;
            return true;
        }else{
            log.info("To Deleteable object not in list.");
            return false;
            
        }
    }

    @Override
    public int searchHash(int hash) {
        if (hashTable[hash] != 0) {
            return hashTable[hash];
        }else{
            return 0;
        }
    }

    @Override
    public int convertToHash(int data) {
        int hash = Integer.hashCode(data);
        return (hash % (size-1));
    }

    @Override
    public String toString(){
        String string = "";
        for (int i = 0; i < hashTable.length; i++) {
            if (string.isEmpty()) {
                string = string +  hashTable[i];
            }else{
                string = string + ", " + hashTable[i];
            }
        }
        return string;
    }

    public int size(){
        return fillLevel;
    }

    public boolean isFull(){
        if (fillLevel == size) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        hashTableImp hasht = new hashTableImp(10);
        hasht.add(104);
        hasht.add(430394);
        hasht.add(1424);
        hasht.add(12094);
        hasht.add(10034);
        hasht.add(1200394);
        hasht.add(14294);
        hasht.add(100394);
        hasht.add(10394);
        hasht.add(14);
        hasht.add(144);
        System.out.println(hasht.toString());
    }
}
