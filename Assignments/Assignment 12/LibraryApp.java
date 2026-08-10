import library.Book;

public class LibraryApp {
    public static void main(String[] args) {
        Book myBook = new Book(101, "Clean Code", "Robert C. Martin", 425.0);
        myBook.displayBookDetails();
    }
}