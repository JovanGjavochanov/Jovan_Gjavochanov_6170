public class Main {
    public static void main(String[] args) {
        Cookie basicCookie = new Cookie(25, "Round");
        ChocolateCookie chocoCookie = new ChocolateCookie(30, "Square", 60);
        ChocolateCookieWithExtras deluxeCookie = new ChocolateCookieWithExtras(35, "Heart", 70, "Hazelnuts");

        System.out.println("=== Regular Cookie ===");
        basicCookie.print();

        System.out.println("\n=== Chocolate Cookie ===");
        chocoCookie.print();

        System.out.println("\n=== Chocolate Cookie with Extras ===");
        deluxeCookie.print();
    }
}
