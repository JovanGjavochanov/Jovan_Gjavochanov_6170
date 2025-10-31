public class Percussion extends Instrument {
    @Override
    public void play() {
        System.out.println("The percussion instrument beats rhythmically.");
    }

    @Override
    public String whatIsPlaying() {
        return "Percussion Instrument";
    }
}
