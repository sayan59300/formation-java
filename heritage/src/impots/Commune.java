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
        double impots = 0;
        for (Habitation habitation : habitations) {
            if (habitations != null) {
                impots += habitation.impot();
            }
        }
        return impots;
    }

    @Override
    public String toString() {
        return "\nCode postale : " + codePostale + "\nNom=" + nom;
    }

}
