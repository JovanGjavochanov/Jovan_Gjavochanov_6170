public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan X1");
        Vehicle motorcycle = new Motorcycle("Racer 500");
        ElectricCar electricCar = new ElectricCar("Eclipse EV");

        System.out.println("=== Vehicle Factory Simulation ===");
        car.move();
        car.refuel();
        System.out.println();

        motorcycle.move();
        motorcycle.refuel();
        System.out.println();

        electricCar.move();
        electricCar.refuel();
        electricCar.refuel(45);
    }
}
