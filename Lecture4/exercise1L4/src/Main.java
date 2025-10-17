public class Main {
    public static void main(String[] args) {

        Hero hero = new Hero(100, 20);

        hero.displayStats();

        hero.takeDamage(30);
        System.out.println("Hero takes 30 damage!\n");

        hero.powerUp(10);
        System.out.println("Hero gains 10 strength!\n");

        hero.displayStats();
    }
}
