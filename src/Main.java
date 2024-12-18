import java.util.ArrayList;
import java.util.Scanner;

public class Main{


static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Book book = new Book();
        while (true) {
            System.out.println("\n-----Library Management System-----\n");

        System.out.println("1.  Ajouter un livre ");
        System.out.println("2.  Afficher les livres ");
        System.out.println("3. Modifier un livre ");
        System.out.println("4. Rechercher un livre ");
        System.out.println("4. Supprimer un livre ");
        System.out.println("5. quitter le programme");
        System.out.println("\n____________________________________\n");
            System.out.print("Veuillez choisir une option :");
       int choice = Main.scanner.nextInt();
        switch (choice){

            case 1:
                book.add();
                break;
            case 2:
                book.afficher();
                break;
        }


        }










    }
}