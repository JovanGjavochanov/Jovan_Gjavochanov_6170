public class Main {
    public static void main(String[] args) {
        Car heroCar = new Car();

        System.out.println("=== Hero's Dream Car ===");
        heroCar.startEngine();
        heroCar.openAllDoors();
        heroCar.inflateWheel(2);
        heroCar.openTrunk();
        heroCar.closeTrunk();
        heroCar.closeAllDoors();
        heroCar.stopEngine();
    }
}
