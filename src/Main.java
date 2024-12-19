import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--------Library_Management_System--------\n");
            System.out.println("\n~~~~ M E N U ~~~~\n");
            System.out.println("1: ajouter un livre");
            System.out.println("2: Afficher les livres");
            System.out.println("3: Rechercher un livre");
            System.out.println("4: Modifier un livre ");
            System.out.println("5: Supprimer un livre");
            System.out.println("0: Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.next();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    boolean isAvailable = false;
                    while (true) {
                        System.out.print("Is Available (true/false): ");
                        if (sc.hasNextBoolean()) {
                            isAvailable = sc.nextBoolean();
                            break;
                        } else {
                            System.out.println("Invalid input, please enter 'true' or 'false'.");
                            sc.next();
                        }
                    }

                    library.addBook(new Book(title, author, isbn, isAvailable));
                    System.out.println("Book added successfully!");
                    break;



                case 2:
                    System.out.println("Books in Library:");
                    library.displayBooks();
                    break;

                case 3:
                    library.search();
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}