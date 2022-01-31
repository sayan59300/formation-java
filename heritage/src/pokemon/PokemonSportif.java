/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author sayan593
 */
public class PokemonSportif extends PokemonTerrestre {

    private final int frequenceCardiaque;

    public PokemonSportif(String nom, double poids, double taille, int nombrePatte, int frequenceCardiaque) {
        super(nom, poids, taille, nombrePatte);
        this.frequenceCardiaque = frequenceCardiaque;
    }

    public int getFrequenceCardiaque() {
        return frequenceCardiaque;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon sportif" + "\nFréquence cardiaque : " + frequenceCardiaque;
    }

}
