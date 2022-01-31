/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.ArrayList;

/**
 *
 * @author sayan593
 */
public class Aeroport {

    private final String nom;
    private final ArrayList<Ville> villes = new ArrayList<>();

    public Aeroport(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Ville> getVilles() {
        return villes;
    }

    /**
     * Ajoute une Ville à la liste
     *
     * @param ville
     * @return
     */
    public Aeroport AjouterVille(Ville ville) {
        villes.add(ville);
        return this;
    }

}
