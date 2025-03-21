package ch.hslu.ad.Week_4;

public class base {
    public static int[] createArray(int size) {        
        int[] bigArray = new int[size]; // Array initialisieren

        for (int i = 0; i < size; i++) {
            bigArray[i] = i; // Werte setzen
        }

        return bigArray;
    }
}
