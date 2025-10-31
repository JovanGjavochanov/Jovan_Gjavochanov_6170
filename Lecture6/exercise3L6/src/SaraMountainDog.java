public class SaraMountainDog extends Dog {
    public SaraMountainDog(String name) {
        super(name);
    }

    public void traits() {
        System.out.println(name + " is loyal, strong, and excellent at mountain rescue.");
    }

    @Override
    public void onomatopoeia() {
        System.out.println(name + " (Sara Mountain Dog) says: Deep Woof!");
    }
}
