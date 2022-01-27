/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author Sayan593
 */
public class Livre {

    private final int isbn;
    private final String titre;
    private Auteur[] auteurs = new Auteur[4];

    public Livre(int isbn, String titre, Auteur[] auteurs) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteurs = auteurs;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur[] getAuteurs() {
        return auteurs;
    }

    public String afficher() {
        String fiche = "\nNuméro ISBN : " + isbn
                + "\nTitre : " + titre
                + "\nAuteurs : "
                + "\n------------------------";
        for (int i = 0; i < auteurs.length; i++) {
            if (auteurs[i] != null) {
                fiche += auteurs[i].afficher() + "\n------------------------";
            }
        }
        return fiche;
    }

}
