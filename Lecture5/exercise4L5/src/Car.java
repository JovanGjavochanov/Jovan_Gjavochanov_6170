public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Door[] doors;
    private GasTank gasTank;
    private boolean trunkClosed;

    public Car() {
        engine = new Engine();
        gasTank = new GasTank(50);
        wheels = new Wheel[4];
        doors = new Door[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            doors[i] = new Door();
        }
        trunkClosed = true;
    }

    public void startEngine() {
        if (gasTank.isEmpty()) {
            System.out.println("Cannot start engine. The gas tank is empty!");
        } else {
            engine.start();
        }
    }

    public void refuel(double liters) {
        gasTank.refill(liters);
    }

    public void simulateEmergency() {
        wheels[2].deflate();
        wheels[2].checkPressure();
        gasTank.empty();
        startEngine();
    }

    public class Engine {
        private boolean running;

        public void start() {
            if (!running) {
                running = true;
                System.out.println("Engine started successfully!");
            } else {
                System.out.println("Engine is already running.");
            }
        }

        public void stop() {
            if (running) {
                running = false;
                System.out.println("Engine stopped.");
            } else {
                System.out.println("Engine is already off.");
            }
        }
    }

    public class Wheel {
        private double pressure = 32;

        public void inflate() {
            pressure = 32;
            System.out.println("Wheel inflated to normal pressure.");
        }

        public void deflate() {
            pressure = 10;
            System.out.println("Wheel deflated!");
        }

        public void checkPressure() {
            if (pressure < 25) {
                System.out.println("Warning: Tire pressure low! (" + pressure + " PSI)");
            } else {
                System.out.println("Tire pressure normal (" + pressure + " PSI).");
            }
        }
    }

    public class Door {
        private boolean open = false;

        public void open() {
            if (!open) {
                open = true;
                System.out.println("Door opened.");
            } else {
                System.out.println("Door already open.");
            }
        }

        public void close() {
            if (open) {
                open = false;
                System.out.println("Door closed.");
            } else {
                System.out.println("Door already closed.");
            }
        }
    }

    public class GasTank {
        private double capacity;
        private double fuelLevel;

        public GasTank(double capacity) {
            this.capacity = capacity;
            this.fuelLevel = capacity;
        }

        public void refill(double liters) {
            if (fuelLevel + liters > capacity) {
                fuelLevel = capacity;
                System.out.println("Gas tank is now full (" + fuelLevel + "L).");
            } else {
                fuelLevel += liters;
                System.out.println("Added " + liters + "L of fuel. Current level: " + fuelLevel + "L.");
            }
        }

        public void empty() {
            fuelLevel = 0;
            System.out.println("Gas tank emptied!");
        }

        public boolean isEmpty() {
            return fuelLevel <= 0;
        }
    }
}
