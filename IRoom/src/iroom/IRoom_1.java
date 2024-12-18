
package iroom;
public abstract class IRoom {

    
    public abstract class Room extends IRoom  {
    private String id;
    private String name;
    private double baseCost;

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public abstract double calculateCost();
    public abstract void displayDetails();
}
}