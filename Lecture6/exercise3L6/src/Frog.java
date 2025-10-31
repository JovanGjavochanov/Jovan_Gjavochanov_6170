public class Frog extends Animal {
    public Frog(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " says: Ribbit!");
    }
}
