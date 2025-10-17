import java.util.Random;

public class Room {
    private Creature creature;
    private Random rand;

    public Room() {
        rand = new Random();
        int creatureStrength = rand.nextInt(10) + 5; // Strength 5–14
        int creatureHealth = rand.nextInt(15) + 10;  // Health 10–24
        this.creature = new Creature(creatureStrength, creatureHealth);
    }

    public Creature getCreature() {
        return creature;
    }

    public static class Creature {
        private int strength;
        private int health;
        private Random rand;

        public Creature(int strength, int health) {
            this.strength = strength;
            this.health = health;
            this.rand = new Random();
        }

        public int getStrength() {
            return strength;
        }

        public int getHealth() {
            return health;
        }

        public void takeDamage(int damage) {
            health -= damage;
            if (health < 0) health = 0;
        }
    }
}
