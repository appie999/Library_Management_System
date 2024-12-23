import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        String choice;

        do {
            System.out.println("\n--------Library_Management_System--------\n");
            System.out.println("\n~~~~ M E N U ~~~~\n");
            System.out.println("1: ajouter un livre");
            System.out.println("2: Afficher les livres");
            System.out.println("3: Rechercher un livre");
            System.out.println("4: Modifier un livre ");
            System.out.println("5: Supprimer un livre");
            System.out.println("0: Exit");
            System.out.print("Entrez votre choix: ");
            choice = sc.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Entrez l'ISBN du livre: ");
                    String isbn = sc.next();
                    sc.nextLine();

                    System.out.print("Entrez le Title du livre: ");
                    String title = sc.nextLine();

                    System.out.print("Enter l'auteur du livre: ");
                    String author = sc.nextLine();

                    boolean isAvailable = false;
                    while (true) {
                        System.out.print("Est disponible (true/false): ");
                        if (sc.hasNextBoolean()) {
                            isAvailable = sc.nextBoolean();
                            break;
                        } else {
                            System.out.println("Entrée non valide, veuillez saisir 'true' ou 'false'.");
                            sc.next();
                        }
                    }

                    library.ajouterLivre(new Book(title, author, isbn, isAvailable));
                    System.out.println("Livre ajouté avec succès !");
                    break;



                case "2":
                    System.out.println("\nLivre dans la bibliothèque:\n");
                    library.afficherLivres();
                    break;

                case "3":
                    library.recherche();
                    break;

                case "4":


                    library.mise_A_jour();
                    break;

                case "5":
                    System.out.print("Entrez l'ISBN du livre à supprimer: ");
                    isbn = sc.next();
                    library.supprimer(isbn);
                    break;
                case "0":
                    System.out.println("Sortie... Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (!choice.equals("0"));
    }
}