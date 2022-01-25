/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionEleves;

/**
 *
 * @author sayan593
 */
public class GestionEleves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Eleve eleve = new Eleve("Lou-anne");
        eleve.ajouterNote(20);
        eleve.ajouterNote(18);
        eleve.ajouterNote(17);
        eleve.ajouterNote(19);
        System.out.println("---eleve.getListeNotes()---");
        eleve.getListeNotes();
        System.out.println("---Eleve---");
        System.out.println(eleve);
    }

}
