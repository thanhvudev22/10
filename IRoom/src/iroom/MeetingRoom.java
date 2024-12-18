
package iroom;

public class MeetingRoom {
    this.roomNumber = roomNumber;
        this.baseCost = baseCost;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String displayDetails() {
        return "Room Number: " + roomNumber + ", Base Cost: " + baseCost;
    }
}

class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom(int roomNumber, double baseCost, int capacity) {
        super(roomNumber, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String displayDetails() {
        return "Meeting Room Details -> Room Number: " + getRoomNumber() +
               ", Capacity: " + capacity + ", Cost: " + calculateCost();
    }

    public double calculateCost() {
        double cost = getBaseCost();
        if (capacity > 50) {
            cost *= 1.2;
        }
        return cost;
    }
}

class BedRoom extends Room {
    private int numberOfBeds;

    public BedRoom(int roomNumber, double baseCost, int numberOfBeds) {
        super(roomNumber, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public String displayDetails() {
        return "Bed Room Details -> Room Number: " + getRoomNumber() +
               ", Number of Beds: " + numberOfBeds + ", Cost: " + calculateCost();
    }

    public double calculateCost() {
        double cost = getBaseCost();
        if (numberOfBeds >= 3) {
            cost *= 1.1;
        }
        return cost;
    }
}

public class Main {
    public static void main(String[] args) {
        MeetingRoom meetingRoom = new MeetingRoom(101, 200.0, 60);
        BedRoom bedRoom = new BedRoom(202, 150.0, 3);

        System.out.println(meetingRoom.displayDetails());
        System.out.println(bedRoom.displayDetails());
    }
}
}
