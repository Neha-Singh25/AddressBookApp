import java.io.IOException;
import java.util.Scanner;

public class AddressBookApp {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    Contact contact = new Contact(name, address, phoneNumber, email);
                    try {
                        addressBook.addContact(contact);
                        System.out.println("Contact added successfully.");
                    } catch (IOException e) {
                        System.out.println("Error saving contact.");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("All Contacts:");
                        for (Contact c : addressBook.getAllContacts()) {
                            System.out.println(c);
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading contacts.");
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    try {
                        Contact foundContact = addressBook.searchContactByName(searchName);
                        if (foundContact != null) {
                            System.out.println("Contact found: " + foundContact);
                        } else {
                            System.out.println("Contact not found.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error searching contact.");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting Address Book.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
