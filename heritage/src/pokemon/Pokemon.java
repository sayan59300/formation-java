/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author sayan593
 */
public class Pokemon {

    private final String nom;
    private final double poids;
    private final double taille;

    public Pokemon(String nom, double poids, double taille) {
        this.nom = nom;
        this.poids = poids;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    @Override
    public String toString() {
        return "\nPokemon" + "\nNom : " + nom + "\nPoids : " + poids + " Kg\nTaille : " + taille + " mètre(s)";
    }

}
