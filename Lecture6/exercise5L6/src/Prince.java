public class Prince extends RoyalFamilyMember {
    public Prince(String name, int age) {
        super(name, age, "Prince");
    }

    public void train() {
        System.out.println(name + " the " + title + " trains to one day lead the kingdom.");
    }
}
