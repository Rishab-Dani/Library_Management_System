# Library Management System

A simple **console-based Library Management System** built in Java.  
This project allows users to manage books and users, issue and return books, and view the current state of the library through a text-based menu.

## Features

- Show all books with their status (issued/available)
- Add new users
- Show all users
- Issue a book to a user
- Return a book from a user
- Exit the system

## How It Works

- The system starts with some sample books and users.
- Users interact with the system via a menu in the terminal.
- All actions are performed through simple prompts and user input.

## How to Run

1. **Clone the repository:**
   ```
   git clone https://github.com/Rishab-Dani/Library_Management_System.git
   ```
2. **Navigate to the project directory:**
   ```
   cd Library_Management_System
   ```
3. **Compile the Java files:**
   ```
   javac -d bin src/libraryManagement/*.java
   ```
4. **Run the main class:**
   ```
   java -cp bin libraryManagement.LibrarySystem
   ```

## Project Structure

```
src/
  libraryManagement/
    Book.java
    User.java
    Library.java
    LibrarySystem.java
```

## Sample Menu

```
*********** Library Management System ***********

1. Show Books
2. Add User
3. Show Users
4. Issue Book
5. Return Book
6. Exit
Enter your choice:
```

## Future Improvements

- Add persistent storage (file or database)
- User authentication
- GUI interface
- More features (search, remove books/users, etc.)

---

**Developed by
