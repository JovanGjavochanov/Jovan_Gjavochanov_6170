public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Sedan", 5, "Petrol", "Blue");

        Car car2 = new Car();

        car2.setType("SUV");
        car2.setNoseats(7);
        car2.setFuelType("Diesel");
        car2.setColor("Black");

        System.out.println("Car 1 Details:");
        System.out.println("Type: " + car1.getType());
        System.out.println("Number of seats: " + car1.getNoseats());
        System.out.println("Fuel Type: " + car1.getFuelType());
        System.out.println("Color: " + car1.getColor());
        System.out.println();

        System.out.println("Car 2 Details:");
        System.out.println("Type: " + car2.getType());
        System.out.println("Number of seats: " + car2.getNoseats());
        System.out.println("Fuel Type: " + car2.getFuelType());
        System.out.println("Color: " + car2.getColor());
    }
}
