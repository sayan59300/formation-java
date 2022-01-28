/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class Commune {

    private final int codePostale;
    private final String nom;

    public Commune(int codePostale, String nom) {
        this.codePostale = codePostale;
        this.nom = nom;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "\nCode postale : " + codePostale + "\nNom=" + nom;
    }

}
