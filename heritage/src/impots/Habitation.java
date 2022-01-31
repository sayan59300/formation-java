/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class Habitation {

    private final Proprietaire proprietaire;
    private final String adresse;
    private final double surface;

    public Habitation(Proprietaire proprietaire, String adresse, double surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getSurface() {
        return surface;
    }

    public double impot() {
        return 2 * surface;
    }

    public String affiche() {
        return "\nProprietaire : " + proprietaire + "\nAdresse : " + adresse + "\nSurface : " + surface;
    }

}
