public class Book {
    String title;
    String author;
    double price;

    //Constructor
    Book() {
        this("Unknown title", "Unknown author", 0.0);
    }

    Book(String title) {
        this(title, "Unknown author", 0.0);
    }

    Book(String title, String author) {
        this(title, author, 0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        // TODO: Complete the rest of this method.
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price + "\n");
    }

    //Update book price
    public void updatePrice(double newPrice) {
        // TODO: Add validation for negative prices
        if (newPrice >= 0) {
            this.price = newPrice;
        }
    }
}
