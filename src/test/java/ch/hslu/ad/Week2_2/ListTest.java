package ch.hslu.ad.Week2_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ListTest {
    @Test
    void testAddSuccess() {
        List<Integer> list = new List<>();
        assertTrue(list.add(12));
    }

    @Test
    void testSearchSuccess(){
        List<Integer> list = new List<>();
        list.add(12);
        assertTrue(list.search(12));
    }

    @Test
    void testSearchFail(){
        List<Integer> list = new List<>();
        list.add(12);
        assertFalse(list.search(13));
    }
    @Test 
    void testDeleteFirstError(){
        List<Integer> list = new List<>();
        assertEquals(null, list.deleteFirst());
    }
    @Test
    void testDeleteFirstSuccess(){
        List<Integer> list = new List<>();
        list.add(12);
        assertEquals(12, list.deleteFirst());
    }

    @Test
    void testDeleteSuccess(){
        List<Integer> list = new List<>();
        list.add(12);
        list.add(110);
        list.add(14);
        assertTrue(list.delete(12));
    }

    @Test
    void testDeleteFail(){
        List<Integer> list = new List<>();
        list.add(12);
        list.add(110);
        list.add(14);
        assertFalse(list.delete(15));
    }


    @Test
    void testSizeAdd() {
        List<Integer> list = new List<>();
        list.add(12);
        list.add(7);
        list.add(9);
        list.add(111);
        assertEquals(4, list.size());
    }

    @Test
    void testSizeDelete() {
        List<Integer> list = new List<>();
        list.add(12);
        list.add(7);
        list.add(9);
        list.add(111);
        list.delete(111);
        list.delete(7);
        assertEquals(2, list.size());
    }

    @Test
    void testSizeDeleteFirst() {
        List<Integer> list = new List<>();
        list.add(12);
        list.add(7);
        list.add(9);
        list.add(111);
        list.deleteFirst();
        list.deleteFirst();
        assertEquals(2, list.size());
    }

    @Test
    void testSizeAll() {
        List<Integer> list = new List<>();
        list.add(12);
        list.add(7);
        list.delete(12);
        list.add(111);
        list.delete(111);
        list.deleteFirst();
        list.add(0);
        assertEquals(1, list.size());
    }
}
