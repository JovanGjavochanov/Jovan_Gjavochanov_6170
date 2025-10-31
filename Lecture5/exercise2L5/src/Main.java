public class Main {
    public static void main(String[] args) {
        Utility[] utilities = new Utility[6];
        utilities[0] = new Utility("Electricity", 120.50);
        utilities[1] = new Utility("Water", 65.75);
        utilities[2] = new Utility("Heating", 180.00);
        utilities[3] = new Utility("Internet", 45.99);
        utilities[4] = new Utility("Security System", 95.25);
        utilities[5] = new Utility("Maintenance", 110.40);

        double totalCost = 0;
        double maxPrice = utilities[0].getPrice();
        String mostExpensive = utilities[0].getName();

        for (Utility u : utilities) {
            totalCost += u.getPrice();
            if (u.getPrice() > maxPrice) {
                maxPrice = u.getPrice();
                mostExpensive = u.getName();
            }
        }

        double average = totalCost / utilities.length;

        System.out.println("=== Hero's Hideout Utility Management ===");
        System.out.println("Total Utility Cost: $" + String.format("%.2f", totalCost));
        System.out.println("Most Expensive Utility: " + mostExpensive + " ($" + String.format("%.2f", maxPrice) + ")");
        System.out.println("Average Utility Cost: $" + String.format("%.2f", average));
    }
}
