import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    String titre,auteur,ISBN ;
    boolean disponibilité;
    ArrayList<String> books = new ArrayList<>();

    void add(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("entrez le titre du livre :");
         titre = scanner.nextLine();
        System.out.print("entrez l'auteur du livre :");
         auteur = scanner.nextLine();
        System.out.print("entrez l'ISBN du livre :");
         ISBN = scanner.nextLine();
        System.out.print("ce livre est-il disponible ?");
         disponibilité = scanner.nextBoolean();


    }



}