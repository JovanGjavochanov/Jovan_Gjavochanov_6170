public class ElectricCar extends Vehicle {
    public ElectricCar(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + " glides silently on the road using electric power.");
    }

    @Override
    public void refuel() {
        System.out.println(model + " is charged at the electric station.");
    }

    public void refuel(int chargingTime) {
        System.out.println(model + " is charging for " + chargingTime + " minutes.");
    }
}
