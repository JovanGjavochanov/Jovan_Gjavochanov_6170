public class Main {
    public static void main(String[] args) {
        King king = new King("Arthur", 55);
        Queen queen = new Queen("Guinevere", 52);
        Prince prince = new Prince("Lancelot", 25);

        System.out.println("=== Royal Family Members ===");
        king.printDetails();
        king.rule();
        System.out.println();

        queen.printDetails();
        queen.hostBanquet();
        System.out.println();

        prince.printDetails();
        prince.train();
    }
}
