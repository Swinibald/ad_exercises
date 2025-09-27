package ch.hslu.ad.Week2_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void fiboiterTest(){
        Fibonacci fib = new Fibonacci();
        assertEquals(13, fib.fiboIter(7));
    }
}
