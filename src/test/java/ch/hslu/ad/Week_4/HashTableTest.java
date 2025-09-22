package ch.hslu.ad.Week_4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class HashTableTest {
    @Test
    void testAddHash() {
        HashTable hash = new HashTable();
        int element = 1000;
        int index = Math.abs(Integer.valueOf(element).hashCode()) % 9;
        hash.addHash(Integer.valueOf(element));
        assertEquals(1000, hash.getTable()[index]);
    }

    @Test
    void testAddHashDupe() {
        HashTable hash = new HashTable();
        int element = 1;
        int element1 = 11;
       
        hash.addHash(Integer.valueOf(element));
        hash.addHash(Integer.valueOf(element1));
        assertEquals(element1, hash.search(element1));
    }


    @Test
    void testDelete() {
        HashTable hash = new HashTable();
        int element = 1000;
        int index = Math.abs(Integer.valueOf(element).hashCode()) % 9;
        hash.addHash(Integer.valueOf(element));
        hash.delete(element);
        assertEquals(null, hash.getTable()[index]);
    }

    @Test
    void testIsFull() {
        HashTable hash = new HashTable();
        int element1 = 1;
        int element2 = 2;
        int element3 = 3;
        int element4 = 4;
        int element5 = 5;
        int element6 = 6;
        int element7 = 7;
        int element8 = 8;
        int element9 = 9;
        int element10 = 1;
        hash.addHash(Integer.valueOf(element1));
        hash.addHash(Integer.valueOf(element2));
        hash.addHash(Integer.valueOf(element3));
        hash.addHash(Integer.valueOf(element4));
        hash.addHash(Integer.valueOf(element5));
        hash.addHash(Integer.valueOf(element6));
        hash.addHash(Integer.valueOf(element7));
        hash.addHash(Integer.valueOf(element8));
        hash.addHash(Integer.valueOf(element9));
        hash.addHash(Integer.valueOf(element10));
        assertTrue(hash.isFull());
    }

    @Test
    void testIsFullOverFlow() {
        HashTable hash = new HashTable();
        int element1 = 1;
        int element2 = 2;
        int element3 = 3;
        int element4 = 4;
        int element5 = 5;
        int element6 = 6;
        int element7 = 7;
        int element8 = 8;
        int element9 = 9;
        int element10 = 1;
        int element11 = 123;
        hash.addHash(Integer.valueOf(element1));
        hash.addHash(Integer.valueOf(element2));
        hash.addHash(Integer.valueOf(element3));
        hash.addHash(Integer.valueOf(element4));
        hash.addHash(Integer.valueOf(element5));
        hash.addHash(Integer.valueOf(element6));
        hash.addHash(Integer.valueOf(element7));
        hash.addHash(Integer.valueOf(element8));
        hash.addHash(Integer.valueOf(element9));
        hash.addHash(Integer.valueOf(element10));
        hash.addHash(Integer.valueOf(element11));
    }

    @Test
    void isEmpty(){
        HashTable hash = new HashTable();  
        assertFalse(hash.isFull());
    }

    @Test
    void testSearch() {
        HashTable hash = new HashTable();
        int element1 = 1;
        int element2 = 2;
        int element3 = 3;
        int element4 = 4;
        int element5 = 5;
        int element6 = 6;
        int element7 = 7;
        int element8 = 8;
        int element9 = 9;
        int element10 = 1;
        hash.addHash(Integer.valueOf(element1));
        hash.addHash(Integer.valueOf(element2));
        hash.addHash(Integer.valueOf(element3));
        hash.addHash(Integer.valueOf(element4));
        hash.addHash(Integer.valueOf(element5));
        hash.addHash(Integer.valueOf(element6));
        hash.addHash(Integer.valueOf(element7));
        hash.addHash(Integer.valueOf(element8));
        hash.addHash(Integer.valueOf(element9));
        hash.addHash(Integer.valueOf(element10));
        assertEquals(true, hash.search(element10));
    }
}
