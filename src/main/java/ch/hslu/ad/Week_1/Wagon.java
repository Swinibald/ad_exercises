package ch.hslu.ad.Week_1;

public class Wagon {
    private int seats;
    private Wagon adjacentWagon;
    private String index;

    public Wagon(String index, int seats, Train train, Wagon adjacentWagon) {
        this.seats = seats;
        this.index = index;
        this.adjacentWagon = adjacentWagon;
        train.addWagon(this); // Add this wagon to the provided train
    }

    public Wagon getAdjacentWagon() {
        return adjacentWagon;
    }

    public void setAdjacentWagon(Wagon adjacentWagon) {
        this.adjacentWagon = adjacentWagon;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + seats;
        result = prime * result + ((index == null) ? 0 : index.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Wagon other = (Wagon) obj;
        if (seats != other.seats)
            return false;
        if (index == null) {
            if (other.index != null)
                return false;
        } else if (!index.equals(other.index))
            return false;
        return true;
    }
}
