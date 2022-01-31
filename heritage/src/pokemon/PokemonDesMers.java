/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author sayan593
 */
public class PokemonDesMers extends PokemonAquatique {

    public PokemonDesMers(String nom, double poids, double taille, int nombreNageoire) {
        super(nom, poids, taille, nombreNageoire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon des mers" + "\nVitesse : " + super.vitesse() + " km/h";
    }

}
