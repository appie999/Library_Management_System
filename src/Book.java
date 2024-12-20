public class Book {
    String titre, auteur, isbn;
    boolean Disponible;

    public Book(String titre, String auteur, String isbn, boolean Disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.Disponible = Disponible;
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

    public boolean Disponible() {
        return Disponible;
    }

    public void setAvailable(boolean available) {
        Disponible = available;
    }

    @Override
    public String toString() {
        return
                 "~~ le titre de livre et :" + titre + '\n' +
                 "~~ L'auteur de livre te :" + auteur + '\n' +
                 "~~ L'ISBN de livre et :" + isbn + '\n' +
                 "~~ est-il disponible: " + Disponible
                ;
    }
}