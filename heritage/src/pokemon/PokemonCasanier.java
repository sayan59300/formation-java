/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 *
 * @author sayan593
 */
public class PokemonCasanier extends PokemonTerrestre {

    private final int nombreHeure;

    public PokemonCasanier(String nom, double poids, double taille, int nombrePatte, int nombreHeure) {
        super(nom, poids, taille, nombrePatte);
        this.nombreHeure = nombreHeure;
    }

    public int getNombreHeure() {
        return nombreHeure;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon casanier " + "\nNombre d'heure(s) devant la télévision : " + nombreHeure;
    }

}
