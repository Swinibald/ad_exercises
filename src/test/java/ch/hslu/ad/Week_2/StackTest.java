package ch.hslu.ad.Week_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void emptyStack(){
        Stack stack = new Stack(0);
        assertEquals(true, stack.isEmpty());
    }
    @Test
    public void notEmptyStack(){
        Stack stack = new Stack(1);
        stack.push("Wohoo");
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testNumOfElements(){
        Stack stack = new Stack(3);
        stack.push("1");
        stack.push("2");        
        stack.push("3");
        assertEquals(3, stack.getNumOfElements());
    }

    @Test 
    public void testPush(){
        Stack stack = new Stack(2);
        stack.push("1");
        stack.push("2");
        assertEquals("2", stack.pop());
    }

    @Test
    public void testPop(){
        Stack stack = new Stack(2);
        stack.push("1");
        stack.push("2");
        stack.pop();
        assertEquals("1", stack.pop());
    }

    @Test
    public void testSize(){
        Stack stack = new Stack(5);
        stack.push("1");
        assertEquals(5, stack.getSize());
    }
}
