package ch.hslu.ad.Week_2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTest {
    private List<Double> list;  // Gemeinsame Liste für Tests

    @BeforeEach
    void setUp() {
        list = new List<>();
    }

    @Test
    void testAddElement() {
        list.addElement(9.98);
        assertEquals(9.98, list.getFirstNode().getData());
    }

    @Test
    void testAddMultipleElements() {
        list.addElement(9.98);
        list.addElement(12.0);
        assertEquals(12.0, list.getFirstNode().getData()); // Stack-Prinzip (Last In First Out)
    }

    @Test
    void testSearchFound() {
        list.addElement(12.0);
        list.addElement(9.99);
        list.addElement(9.98);
        assertNotNull(list.search(9.99)); // Sollte gefunden werden
    }

    @Test
    void testSearchNotFound() {
        list.addElement(9.98);
        list.addElement(12.0);
        assertNull(list.search(123.45)); // Sollte null sein
    }

    @Test
    void testRemoveHead() {
        list.addElement(9.98);
        list.addElement(12.0);
        list.removeHead();
        assertEquals(9.98, list.getFirstNode().getData());
    }
    @Test
    void testRetrunHead() {
        list.addElement(9.98);
        list.addElement(12.0);
        assertEquals(12.0, list.removeHead().getData());
    }

    @Test
    void testSearchAndDestroy(){
        list.addElement(12.0);
        list.addElement(9.99);
        list.addElement(9.98);
        assertEquals(9.99, list.searchAndDestroy(9.99).getData());
    }

    @Test
    void testSearchAndDestroyEmpty(){
        assertNull(list.searchAndDestroy(9.99));
    }

    @Test
    void testSearchAndDestroyEnd(){
        list.addElement(12.0);
        list.addElement(9.99);
        list.addElement(9.98);  
        assertEquals( 12.0, list.searchAndDestroy(12.0).getData());      
    }

    @Test
    void testSearchAndDestroyNA(){
        list.addElement(12.0);
        list.addElement(9.99);
        list.addElement(9.98); 
        assertNull(list.searchAndDestroy(8.0));      
    }

    @Test
    void testSearchAndDestroyHead(){
        list.addElement(12.0);
        list.addElement(9.99);
        list.addElement(9.98); 
        assertEquals( 9.98, list.searchAndDestroy(9.98).getData());      
    }
}
