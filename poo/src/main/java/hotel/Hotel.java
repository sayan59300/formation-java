/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class Hotel {

    private String nom;
    private Chambre[] listeChambre;

    public Hotel(String nom, int taille) {
        this.nom = nom;
        this.listeChambre = new Chambre[taille];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chambre[] getListeChambre() {
        return listeChambre;
    }

    public void ajoutChambre(Chambre chambre, int index) {
        for (int i = 0; i < listeChambre.length; i++) {
            listeChambre[i] = chambre;
        }
    }

    @Override
    public String toString() {
        return "Nom = " + nom + "\nNombre de chambres = " + listeChambre.length;
    }
}
