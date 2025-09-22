package ch.hslu.ad.Week2_1;

public class Fibonacci {

    private int fibNum[];

    private int fiboRec1(int n) {
        if (n <= 1) { 
            return n; //Rekursionsanker 
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }

    private int fiboRec2(int n){
        if (n <= 1) {
            return n; //Rekursionsanker 
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }

    private int fiboIter(int n){
        if (n <= 1) {
            return n;
        }else{
            while(int i = 0, )
        }

    }





public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fiboRec1(10));
    }
}
