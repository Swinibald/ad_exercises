package ch.hslu.ad.Week_1;

import java.util.logging.Logger;

public class Main {  
    static Logger Log = Logger.getLogger(Main.class.getName());     
            public static void main(final String[] args) {
                // Personenwagon erzeugen,
                // mit unterschiedlichen Kapazitäten
                Train train = new Train();
                Wagon w = new Wagon("W001", 60, train,
                    new Wagon("W002", 40, train,
                        new Wagon("W003", 80, train, null)));
                // Verkettung der Wagon

                // Berechnung der Adjecentesamtanzahl Pl
                int gesamt = train.calculateTrainSeats();
                Log.info("Gesamtanzahl Plätze: " + gesamt); 
       

    }
}
