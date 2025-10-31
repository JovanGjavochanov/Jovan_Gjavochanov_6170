public class Vehicle {
    private String model;
    private int passengers;
    private double tankCapacity;
    private double fuelConsumption;

    public Vehicle(String model, int passengers, double tankCapacity, double fuelConsumption) {
        this.model = model;
        this.passengers = passengers;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double calculateRange() {
        return (tankCapacity / fuelConsumption) * 100;
    }

    public String getModel() {
        return model;
    }

    public void compareRange(Vehicle other) {
        double thisRange = this.calculateRange();
        double otherRange = other.calculateRange();

        System.out.println("Comparing " + model + " and " + other.getModel() + ":");
        if (thisRange > otherRange) {
            System.out.println(model + " can travel farther (" + (int)thisRange + " km vs " + (int)otherRange + " km).");
        } else if (thisRange < otherRange) {
            System.out.println(other.getModel() + " can travel farther (" + (int)otherRange + " km vs " + (int)thisRange + " km).");
        } else {
            System.out.println("Both vehicles have the same range (" + (int)thisRange + " km).");
        }
    }

    public void compareRange(Vehicle v1, Vehicle v2) {
        double r1 = v1.calculateRange();
        double r2 = v2.calculateRange();
        double r3 = this.calculateRange();

        System.out.println("Comparing three vehicles:");
        System.out.println(model + ": " + (int)r3 + " km");
        System.out.println(v1.getModel() + ": " + (int)r1 + " km");
        System.out.println(v2.getModel() + ": " + (int)r2 + " km");

        double maxRange = Math.max(r3, Math.max(r1, r2));

        if (maxRange == r3) System.out.println(model + " has the best range!");
        else if (maxRange == r1) System.out.println(v1.getModel() + " has the best range!");
        else System.out.println(v2.getModel() + " has the best range!");
    }
}
