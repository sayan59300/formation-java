/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class HabitationProfessionnelle extends Habitation {

    private final int identifiant;
    private final int nombreEmployes;

    public int getIdentifiant() {
        return identifiant;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int identifiant, int nombreEmployes) {
        super(proprietaire, adresse, surface);
        this.identifiant = identifiant;
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public double impot() {
        return 0;
    }

    @Override
    public String affiche() {
        return super.affiche() + "\nNombre d'employé(s) : " + nombreEmployes;
    }

}
