public class Trumpet extends Brass {
    @Override
    public void play() {
        System.out.println("The trumpet plays a bright and bold melody!");
    }

    @Override
    public String whatIsPlaying() {
        return "Trumpet (Brass)";
    }

    @Override
    public void tweak() {
        System.out.println("The trumpet valves are oiled and adjusted for tuning.");
    }
}
