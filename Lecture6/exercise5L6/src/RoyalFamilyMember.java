public class RoyalFamilyMember extends Person {
    protected String title;

    public RoyalFamilyMember(String name, int age, String title) {
        super(name, age);
        this.title = title;
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
