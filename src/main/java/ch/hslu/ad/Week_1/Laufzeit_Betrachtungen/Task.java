package ch.hslu.ad.Week_1.Laufzeit_Betrachtungen;

import java.util.logging.Logger;

public class Task {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    Logger log = Logger.getLogger(Task.class.getName());

    public int task1() {
        a = a + 1;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            log.info("could not sleep");
        }
        return a;
    }

    public int task2() {
        b = b + 1;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            log.info("could not sleep");
        }
        return b;
    }

    public int task3() {
        c = c + 1;
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            log.info("could not sleep");
        }
        return c;
    }

    public void task(final int n) {
        task1();
        task1();
        task1();
        task1();
        for (int i = 0; i < n; i++) {
            task2();
            task2();
            task2();
            for (int j = 0; j < n; j++) {
                task3();
                task3();
            }
        }
        System.out.println(a + "," + b + "," + c);
    }

    public static void main(String[] args) {
        Task task = new Task();
        long startTime = System.nanoTime(); // Start time
        task.task(100);
        long endTime = System.nanoTime(); // End time
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("Execution time: " + duration + " ms");
    }
    // Output: 4,300,200
    // Execution time: 100 ms
}
