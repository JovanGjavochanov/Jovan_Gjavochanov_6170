public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " says: Roar!");
    }
}
