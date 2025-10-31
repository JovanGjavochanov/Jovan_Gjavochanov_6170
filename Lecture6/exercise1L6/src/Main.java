public class Main {
    public static void main(String[] args) {
        Egg regularEgg = new Egg();
        OstrichEgg ostrichEgg = new OstrichEgg();

        System.out.println("=== Regular Egg ===");
        regularEgg.EGG();
        regularEgg.print();

        System.out.println();

        System.out.println("=== Ostrich Egg ===");
        ostrichEgg.EGG();
        ostrichEgg.print();
    }
}
