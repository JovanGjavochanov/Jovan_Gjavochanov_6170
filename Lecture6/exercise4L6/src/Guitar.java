public class Guitar extends Wired {
    @Override
    public void play() {
        System.out.println("The guitar strums a smooth and melodic tune.");
    }

    @Override
    public String whatIsPlaying() {
        return "Guitar (Wired)";
    }

    @Override
    public void tweak() {
        System.out.println("The guitar strings are tuned to perfection.");
    }
}
