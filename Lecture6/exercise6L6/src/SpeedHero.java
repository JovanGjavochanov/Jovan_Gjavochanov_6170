public class SpeedHero extends Superhero {
    public SpeedHero(String heroName) {
        super(heroName);
    }

    @Override
    public void fight() {
        System.out.println(heroName + " moves at light speed, striking before anyone can react!");
    }
}
