public class Brass extends Instrument {
    @Override
    public void play() {
        System.out.println("The brass instrument plays a rich and powerful tone.");
    }

    @Override
    public String whatIsPlaying() {
        return "Brass Instrument";
    }
}
