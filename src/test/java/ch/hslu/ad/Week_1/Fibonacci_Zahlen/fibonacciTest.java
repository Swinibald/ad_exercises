package ch.hslu.ad.Week_1.Fibonacci_Zahlen;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class fibonacciTest {
    @Test
    void testFiboRecLessTwo() {
        fibonacci fib = new fibonacci();
        assertEquals(1, fib.fiboRec(1));
    }
    @Test
    void testFiboRec() {
        fibonacci fib = new fibonacci();
        assertEquals(34, fib.fiboRec(9));
    }
    @Test
    void testFiboRecHigh() {
        fibonacci fib = new fibonacci();
        assertEquals(6765 , fib.fiboRec(20));
    }
    @Test
    void testFiboRec2LessTwo() {
        fibonacci fib = new fibonacci();
        assertEquals(1, fib.fiboRec2(1));
    }
    @Test
    void testFiboRec2() {
        fibonacci fib = new fibonacci();
        assertEquals(34, fib.fiboRec2(9));
    }
    @Test
    void testFiboRec2High() {
        fibonacci fib = new fibonacci();
        assertEquals(6765 , fib.fiboRec2(20));
    }

    @Test
    void testFiboIterLessTwo() {
        fibonacci fib = new fibonacci();
        assertEquals(1, fib.fiboIter(1));
    }
    @Test
    void testFiboIter() {
        fibonacci fib = new fibonacci();
        assertEquals(34, fib.fiboIter(9));
    }
    @Test
    void testFiboIterHigh() {
        fibonacci fib = new fibonacci();
        assertEquals(6765 , fib.fiboIter(20));
    }
    

}
