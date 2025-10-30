package ch.hslu.ad.week2_4;

import java.util.Stack;

import ch.hslu.ad.Week2_2.StackImp;

public class Prod {

    public static int[] arrayIntProd(int size){
        int[] strings = new int[size];
        int i = 0;
        while(size != i){
            strings[i] = i;
            i++;
        }
        return strings;
    }

    public static void testUtilStack(){
        int[] stackObj = arrayIntProd(10000000);
        Stack stack = new Stack<>();
        long elapsedTIme = System.nanoTime()/1000;
        stack.setSize(10000000);
        for (int i = 0; stackObj.length > i; i++) {
            stack.add(stackObj[i]);

        }
        elapsedTIme = System.nanoTime()/1000 - elapsedTIme;
        System.out.print("UtilStack: " + elapsedTIme + " microS, ");
    }

    public static void testMyStack(){
        int[] stackObj = arrayIntProd(10000000);
        StackImp stack = new StackImp(10000000);
        long elapsedTIme = System.nanoTime()/1000;
        for (int i = 0; stackObj.length > i; i++) {
            stack.push(stackObj[i]);
        }
        elapsedTIme = System.nanoTime()/1000 - elapsedTIme;
        System.out.print("MyStack: " + elapsedTIme + " microS, ");
    }

    public static void main(String[] args) {
        testMyStack();
        testUtilStack();
    }
}
