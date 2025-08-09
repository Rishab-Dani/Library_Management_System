package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        try {
            books = new ArrayList<>();
            users = new ArrayList<>();
        } catch (Exception e) {
            System.out.println("Error initializing library: " + e.getMessage());
        }
    }

    public void defaultBook(Book book) {
        try {
            books.add(book);
        } catch (Exception e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    public void defaultUser(User user) {
        try {
            users.add(user);
        } catch (Exception e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    }

    public void showBooks() {
        try {
            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                System.out.println("Available Books:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        } catch (Exception e) {
            System.out.println("Error displaying books: " + e.getMessage());
        }
    }

    public void showUsers() {
        try {
            if (users.isEmpty()) {
                System.out.println("No users registered.");
            } else {
                System.out.println("Registered Users:");
                for (User user : users) {
                    System.out.println(user);
                }
            }
        } catch (Exception e) {
            System.out.println("Error displaying users: " + e.getMessage());
        }
    }

    public Book findBookByTitle(String title) {
        try {
            for (Book b : books) {
                if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                    return b;
                }
            }
        } catch (Exception e) {
            System.out.println("Error finding book: " + e.getMessage());
        }
        return null;
    }

    public User findUserByName(String name) {
        try {
            for (User u : users) {
                if (u.getName().equalsIgnoreCase(name)) {
                    return u;
                }
            }
        } catch (Exception e) {
            System.out.println("Error finding user: " + e.getMessage());
        }
        return null;
    }

    public void issueBook(Scanner sc) {
        try {
            System.out.print("Enter book title: ");
            String bookTitle = sc.nextLine();
            System.out.print("Enter user name: ");
            String userName = sc.nextLine();

            Book book = findBookByTitle(bookTitle);
            User user = findUserByName(userName);

            if (book != null && user != null && user.getIssuedBook() == null) {
                user.issueBook(book);
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Cannot issue book. Book may be unavailable or user already has one.");
            }
        } catch (Exception e) {
            System.out.println("Error during issuing book: " + e.getMessage());
        }
    }

    public void returnBook(String userName) {
        try {
            User user = findUserByName(userName);
            if (user != null && user.getIssuedBook() != null) {
                user.returnBook();
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("No book to return.");
            }
        } catch (Exception e) {
            System.out.println("Error during returning book: " + e.getMessage());
        }
    }
}

