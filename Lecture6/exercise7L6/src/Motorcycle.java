public class Motorcycle extends Vehicle {
    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " zooms swiftly through traffic.");
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueled with premium fuel.");
    }
}
