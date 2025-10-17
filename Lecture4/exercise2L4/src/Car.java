public class Car {

    private String type;
    private int noseats;
    private String fuelType;
    private String color;

    public Car() {
        this.type = "Sedan";
        this.noseats = 0;
        this.fuelType = "Diesel";
        this.color = "Black";
    }

    public Car(String type, int noseats, String fuelType, String color) {
        this.type = type;
        this.noseats = noseats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoseats() {
        return noseats;
    }

    public void setNoseats(int noseats) {
        this.noseats = noseats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
