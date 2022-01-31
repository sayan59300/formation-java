/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.lang.Math;

/**
 *
 * @author sayan593
 */
public class PokemonAquatique extends Pokemon {

    private final int nombreNageoire;

    public PokemonAquatique(String nom, double poids, double taille, int nombreNageoire) {
        super(nom, poids, taille);
        this.nombreNageoire = nombreNageoire;
    }

    public int getNombreNageoire() {
        return nombreNageoire;
    }

    public double vitesse() {
        return Math.ceil(super.getPoids() / 25 * nombreNageoire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon aquatique " + "\nNombre de nageoire(s) : " + nombreNageoire;
    }

}
