package ch.hslu.ad.Week_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ListTest<T> {
    
    @Test
    void testAddElement() {
        List<Double> list = new List<Double>();
        list.addElement(9.98);
        assertEquals(9.98, list.getFirstNode().getData());

    }

    @Test
    void testAddMultipleElements() {
        List<Double> list = new List<Double>();
        list.addElement(9.98);
        list.addElement(12.0);
        assertEquals(12.0, list.getFirstNode().getData());
    }

    @Test
    void testNextNode() {
        List<Double> list = new List<Double>();
        list.addElement(9.98);
        list.addElement(9.98);
        list.addElement(12.0);
        list.addElement(898.1);
        assertEquals(12.0, list.getFirstNode().getNextNode().getData());
    }

    @Test
    void testLastNode() {
        List<Double> list = new List<Double>();
        list.addElement(9.98);
        list.addElement(9.99);
        list.addElement(12.0);
        list.addElement(898.1);
        assertEquals(9.98, list.getFirstNode().getNextNode().getNextNode().getNextNode().getData());
    }

    @Test
    void testGetFirstNode() {
        List<Integer> list = new List<Integer>();
        list.addElement(12);
        assertEquals(12, list.getFirstNode().getData());

    }

    @Test
    void testSize() {
        List<String> list = new List<String>();
        list.addElement("abc");
        assertEquals(1, list.size());
    }
}
