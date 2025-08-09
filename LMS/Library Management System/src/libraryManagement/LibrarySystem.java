package libraryManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample data
        try {
            library.defaultBook(new Book("Java Programming", "James Gosling"));
            library.defaultBook(new Book("Python Programming", "Guido van Rossum"));
            library.defaultBook(new Book("C++", "Bjarne Stroustrup"));
            library.defaultBook(new Book("JavaScript", "Brendan Eich"));

            library.defaultUser(new User("Alice"));
            library.defaultUser(new User("Bob"));
        } catch (Exception e) {
            System.out.println("Error initializing sample data: " + e.getMessage());
        }

        Scanner scan = new Scanner(System.in);
        int choice = 0;

        System.out.println("*********** Library Management System ***********");
        do {
            try {
                System.out.println("\n1. Show Books");
                System.out.println("2. Add User");
                System.out.println("3. Show Users");
                System.out.println("4. Issue Book");
                System.out.println("5. Return Book");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                choice = scan.nextInt();
                scan.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> library.showBooks();

                    case 2 -> {
                        try {
                            System.out.print("Enter user name: ");
                            String name = scan.nextLine();
                            library.defaultUser(new User(name));
                            System.out.println("User added successfully.");
                        } catch (Exception e) {
                            System.out.println("Error adding user: " + e.getMessage());
                        }
                    }

                    case 3 -> library.showUsers();

                    case 4 -> {
                        try {
                            library.issueBook(scan);
                        } catch (Exception e) {
                            System.out.println("Error issuing book: " + e.getMessage());
                        }
                    }

                    case 5 -> {
                        try {
                            System.out.print("Enter user name: ");
                            String returnUser = scan.nextLine();
                            library.returnBook(returnUser);
                        } catch (Exception e) {
                            System.out.println("Error returning book: " + e.getMessage());
                        }
                    }

                    case 6 -> System.out.println("Exiting the system. Thank you!");

                    default -> System.out.println("Invalid choice, please try again.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Invalid input. Please enter a number.");
                scan.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("Unexpected error: " + e.getMessage());
            }

        } while (choice != 6);

        scan.close();
    }
}

