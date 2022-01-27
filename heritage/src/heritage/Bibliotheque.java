/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heritage;

/**
 *
 * @author Sayan593
 */
public class Bibliotheque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adherent adherent = new Adherent(1, "Buffart", "Nicolas", 40);
        Auteur auteur1 = new Auteur(1, "D'ormesson", "Jean", 92);
        Auteur auteur2 = new Auteur(2, "Hugo", "Victor", 83);
        Auteur[] auteurs = {auteur1, auteur2};
        Livre livre = new Livre(132154, "La guéguerre des systèmes stellaires", auteurs);

        System.out.println("\nAdhérent : ");
        System.out.println(adherent.afficher());
        System.out.println("\nLivre : ");
        System.out.println(livre.afficher());
    }

}
