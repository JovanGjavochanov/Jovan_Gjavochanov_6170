import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int n = input.nextInt();

        int first = 0, second = 1;

        System.out.println("The first " + n + " Fibonacci numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(first);
            if (i < n - 1) System.out.print(", ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}


