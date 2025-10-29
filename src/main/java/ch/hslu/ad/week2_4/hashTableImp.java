package ch.hslu.ad.week2_4;

public class hashTableImp implements hashTable{

    private final int size;
    private int hashTable[];


    public hashTableImp(int size){
        this.size = size;

    }

    @Override
    public void add(int data) {
        hashTable[convertToHash(data)] = data;
        }

    @Override
    public boolean search(int data) {
        if (data == hashTable[convertToHash(data)]) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean delete(int data) {
        if (data == hashTable[convertToHash(data)]) {
            hashTable[convertToHash(data)] = 0;
            return true;
        }else{
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
        String string = null;
        for (int i : hashTable) {
            string = string + hashTable[i];
        }
        return string;
    }

    public static void main(String[] args) {
        hashTableImp hasht = new hashTableImp(10);
        hasht.add(100394);
        hasht.add(120430394);
        hasht.add(14294);
        hasht.add(1200394);
        hasht.toString();
    }
}
