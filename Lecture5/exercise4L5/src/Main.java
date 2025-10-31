public class Main {
    public static void main(String[] args) {
        Car heroCar = new Car();

        System.out.println("=== Emergency Situation: Wheel Deflation ===");
        heroCar.startEngine();
        heroCar.simulateEmergency();
        heroCar.refuel(30);
        heroCar.startEngine();
    }
}
