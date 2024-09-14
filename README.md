# 📒 Address Book Application

## 📚 Project Overview
The **Address Book Application** is a simple command-line based Java project that allows users to store, retrieve, and search for contact information. The contacts are stored in a text file (`contacts.txt`) in CSV format.

This project utilizes core Java concepts such as **Object-Oriented Programming (OOP)**, **File Handling**, **Exception Handling**, and **Search Algorithms**. It also demonstrates how to build a menu-driven application in the console.

## ✨ Features
- ➕ **Add Contact:** Users can add a new contact (name, address, phone number, and email).
- 📋 **View All Contacts:** Displays all saved contacts from the file.
- 🔍 **Search Contact by Name:** Allows users to search for contacts by name.
- 💾 **Persistent Storage:** Stores contacts in a CSV format in a file (`contacts.txt`).

## 💻 Technologies Used
- ☕ **Java 8**
- 🗂️ **File I/O (BufferedReader, BufferedWriter)**
- 🧩 **OOP Concepts**
- 🛠️ **Exception Handling**

## 🚀 Getting Started

### 📋 Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or use command-line tools to compile and run the application.

## 📖 Usage

### 🏠 Main Menu
The application provides a simple menu for user interaction:

```bash
Address Book Menu:
1. Add Contact
2. View All Contacts
3. Search Contact by Name
4. Exit
Enter your choice: 
```

## ➕ Adding a Contact

```bash
Enter name: John Doe
Enter address: 123 Main St
Enter phone number: 555-1234
Enter email: john@example.com
Contact added successfully. 🎉
```

## 📋 Viewing All Contacts

```bash
All Contacts:
John Doe, 123 Main St, 555-1234, john@example.com
Jane Smith, 456 Oak Ave, 555-5678, jane@sample.com
```

## 🔍 Searching for a Contact

```bash
Enter name to search: John Doe
Contact found: John Doe, 123 Main St, 555-1234, john@example.com
```

## ❌ Exiting the Application

```bash
Exiting Address Book. 👋
```

## 🗂️ File Structure

```bash
.
├── src
│   ├── AddressBookApp.java  # Main application file
│   ├── AddressBook.java     # Handles file operations and contact management
│   ├── Contact.java         # Model class for a contact
├── contacts.txt             # File where contact data is stored
└── README.md                # Project documentation
```

### Made with ❤️ by NEHA SINGH