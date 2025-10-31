public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Door[] doors;
    private boolean trunkClosed;

    public Car() {
        engine = new Engine();
        wheels = new Wheel[4];
        doors = new Door[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            doors[i] = new Door();
        }
        trunkClosed = true;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void openAllDoors() {
        for (Door door : doors) {
            door.open();
        }
    }

    public void closeAllDoors() {
        for (Door door : doors) {
            door.close();
        }
    }

    public void inflateWheel(int index) {
        if (index >= 0 && index < wheels.length) {
            wheels[index].inflate();
        } else {
            System.out.println("Invalid wheel number.");
        }
    }

    public void deflateWheel(int index) {
        if (index >= 0 && index < wheels.length) {
            wheels[index].deflate();
        } else {
            System.out.println("Invalid wheel number.");
        }
    }

    public void closeTrunk() {
        if (trunkClosed) {
            System.out.println("Trunk is already closed.");
        } else {
            trunkClosed = true;
            System.out.println("Trunk is now closed.");
        }
    }

    public void openTrunk() {
        if (!trunkClosed) {
            System.out.println("Trunk is already open.");
        } else {
            trunkClosed = false;
            System.out.println("Trunk is now open.");
        }
    }

    public class Engine {
        private boolean running;

        public void start() {
            if (!running) {
                running = true;
                System.out.println("Engine started. Ready for the mission!");
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
        private boolean inflated = true;

        public void inflate() {
            if (!inflated) {
                inflated = true;
                System.out.println("Wheel inflated.");
            } else {
                System.out.println("Wheel is already inflated.");
            }
        }

        public void deflate() {
            if (inflated) {
                inflated = false;
                System.out.println("Wheel deflated.");
            } else {
                System.out.println("Wheel is already deflated.");
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
                System.out.println("Door is already open.");
            }
        }

        public void close() {
            if (open) {
                open = false;
                System.out.println("Door closed.");
            } else {
                System.out.println("Door is already closed.");
            }
        }
    }
}
