public class Main {
    public static void main(String[] args) {
        Vehicle heroCar = new Vehicle("Mavrik", 2, 60, 8);
        Vehicle dragonRider = new Vehicle("Ghost", 1, 80, 10);
        Vehicle skyCruiser = new Vehicle("Sindra", 4, 100, 12);

        System.out.println("=== Hero's Vehicle Journey ===");
        System.out.println(heroCar.getModel() + " can travel " + (int)heroCar.calculateRange() + " km on a full tank.");
        System.out.println(dragonRider.getModel() + " can travel " + (int)dragonRider.calculateRange() + " km on a full tank.");
        System.out.println(skyCruiser.getModel() + " can travel " + (int)skyCruiser.calculateRange() + " km on a full tank.");
        System.out.println();

        heroCar.compareRange(dragonRider);
        System.out.println();
        heroCar.compareRange(dragonRider, skyCruiser);
    }
}
