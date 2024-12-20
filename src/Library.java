import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void ajouterLivre(Book book) {
        books.add(book);
    }
    public void afficherLivres() {
        for (Book book : books) {
            System.out.println(book);
            System.out.println("------------------------");
        }
    }
    public void recherche() {
        String valSearch;
        ArrayList<Book> stock = new ArrayList<>();
        System.out.print("Enter title, ISBN, or author to search: ");

        valSearch = sc.nextLine();

        for (Book book : books) {
            if (valSearch.equals(book.getTitre()) ||
                    valSearch.equals(book.getIsbn()) ||
                    valSearch.equals(book.getAuteur())) {
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

    public void mise_A_jour() {
        Scanner sc = new Scanner(System.in);
        String isbn;
        boolean found = false;

        System.out.print("Enter ISBN of book to update: ");
        isbn = sc.nextLine();

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                found = true;

                System.out.println("1: Update Title\n2: Update Author\n3: Update Availability");
                System.out.print("Enter your choice: ");
                int updateChoice = sc.nextInt();
                sc.nextLine();

                switch (updateChoice) {
                    case 1:
                        System.out.print("Enter new title: ");
                        book.setTitre(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new author: ");
                        book.setAuteur(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Is the book available? (true/false): ");
                        book.setAvailable(sc.nextBoolean());
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                System.out.println("Book updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }



    public void supprimer(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed successfully.");
    }


}
