public class Main {
    public static void main(String[] args) {

        Car[] fleet = new Car[5];

        fleet[0] = new Car("Sedan", 5, "Petrol", "Blue");
        fleet[1] = new Car("SUV", 7, "Diesel", "Black");
        fleet[2] = new Car("Truck", 2, "Diesel", "White");
        fleet[3] = new Car("Hatchback", 4, "Electric", "Red");
        fleet[4] = new Car(); // default values

        System.out.println("Fleet Details:\n");
        displayFleet(fleet);

        Car largestCar = findCarWithMostSeats(fleet);
        System.out.println("Car with the most seats:");
        largestCar.displayCarInfo();
    }

    public static void displayFleet(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + (i + 1) + ":");
            cars[i].displayCarInfo();
        }
    }

    public static Car findCarWithMostSeats(Car[] cars) {
        Car mostSeatsCar = cars[0];
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getNoseats() > mostSeatsCar.getNoseats()) {
                mostSeatsCar = cars[i];
            }
        }
        return mostSeatsCar;
    }
}
