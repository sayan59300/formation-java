/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

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

    @Override
    public String toString() {
        return super.toString() + "\nPokemonAquatique " + "\nNombre de nageoire(s) : " + nombreNageoire;
    }

}
