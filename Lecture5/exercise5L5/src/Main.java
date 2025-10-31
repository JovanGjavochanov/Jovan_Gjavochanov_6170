public class Main {
    public static void main(String[] args) {
        double[] tireWear = {20, 35, 60, 10};
        SmartDashboard dashboard = new SmartDashboard(15, 60, tireWear, 85);

        dashboard.displayDashboard();

        System.out.println("=== After Long Mission ===");
        dashboard.updateFuel(10);
        dashboard.updateTireWear();
        dashboard.displayDashboard();
    }
}
