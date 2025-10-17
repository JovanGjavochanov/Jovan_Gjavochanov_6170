public class Hero {

    private int health;
    private int strenght;

    public Hero(int health, int strenght) {
        this.health = health;
        this.strenght = strenght;
    }

    public void displayStats() {
        System.out.println("Hero status:");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strenght);
        System.out.println();
    }

    public void takeDamage(int damage) {
        if (damage < health) {
            health = health - damage;
        } else {
            health = 0;
        }
    }

    public void powerUp(int value) {
        strenght += value;
    }
}
