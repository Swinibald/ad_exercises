/* package ch.hslu.ad.Week_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class WagonTest {
    @Test
    void testEquals() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        EqualsVerifier.forClass(Wagon.class).verify();
    }

    @Test
    void testGetAdjacentWagon() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        Wagon adjacentWagon = new Wagon("W2", 20, train);
        wagon.setAdjacentWagon(adjacentWagon);
        assertEquals(adjacentWagon, wagon.getAdjacentWagon());
    }

    @Test
    void testGetIndex() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        assertEquals("W1", wagon.getIndex());
    }

    @Test
    void testGetSeats() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        assertEquals(10, wagon.getSeats());

    }

    @Test
    void testHashCode() {


    }

    @Test
    void testSetIndex() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        wagon.setIndex("W2");
        assertEquals("W2", wagon.getIndex());
    }

    @Test
    void testSetSeats() {
        Train train = new Train();
        Wagon wagon = new Wagon("W1", 10, train);
        wagon.setSeats(0);
        assertEquals(0 , wagon.getSeats());
    }
}
 */