public class Wired extends Instrument {
    @Override
    public void play() {
        System.out.println("The wired instrument produces sound through vibrating strings.");
    }

    @Override
    public String whatIsPlaying() {
        return "Wired Instrument";
    }
}
