public class King extends RoyalFamilyMember {
    public King(String name, int age) {
        super(name, age, "King");
    }

    public void rule() {
        System.out.println(name + " the " + title + " rules the kingdom wisely.");
    }
}
