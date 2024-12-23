public class Book {
    String titre, auteur, isbn;
    boolean disponible;

    public Book (String titre, String auteur, String isbn, boolean disponible) {
        this.titre =   titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean disponible() {
        return disponible;
    }

    public void setAvailable(boolean available) {
        disponible = available;
    }

    @Override
    public String toString() {
        return
                 "~~ le titre de livre et :" + titre + '\n' +
                 "~~ L'auteur de livre te :" + auteur + '\n' +
                 "~~ L'ISBN de livre et :" + isbn + '\n' +
                 "~~ est-il disponible: " + disponible
                ;
    }
}