class Book {
    // final keyword ensures ISBN cannot be changed once assigned
    private final String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("--- Book Details ---");
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : $" + price);
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 45.00);
        book.displayDetails();

        // book.isbn = "000-0000000000"; // Compile Error: cannot assign a value to final variable
    }
}