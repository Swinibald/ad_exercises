package ch.hslu.ad;

public class Task {
    private int a;
    private int b;
    private int c;

    public int task1() {
        a = a++;
        return a;
    }

    public int task2() {
        b = b++;
        return b;
    }

    public int task3() {
        c = c++;
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

}
