package pl.bookstore.zad14;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("The Way of Kings", "Brandon Sanderson", 2010, "Gollancz", 1007);
        book.showInformation();
        book.setPublisher("Tor Books");
        System.out.print("--------\n");
        book.showInformation();
    }
}
