/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voiture;

/**
 *
 * @author Sayan593
 */
public class Roue {

    private int numero;
    private float diametre;
    private boolean etat = true;

    /**
     * Constructeur pour une roue disponible
     *
     * @param numero
     * @param diametre
     */
    public Roue(int numero, float diametre) {
        this.numero = numero;
        this.diametre = diametre;
    }

    @Override
    public String toString() {
        return "Numéro = " + numero + "\nDiamètre = " + diametre + "\nDisponibilité = " + (etat ? "Oui" : "Non");
    }

    /**
     * Constructeur pour une roue directement installée sur un véhicule donc
     * directement indisponible
     *
     * @param numero
     * @param diametre
     * @param etat
     */
    public Roue(int numero, float diametre, boolean etat) {
        this.numero = numero;
        this.diametre = diametre;
        this.etat = false;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public boolean getEtat() {
        return etat;
    }

    public int getNumero() {
        return numero;
    }

    public float getDiametre() {
        return diametre;
    }

}
