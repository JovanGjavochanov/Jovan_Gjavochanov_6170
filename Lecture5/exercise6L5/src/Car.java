public class Car {
    private String model;
    private String color;
    private double enginePower;

    public Car(String model, String color, double enginePower) {
        this.model = model;
        this.color = color;
        this.enginePower = enginePower;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getEnginePower() {
        return enginePower;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        return model.equals(other.model) &&
                color.equals(other.color) &&
                enginePower == other.enginePower;
    }

    @Override
    public String toString() {
        return model + " (" + color + ", " + enginePower + " HP)";
    }
}
