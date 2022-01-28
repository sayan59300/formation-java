/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class HabitationIndividuelle extends Habitation {

    private final int nombrePieces;
    private final boolean piscine;

    public HabitationIndividuelle(Proprietaire proprietaire, String adresse, double surface, int nombrePieces, boolean piscine) {
        super(proprietaire, adresse, surface);
        this.nombrePieces = nombrePieces;
        this.piscine = piscine;
    }

    public int getNombrePieces() {
        return nombrePieces;
    }

    public boolean hasPiscine() {
        return piscine;
    }

    @Override
    public double impot() {
        return (super.impot() + (100 * nombrePieces) + (piscine ? 500 : 0));
    }

    @Override
    public String affiche() {
        return super.affiche() + "\nNombre de pièce(s) : " + nombrePieces + "\nPiscine : " + (piscine ? "Oui" : "Non");
    }

}
