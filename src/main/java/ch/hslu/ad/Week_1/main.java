package ch.hslu.ad.Week_1;

import java.util.logging.Logger;

public class Main {  
    static Logger Log = Logger.getLogger(Main.class.getName());     
            public static void main(final String[] args) {
                // Personenwagon erzeugen,
                // mit unterschiedlichen Kapazitäten
                Train train = new Train();
                Wagon wagon1 = new Wagon("W001", 60, train);
                Wagon wagon2 = new Wagon("W002", 40, train);
                Wagon wagon3 = new Wagon("W003", 80, train);
                // Verkettung der Wagon
                wagon1.setAdjacentWagon(wagon2);
                wagon2.setAdjacentWagon(wagon3);
                // Berechnung der Adjecentesamtanzahl Pl
                int gesamt = train.calculateTrainSeats();
                Log.info("Gesamtanzahl Plätze: " + gesamt); 
       

    }
}
