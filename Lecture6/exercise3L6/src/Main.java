public class Main {
    public static void main(String[] args) {
        Animal[] zoo = {
                new Dog("Buddy"),
                new Lion("Simba"),
                new Frog("Froppy"),
                new SaraMountainDog("Max")
        };

        for (Animal animal : zoo) {
            animal.onomatopoeia();

            if (animal instanceof SaraMountainDog) {
                SaraMountainDog smd = (SaraMountainDog) animal; // Downcasting
                smd.traits();
            }

            System.out.println();
        }
    }
}
