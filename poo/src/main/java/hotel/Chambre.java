/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class Chambre {

    private int numéro;
    private String[] typesChambre = {"single", "twin", "double", "suite"};
    double prix;
    private int statut = 0;
    private int type = 0;

    public Chambre(int numéro, int type) {
        this.numéro = numéro;
    }

    public int getNuméro() {
        return numéro;
    }

    public void setNuméro(int numéro) {
        this.numéro = numéro;
    }

    public String[] getTypesChambre() {
        return typesChambre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
