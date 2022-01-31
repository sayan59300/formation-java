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
public class PokemonTerrestre extends Pokemon {

    private final int nombrePatte;

    public PokemonTerrestre(String nom, double poids, double taille, int nombrePatte) {
        super(nom, poids, taille);
        this.nombrePatte = nombrePatte;
    }

    public int getNombrePatte() {
        return nombrePatte;
    }

    public double vitesse() {
        return Math.ceil(nombrePatte * super.getTaille() * 3);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPokemon terrestre" + "\nNombre de Pattes : " + nombrePatte + "\nVitesse : " + vitesse() + " km/h";
    }

}
