public class Cookie {
    protected double weight;
    protected String shape;

    public Cookie() {
        this.weight = 0.0;
        this.shape = "unknown";
    }

    public Cookie(double weight, String shape) {
        this.weight = weight;
        this.shape = shape;
    }

    public void print() {
        System.out.println("Cookie Details:");
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Shape: " + shape);
    }
}
