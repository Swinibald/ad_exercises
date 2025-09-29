package ch.hslu.ad.Week2_2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackImpTest {

    @Test
    void testIsEmptyInitially() {
        StackImp stack = new StackImp(2);
        assertTrue(stack.isEmpty(), "New stack should be empty");
    }

    @Test
    void testIsNotEmptyAfterPush() {
        StackImp stack = new StackImp(2);
        stack.push("value");
        assertFalse(stack.isEmpty(), "Stack should not be empty after push");
    }

    @Test
    void testIsFullAfterFill() {
        StackImp stack = new StackImp(1);
        stack.push("value");
        assertTrue(stack.isFull(), "Stack should be full after reaching capacity");
    }

    @Test
    void testPushAndPopSingleElement() {
        StackImp stack = new StackImp(2);
        stack.push("hello");
        String result = stack.pop();
        assertEquals("hello", result, "Popped value should match pushed value");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping last element");
    }

    @Test
    void testLifoOrder() {
        StackImp stack = new StackImp(2);
        stack.push("first");
        stack.push("second");
        assertEquals("second", stack.pop(), "Last pushed element should be popped first");
        assertEquals("first", stack.pop(), "First pushed element should be popped last");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    void testPopFromEmptyReturnsNull() {
        StackImp stack = new StackImp(2);
        assertNull(stack.pop(), "Popping from empty stack should return null");
    }

    @Test
    void testPushIntoFullReturnsFalse() {
        StackImp stack = new StackImp(1);
        assertTrue(stack.push("one"), "First push should succeed");
        assertFalse(stack.push("two"), "Pushing into full stack should return false");
    }

    @Test
    void testMultiplePushAndPop() {
        StackImp stack = new StackImp(3);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals("C", stack.pop());
        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
        assertTrue(stack.isEmpty(), "Stack should be empty after popping everything");
    }

    @Test
    void testBoundaryConditionSizeOne() {
        StackImp stack = new StackImp(1);
        assertTrue(stack.push("only"));
        assertTrue(stack.isFull());
        assertEquals("only", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testNullValuePush() {
        StackImp stack = new StackImp(2);
        assertTrue(stack.push(null), "Stack should accept null values unless explicitly forbidden");
        assertNull(stack.pop(), "Popped value should be null if null was pushed");
    }
}
