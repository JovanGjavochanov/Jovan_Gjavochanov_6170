public class DataLogger {
    public static void main(String[] args) {
        String missionName;
        String missionDate;
        String fuelConsumedStr;

        if (args.length < 3) {
            System.out.println("No command-line arguments detected. Using default values...\n");

            missionName = "ExtractionMission";
            missionDate = "10/31/2025";
            fuelConsumedStr = "41.67";
        } else {
            missionName = args[0];
            missionDate = args[1];
            fuelConsumedStr = args[2];
        }

        try {
            double fuelConsumed = Double.parseDouble(fuelConsumedStr);

            System.out.println("Mission Name: " + missionName);
            System.out.println("Mission Date: " + missionDate);
            System.out.println("Fuel Consumed: " + fuelConsumed + " liters");

            int fuelInt = (int) fuelConsumed;

            String binary = Integer.toBinaryString(fuelInt);
            String octal = Integer.toOctalString(fuelInt);
            String hexadecimal = Integer.toHexString(fuelInt).toUpperCase();

            System.out.println("Fuel Consumed (Binary): " + binary);
            System.out.println("Fuel Consumed (Octal): " + octal);
            System.out.println("Fuel Consumed (Hexadecimal): " + hexadecimal);

        } catch (NumberFormatException e) {
            System.out.println("Error: FuelConsumed must be a numeric value.");
        }
    }
}
