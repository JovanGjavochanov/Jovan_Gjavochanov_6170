public class Fan implements Device, Switchable, Adjustable {
    private String deviceName;
    private String status;
    private int speedLevel;

    public Fan(String deviceName) {
        this.deviceName = deviceName;
        this.status = "Off";
        this.speedLevel = 3;
    }

    @Override
    public String getDeviceName() {
        return deviceName;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void turnOn() {
        status = "On";
        System.out.println(deviceName + " is turned On.");
    }

    @Override
    public void turnOff() {
        status = "Off";
        System.out.println(deviceName + " is turned Off.");
    }

    @Override
    public void increaseSetting() {
        if(speedLevel < 5) {
            speedLevel += 1;
            System.out.println(deviceName + " speed increased to level " + speedLevel + ".");
        } else {
            System.out.println(deviceName + " speed is already at maximum.");
        }
    }

    @Override
    public void decreaseSetting() {
        if(speedLevel > 0) {
            speedLevel -= 1;
            System.out.println(deviceName + " speed decreased to level " + speedLevel + ".");
        } else {
            System.out.println(deviceName + " speed is already at minimum.");
        }
    }

    public void displaySettings() {
        System.out.println("Device: " + deviceName);
        System.out.println("Status: " + status);
        System.out.println("Speed Level: " + speedLevel);
    }
}