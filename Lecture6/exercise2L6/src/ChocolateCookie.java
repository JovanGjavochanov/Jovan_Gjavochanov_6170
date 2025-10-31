public class ChocolateCookie extends Cookie {
    protected int percentChocolate;

    public ChocolateCookie(double weight, String shape, int percentChocolate) {
        super(weight, shape);
        this.percentChocolate = percentChocolate;
    }

    @Override
    public void print() {
        System.out.println("Chocolate Cookie Details:");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Shape: " + shape);
        System.out.println("Chocolate: " + percentChocolate + "%");
    }
}
