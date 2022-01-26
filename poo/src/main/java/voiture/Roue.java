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

    public Roue(int numero, float diametre) {
        this.numero = numero;
        this.diametre = diametre;
    }

    public Roue(int numero, float diametre, boolean etat) {
        this.numero = numero;
        this.diametre = diametre;
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
