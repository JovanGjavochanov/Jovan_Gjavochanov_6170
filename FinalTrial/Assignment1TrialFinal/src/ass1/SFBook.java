package ass1;

public class SFBook extends Book {
    private int publishYear;
    private boolean bestSeller;

    public SFBook() {}

    public SFBook(String title, String author, double price, String language,
                  int publishYear, boolean bestSeller) {
        super(title, author, price, language);
        this.publishYear = publishYear;
        this.bestSeller = bestSeller;
    }

    @Override
    public void printAttributes() {
        System.out.println("SF Book:");
        System.out.println(" Title: " + title);
        System.out.println(" Author: " + author);
        System.out.println(" Price: " + price);
        System.out.println(" Language: " + language);
        System.out.println(" Publish Year: " + publishYear);
        System.out.println(" Best Seller: " + bestSeller);
    }

    @Override
    public double getPrice() {
        return price;
    }

    public int getPublishYear() {
        return publishYear;
    }
}
