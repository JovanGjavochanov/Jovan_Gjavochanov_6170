public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("Filip", 6117, "Computer Science");
        people[1] = new Staff("Andrej", 6083, "Admissions");
        people[2] = new Staff("Boris", 6302, "IT Services");
        people[3] = new Student("Dimitar", 6294, "Physics");

        for (Person p : people) {
            p.displayDetails();
        }
    }
}



