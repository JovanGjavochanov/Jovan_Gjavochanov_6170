public class Queen extends RoyalFamilyMember {
    public Queen(String name, int age) {
        super(name, age, "Queen");
    }

    public void hostBanquet() {
        System.out.println(name + " the " + title + " hosts a grand royal banquet.");
    }
}
