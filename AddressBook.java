import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private static final String FILE_NAME = "contacts.txt";

    public void addContact(Contact contact) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(contact.toString());
            writer.newLine();
        }
    }

    public List<Contact> getAllContacts() throws IOException {
        List<Contact> contacts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String parts[] = line.split(",");
                Contact contact = new Contact(parts[0], parts[1], parts[2], parts[3]);
                contacts.add(contact);

            }
        }
        return contacts;
    }

    public Contact searchContactByName(String name) throws IOException {
        List<Contact> contacts = getAllContacts();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

}
