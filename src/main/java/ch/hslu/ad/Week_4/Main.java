package ch.hslu.ad.Week_4;

public class Main {


    public static void main(String[] args) {
        long time = System.nanoTime();
        base.createArray(1); // Array korrekt ausgeben
        time = System.nanoTime() - time;
        System.out.println(time);
    }

}
