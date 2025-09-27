package ch.hslu.ad.Week2_1;

public class Fibonacci {

    private static int fiboList[];

    public int fiboRec1(int n) {
        if (n <= 1) { 
            return n; //Rekursionsanker 
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }

    public int fiboRec2(int n){
        
        if (n <= 1) {
            return n; //Rekursionsanker
        } else {
            if (fiboList[n] != -1) {
                return fiboList[n];
            }
            fiboList[n] = fiboRec2(n - 1) + fiboRec2(n - 2); //Rekursionsvorschrift
            return fiboList[n];
        }
    }

    public int fiboIter(int n){
            int a = 0;
            int b = 1;
            int c = 0;
            for(int i = n  ;i>=0; i--){
                a = b;
                b = c;
                c = a + b;
            }
            return b;
        }


public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fiboRec1(10));
    }
}
