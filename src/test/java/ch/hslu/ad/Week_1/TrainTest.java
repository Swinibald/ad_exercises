package ch.hslu.ad.Week_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrainTest {
    @Test
    void testAddWagon() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        assertEquals("W1 ", train.getTrain());
    }

    @Test
    void testCalculateTrainSeats() {
        Train train = new Train();
        Wagon wagon1 = new Wagon("W1", 10, train);
        Wagon wagon2 = new Wagon("W2", 20, train);
        assertEquals(30, train.calculateTrainSeats());
    }
}
