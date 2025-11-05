import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Andrej Mirchevski", "071-353-484", "m.andrej@gmail.com"));
        contacts.add(new Contact("Filip Stojkovski", "072-558-693", "stojkovski.filip@work.com"));
        contacts.add(new Contact("Kostadin Pandilovski", "071-418-857", "koce773@yahoo.com"));
        contacts.add(new Contact("Dimitar Petrov", "073-302-528", "dimi_Petrov58@work.com"));
        contacts.add(new Contact("Boris Protich", "072-823-243", "boris_protich@gmail.com"));

        System.out.println("All Contacts:");
        for (Contact c : contacts) {
            c.displayContactInfo();
        }

        int professionalCount = 0;
        for (Contact c : contacts) {
            if (c.isProfessionalEmail()) {
                professionalCount++;
            }
        }

        System.out.println("\nNumber of professional contacts: " + professionalCount);
    }
}
