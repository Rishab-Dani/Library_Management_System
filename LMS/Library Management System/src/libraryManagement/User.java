package libraryManagement;

public class User {
    private String name;
    private Book issuedBook;

    public User(String name) {
        try {
            this.name = name;
            this.issuedBook = null;
        } catch (Exception e) {
            System.out.println("Error creating user: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public Book getIssuedBook() {
        return issuedBook;
    }

    public void issueBook(Book book) {
        try {
            this.issuedBook = book;
            book.issue();
        } catch (Exception e) {
            System.out.println("Error during issuing book to user: " + e.getMessage());
        }
    }

    public void returnBook() {
        try {
            if (issuedBook != null) {
                issuedBook.returnBook();
                issuedBook = null;
            }
        } catch (Exception e) {
            System.out.println("Error during returning book: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        try {
            return name + (issuedBook != null ? " - Issued: " + issuedBook.getTitle() : " - No book issued");
        } catch (Exception e) {
            return "Invalid User";
        }
    }
}
