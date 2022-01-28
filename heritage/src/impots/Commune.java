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
    private Habitation[] habitations = new Habitation[20];

    public Commune(int codePostale, String nom, Habitation[] habitations) {
        this.codePostale = codePostale;
        this.nom = nom;
        this.habitations = habitations;
    }

    public Habitation[] getHabitations() {
        return habitations;
    }

    public int getCodePostale() {
        return codePostale;
    }

    public String getNom() {
        return nom;
    }

    public double calculImpotsLocaux() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nCode postale : " + codePostale + "\nNom=" + nom;
    }

}
