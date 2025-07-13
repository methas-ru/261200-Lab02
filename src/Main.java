//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\nHello world!\n");

        //Test Constructor
        Book myBook = new Book();
        Book myBook2 = new Book("Book2");
        Book myBook3 = new Book("Book3", "Author3");
        Book ourBook = new Book("Book4","Author4",4);

        //Test displayDetails
        myBook.displayDetails();
        myBook2.displayDetails();
        myBook3.displayDetails();
        ourBook.displayDetails();

        //Test updatePrice
        ourBook.updatePrice(4.5);
        ourBook.displayDetails();
        ourBook.updatePrice(-1);
        ourBook.displayDetails();
    }
}