public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("HeroMobile", "Red", 450);
        Car car2 = new Car("HeroMobile", "Red", 450);
        Car car3 = car1;

        System.out.println("=== Vehicle Comparison: Choose the Best Companion ===");
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
        System.out.println();

        System.out.println("car1 == car2 : " + (car1 == car2));
        System.out.println("car1.equals(car2) : " + car1.equals(car2));
        System.out.println("car1 == car3 : " + (car1 == car3));
        System.out.println("car1.equals(car3) : " + car1.equals(car3));
        System.out.println();

        car3 = new Car("HeroMobile", "Black", 450);
        System.out.println("After modification, car3: " + car3);
        System.out.println("car1 == car3 : " + (car1 == car3));
        System.out.println("car1.equals(car3) : " + car1.equals(car3));
    }
}
