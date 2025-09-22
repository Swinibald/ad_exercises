package ch.hslu.ad.Week_4;


import java.util.Stack;

public class Main {


    public static void mainA(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.ensureCapacity(100000);
        int[] bigArray = base.createArray(100000); // Array korrekt ausgeben
        long time = System.nanoTime();
        for (int i = 100000; i != 0; i = i-1){
            s.push(bigArray[i-1]);
        }
        time = System.nanoTime() - time;
        System.out.println(time);
    }

    public static void main(String[] args) {
        
        //Stack ownStack = new Stack(100000);
        long time = System.nanoTime();
        for (int i = 100000; i != 0; i = i-1){
         //   ownStack.push(bigArray[i-1]);
        }
        time = System.nanoTime() - time;
        System.out.println(time);
    }

}
