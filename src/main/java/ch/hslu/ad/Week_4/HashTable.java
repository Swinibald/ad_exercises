package ch.hslu.ad.Week_4;



@SuppressWarnings("rawtypes")
public class HashTable implements HashTableInterface{

    private Object[] hashTable;

    public HashTable() {
    }

    @Override
    public void addHash(Object element) {
        int index = Math.abs(element.hashCode()) % 10;
        hashTable[index] = element;
    }

    @Override
    public boolean search(Object element) {
        int i = 0;
        while(i != 10){
            if (element.equals(hashTable[i])){
                return true;
            }
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
}
