public abstract class Instrument {
    public abstract void play();

    public String whatIsPlaying() {
        return "Instrument";
    }

    public void tweak() {
        System.out.println("Adjusting the instrument for better sound quality.");
    }
}
