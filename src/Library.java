import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public void search() {
        String valSearch;
        ArrayList<Book> stock = new ArrayList<>();
        System.out.print("Enter title, ISBN, or author to search: ");

        valSearch = sc.nextLine();

        for (Book book : books) {
            if (valSearch.equals(book.getTitle()) ||
                    valSearch.equals(book.getIsbn()) ||
                    valSearch.equals(book.getAuthor())) {
                stock.add(book);
            }
        }

        if (stock.isEmpty()) {
            System.out.println(valSearch + " not found.");
        } else {
            for (Book book : stock) {
                System.out.println(book);
            }
        }
    }



}
