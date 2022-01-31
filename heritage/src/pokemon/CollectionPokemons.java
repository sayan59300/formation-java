/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.util.ArrayList;

/**
 *
 * @author sayan593
 */
public class CollectionPokemons {

    private final ArrayList<Pokemon> pokedex = new ArrayList<>();

    public CollectionPokemons() {
    }

    public void ajouterPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public double vitesseMoyenneSportifs() {
        int nombrePokemon = 0;
        int addition = 0;
        for (Pokemon pokemon : pokedex) {
            if (pokemon instanceof PokemonSportif PokemonSportif) {
                nombrePokemon++;
                addition += PokemonSportif.vitesse();
            }
        }
        return addition / nombrePokemon;
    }
}
