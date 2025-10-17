import java.util.Random;

public class MagicBox {

    private int[] numbers = new int[10];

    public MagicBox() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
    }

    public int findEvens() {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public void displayNumbers() {
        System.out.println("Numbers in the Magic Box:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
    }
}
