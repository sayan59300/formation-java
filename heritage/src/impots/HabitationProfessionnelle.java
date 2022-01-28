/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

import java.lang.Math;

/**
 *
 * @author Sayan593
 */
public class HabitationProfessionnelle extends Habitation {

    private final int nombreEmployes;

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public HabitationProfessionnelle(Proprietaire proprietaire, String adresse, double surface, int nombreEmployes) {
        super(proprietaire, adresse, surface);
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public double impot() {
        return (super.impot() + (1000 * Math.ceil(nombreEmployes / 10)));
    }

    @Override
    public String affiche() {
        return super.affiche() + "\nNombre d'employé(s) : " + nombreEmployes;
    }

}
