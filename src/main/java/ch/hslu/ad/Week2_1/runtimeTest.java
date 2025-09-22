package ch.hslu.ad.Week2_1;

import java.util.logging.Logger;

public class runtimeTest {

    static int counterTask1 = 0;
    static int counterTask2 = 0;
    static int counterTask3 = 0;
    static Logger logger = Logger.getLogger(runtimeTest.class.getName());

    private static void task1(){
        counterTask1++;
    }

    private static void task2(){
        counterTask2++;
    }

    private static void task3(){
        counterTask3++;
    }

    public static void task(final int n) {
        task1(); 
        task1(); 
        task1(); 
        task1();
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            for (int j = 0; j < n; j++) {
                task3(); task3();
            }
        }
    }

    public static void main(String[] args) {
        task(10);
        logger.info("After task(10):");
        logger.info("Task 1 counter: " + counterTask1);
        logger.info("Task 2 counter: " + counterTask2);
        logger.info("Task 3 counter: " + counterTask3);
    }
}
