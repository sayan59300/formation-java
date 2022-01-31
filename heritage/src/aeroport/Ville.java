/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

/**
 *
 * @author sayan593
 */
public class Ville {

    private final int codePostale;
    private final String nom;

    public Ville(int codePostale, String nom) {
        this.codePostale = codePostale;
        this.nom = nom;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public String getNom() {
        return nom;
    }

}
