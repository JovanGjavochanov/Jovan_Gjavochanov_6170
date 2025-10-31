public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " drives smoothly on the highway.");
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueled with gasoline at the station.");
    }
}
