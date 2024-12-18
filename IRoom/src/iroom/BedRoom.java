package iroom;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom(String id, String name, double baseCost, int numberOfBeds) {
        super(id, name, baseCost); // Gọi constructor của lớp cha Room
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        int numberOfBeds = 0;
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double calculateCost() {
        double cost = getBaseCost();
        if (numberOfBeds >= 3) {
            cost *= 1.1;
        }
        return cost;
    }

    public void displayDetails() {
        System.out.println("BedRoom ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Base Cost: " + getBaseCost());
        System.out.println("Number of Beds: " + numberOfBeds);
        System.out.println("Total Cost: " + calculateCost());
    }
}
