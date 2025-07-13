//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello world!\n");

        //Test Constructor
        Book myBook1 = new Book();
        Book myBook2 = new Book("Book2");
        Book myBook3 = new Book("Book3", "Author3");
        Book ourBook4 = new Book("Book4","Author4",4);

        //Test displayDetails
        myBook1.displayDetails();
        myBook2.displayDetails();
        myBook3.displayDetails();
        ourBook4.displayDetails();

        //Test updatePrice
        ourBook4.updatePrice(4.5);
        ourBook4.displayDetails();
        ourBook4.updatePrice(-1);
        ourBook4.displayDetails();

        //Test applyDiscount
        Book book = new Book("Java Programming", "John Doe", 1000.00);
        book.applyDiscount(-20);   // Should show error
        book.applyDiscount(25.00); // Should apply 25% discount
        book.displayDetails();     // Should show updated price (750.00)
    }
}