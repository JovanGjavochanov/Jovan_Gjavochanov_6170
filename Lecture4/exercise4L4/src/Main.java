public class Main {
    public static void main(String[] args) {

        MagicBox box = new MagicBox();

        box.displayNumbers();

        int evenCount = box.findEvens();
        System.out.println("Number of even numbers: " + evenCount);

        double average = box.calculateAverage();
        System.out.println("Average of numbers: " + average);
    }
}
