public class FlyingHero extends Superhero {
    public FlyingHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " soars through the sky, attacking from above!");
    }
}
