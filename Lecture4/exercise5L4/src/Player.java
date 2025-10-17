import java.util.Random;

public class Player {
    private int strength;
    private int health;
    private Random rand;

    public Player(int strength, int health) {
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

    public boolean fight(Room.Creature creature) {
        System.out.println("A creature appears! Creature health: " + creature.getHealth() + ", strength: " + creature.getStrength());

        while (this.health > 0 && creature.getHealth() > 0) {
            int playerDamage = rand.nextInt(this.strength) + 1; // 1 to strength
            creature.takeDamage(playerDamage);
            System.out.println("You deal " + playerDamage + " damage to the creature. Creature health: " + creature.getHealth());

            if (creature.getHealth() <= 0) {
                System.out.println("You defeated the creature!");
                return true;
            }

            int creatureDamage = rand.nextInt(creature.getStrength()) + 1; // 1 to creature strength
            this.takeDamage(creatureDamage);
            System.out.println("Creature attacks and deals " + creatureDamage + " damage. Your health: " + this.health);

            if (this.health <= 0) {
                System.out.println("You were defeated by the creature...");
                return false;
            }
        }

        return false;
    }
}
