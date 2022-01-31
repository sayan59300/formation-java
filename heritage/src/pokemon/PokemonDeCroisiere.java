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
public class PokemonDeCroisiere extends PokemonAquatique {

    public PokemonDeCroisiere(String nom, double poids, double taille, int nombreNageoire) {
        super(nom, poids, taille, nombreNageoire);
    }

    @Override
    public double vitesse() {
        return Math.ceil((super.vitesse()) / 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon de croisière" + "\nVitesse : " + vitesse() + " km/h";
    }
}
