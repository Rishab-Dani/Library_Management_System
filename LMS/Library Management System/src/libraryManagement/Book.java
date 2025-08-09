package libraryManagement;

public class Book {
    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author) {
        try {
            this.title = title;
            this.author = author;
            this.isIssued = false;
        } catch (Exception e) {
            System.out.println("Error creating book: " + e.getMessage());
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issue() {
        try {
            isIssued = true;
        } catch (Exception e) {
            System.out.println("Error issuing book: " + e.getMessage());
        }
    }

    public void returnBook() {
        try {
            isIssued = false;
        } catch (Exception e) {
            System.out.println("Error returning book: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        try {
            return title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
        } catch (Exception e) {
            return "Invalid Book";
        }
    }
}

