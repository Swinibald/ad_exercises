package ch.hslu.ad.Week_1.Fibonacci_Zahlen;

import java.util.ArrayList;

public class fibonacci {
ArrayList<Integer> fiboList = new ArrayList<Integer>();



    public int fiboRec(int n){
        if(n <= 1){
            return n;
        } else {
            return fiboRec(n - 1) + fiboRec(n - 2);
            
        }
    }

    public int fiboRec2(int n){
        if(n<= 1){
            return n;
        } else {
            fiboList.add(fiboRec2(n - 1) + fiboRec2(n - 2));
            return fiboList.getLast();
        }

    }


    public int fiboIter(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        if(n<= 1){
            return n;
        } else {
        for(int i = 2 ;i <= n; i++){
            a = b + c;
            c = b;
            b = a;
        System.out.println(a);   
            }
        return a;
            }
    }
    public int NumberOfSymNumbers(int n){
        if (n <= 2){
            n = 10;
        } else {
        n = (n + 1) /2;
        n = (int) Math.pow(10, n) + 10;
            }
        System.out.println(n);
        return n;
    }    
    public static void main (String[] args){
        fibonacci fib = new fibonacci();
        System.out.println(fib.NumberOfSymNumbers(1));
    }
}
