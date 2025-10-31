public class Main {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Trumpet(),
                new Guitar(),
                new Percussion()
        };

        for (Instrument instrument : orchestra) {
            System.out.println("Now playing: " + instrument.whatIsPlaying());
            instrument.play();
            instrument.tweak();
            System.out.println();
        }
    }
}
