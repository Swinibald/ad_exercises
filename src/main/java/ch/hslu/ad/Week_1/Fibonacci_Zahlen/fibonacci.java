package ch.hslu.ad.Week_1.Fibonacci_Zahlen;

import java.util.ArrayList;

public class fibonacci {
private long a;
private long b;
private long c;
ArrayList fibs = new ArrayList();


public fibonacci(){
}

    public long fiboRec(long n){
        if(n <= 1){
            return n;
        } else {
            return fiboRec2(n - 1) + fiboRec2(n - 2);
        }
    }

    public long fiboRec2(long n){
        if(n<= 1){
            return n;
        } else {
            
        }

    }
    public static void main (String[] args){
        fibonacci fib = new fibonacci();
        System.out.println(fib.fiboRec(3));
    }
}
