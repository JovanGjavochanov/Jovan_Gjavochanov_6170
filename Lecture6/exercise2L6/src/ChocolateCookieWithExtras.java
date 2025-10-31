public class ChocolateCookieWithExtras extends ChocolateCookie {
    private String extras;

    public ChocolateCookieWithExtras(double weight, String shape, int percentChocolate, String extras) {
        super(weight, shape, percentChocolate);
        this.extras = extras;
    }

    @Override
    public void print() {
        System.out.println("Chocolate Cookie with Extras Details:");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Shape: " + shape);
        System.out.println("Chocolate: " + percentChocolate + "%");
        System.out.println("Extras: " + extras);
    }
}
