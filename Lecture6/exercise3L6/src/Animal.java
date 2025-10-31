public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void onomatopoeia() {
        System.out.println("There is no onomatopoeia for " + name + ".");
    }
}
