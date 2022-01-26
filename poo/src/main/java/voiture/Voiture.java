/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package voiture;

/**
 *
 * @author Sayan593
 */
public class Voiture {

    private int numero;
    private String marque;
    private String couleur;

    /**
     * Tableau contenant les roues de la voiture
     *
     * AVG 1, AVD 2, ARG 3, ARD 4
     */
    private Roue[] roues = new Roue[4];

    public Voiture(int numero, String marque, String couleur) {
        this.numero = numero;
        this.marque = marque;
        this.couleur = couleur;
    }

    /**
     * Permet d'ajouter une roue en spécifiant l'emplacement (AVG 1, AVD 2, ARG
     * 3, ARD 4)
     *
     * @param roue
     * @param emplacement
     * @return
     */
    public Voiture ajoutRoue(Roue roue, int emplacement) {
        this.roues[emplacement - 1] = roue;
        roue.setEtat(false);
        return this;
    }

    public int getNumero() {
        return numero;
    }

    public String getMarque() {
        return marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public Roue[] getRoues() {
        return roues;
    }

}
