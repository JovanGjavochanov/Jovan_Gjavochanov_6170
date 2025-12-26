package ass1;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<SFBook> sfList = new ArrayList<>();
        ArrayList<AdventureBook> advList = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Input SF book");
            System.out.println("2. Input Adventure book");
            System.out.println("3. List all books");
            System.out.println("4. List the oldest book");
            System.out.println("5. List the most expensive book");
            System.out.println("6. List the average price of all books");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.print("Title: ");
                String title = scan.nextLine();

                System.out.print("Author: ");
                String author = scan.nextLine();

                System.out.print("Price: ");
                double price = scan.nextDouble();
                scan.nextLine();

                System.out.print("Language: ");
                String language = scan.nextLine();

                System.out.print("Publish Year: ");
                int year = scan.nextInt();

                System.out.print("Best Seller (true/false): ");
                boolean best = scan.nextBoolean();

                sfList.add(new SFBook(title, author, price, language, year, best));
                System.out.println("SF Book added!");

            } else if (choice == 2) {
                System.out.print("Title: ");
                String title = scan.nextLine();

                System.out.print("Author: ");
                String author = scan.nextLine();

                System.out.print("Price: ");
                double price = scan.nextDouble();
                scan.nextLine();

                System.out.print("Language: ");
                String language = scan.nextLine();

                System.out.print("Publish Year: ");
                int year = scan.nextInt();

                System.out.print("Children Book (true/false): ");
                boolean child = scan.nextBoolean();

                advList.add(new AdventureBook(title, author, price, language, year, child));
                System.out.println("Adventure Book added!");

            } else if (choice == 3) {
                System.out.println("\n--- SF Books ---");
                sfList.forEach(SFBook::printAttributes);

                System.out.println("\n--- Adventure Books ---");
                advList.forEach(AdventureBook::printAttributes);

            } else if (choice == 4) {
                Book oldest = null;

                for (SFBook b : sfList)
                    if (oldest == null || b.getPublishYear() < ((SFBook) oldest).getPublishYear())
                        oldest = b;

                for (AdventureBook b : advList)
                    if (oldest == null || b.getPublishYear() < ((AdventureBook) oldest).getPublishYear())
                        oldest = b;

                if (oldest != null) oldest.printAttributes();
                else System.out.println("No books available.");

            } else if (choice == 5) {
                Book max = null;

                for (SFBook b : sfList)
                    if (max == null || b.getPrice() > max.getPrice())
                        max = b;

                for (AdventureBook b : advList)
                    if (max == null || b.getPrice() > max.getPrice())
                        max = b;

                if (max != null) max.printAttributes();
                else System.out.println("No books available.");

            } else if (choice == 6) {
                double total = 0;
                int count = 0;

                for (SFBook b : sfList) {
                    total += b.getPrice();
                    count++;
                }
                for (AdventureBook b : advList) {
                    total += b.getPrice();
                    count++;
                }

                if (count > 0)
                    System.out.println("Average price = " + (total / count));
                else
                    System.out.println("No books available.");

            } else if (choice == 7) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
