import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SmartDashboard {
    private double fuelLevel;
    private double maxFuel;
    private double[] tireWear;
    private double engineEfficiency;

    public SmartDashboard(double fuelLevel, double maxFuel, double[] tireWear, double engineEfficiency) {
        this.fuelLevel = fuelLevel;
        this.maxFuel = maxFuel;
        this.tireWear = tireWear;
        this.engineEfficiency = engineEfficiency;
    }

    public void displayDashboard() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("=== Hero’s Smart Dashboard ===");
        System.out.println("Current Date & Time: " + now.format(dateFormat));

        System.out.println("Fuel Level: " + String.format("%.1f", fuelLevel) + "L / " + maxFuel + "L");
        checkFuelStatus();

        System.out.println("Tire Status:");
        for (int i = 0; i < tireWear.length; i++) {
            double wearPercent = Math.min(100, Math.max(0, tireWear[i]));
            System.out.println("  Tire " + (i + 1) + ": " + wearPercent + "% wear");
            if (wearPercent > 70) {
                System.out.println("  ⚠️ Warning: Tire " + (i + 1) + " needs replacement soon!");
            }
        }

        calculateEfficiency();
        System.out.println("Engine Efficiency: " + String.format("%.2f", engineEfficiency) + "%");
        System.out.println("==============================\n");
    }

    private void checkFuelStatus() {
        double fuelPercent = (fuelLevel / maxFuel) * 100;
        if (fuelPercent < 20) {
            String alert = "ALERT: Low fuel! Only " + String.format("%.1f", fuelLevel) + "L remaining.";
            System.out.println(alert.toUpperCase());
        } else {
            System.out.println("Fuel level is sufficient.");
        }
    }

    private void calculateEfficiency() {
        double randomFluctuation = Math.random() * 5 - 2.5;
        engineEfficiency = Math.max(50, Math.min(100, engineEfficiency + randomFluctuation));
    }

    public void updateFuel(double usedFuel) {
        fuelLevel = Math.max(0, fuelLevel - usedFuel);
    }

    public void updateTireWear() {
        for (int i = 0; i < tireWear.length; i++) {
            tireWear[i] = Math.min(100, tireWear[i] + Math.random() * 10);
        }
    }
}
