/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemon;

/**
 *
 * @author sayan593
 */
public class AppPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CollectionPokemons collection = new CollectionPokemons();
        Pokemon pokemon1 = new PokemonSportif("Pikachu", 20, 1.2, 2, 80);
        Pokemon pokemon2 = new PokemonSportif("Miutu", 50, 1.5, 2, 70);
        Pokemon pokemon3 = new PokemonSportif("Bulbizar", 80, 1.4, 4, 90);

        Pokemon pokemon4 = new PokemonCasanier("Ronflex", 200, 2, 2, 20);

        Pokemon pokemon5 = new PokemonDesMers("Merouxex", 150, 1.3, 2);

        Pokemon pokemon6 = new PokemonDeCroisiere("Balainex", 130000, 26, 4);

        collection.ajouterPokemon(pokemon1);
        collection.ajouterPokemon(pokemon2);
        collection.ajouterPokemon(pokemon3);
        collection.ajouterPokemon(pokemon4);
        collection.ajouterPokemon(pokemon5);
        collection.ajouterPokemon(pokemon6);

        for (Object pokemon : collection.getPokedex()) {
            System.out.println(pokemon);
        }
        System.out.println("----------------");
        System.out.println("Vitesse moyenne des pokemons sportifs : "
                + collection.vitesseMoyenneSportifs() + " km/h"
        );

    }

}
