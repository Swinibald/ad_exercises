package ch.hslu.ad.Week_1.Einführungs_Aufgabe;

import java.util.ArrayList;

public class Train {
    private ArrayList<Wagon> train = new ArrayList<>();
    private int totalSeats;

    public void addWagon(Wagon wagon) {
        train.add(wagon);
    }

    public int calculateTrainSeats() {
        totalSeats = 0;
        for (Wagon wagon : train) {
            totalSeats += wagon.getSeats();
        }
        return totalSeats;
    }

    public String getTrain() {
        String trainString = "";
        for (Wagon wagon : train) {
            trainString += wagon.getIndex() + " ";
        }
        return trainString;
    }
}
