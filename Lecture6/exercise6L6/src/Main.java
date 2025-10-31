public class Main {
    public static void main(String[] args) {
        Superhero hero1 = new FlyingHero("Agartha");
        Superhero hero2 = new StrengthHero("Fenrik");
        Superhero hero3 = new SpeedHero("Savitar");

        Superhero[] heroes = {hero1, hero2, hero3};

        System.out.println("=== Battle of the Superheroes ===");
        for (Superhero hero : heroes) {
            hero.fight();
        }
    }
}
