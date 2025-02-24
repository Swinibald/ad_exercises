package ch.hslu.ad.Week_1.Fibonacci_Zahlen;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class fibonacciTest {
    @Test
    void testFiboRecLessTwo() {
        fibonacci fib = new fibonacci();
        assertEquals(1, fib.fiboRec(1));
    }
    void testFiboRec() {
        fibonacci fib = new fibonacci();
        assertEquals(34, fib.fiboRec(9));
    }
    void testFiboRecHigh() {
        fibonacci fib = new fibonacci();
        assertEquals(354224848179261915075L, fib.fiboRec(100));
    }
}
