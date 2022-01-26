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

    private int numero;
    private String[] typesChambre = {"single", "twin", "double", "suite"};
    double prix;
    private int statut = 0;
    private int type = 0;

    public Chambre(int numéro, int type) {
        this.numero = numéro;
    }

    public int getNuméro() {
        return numero;
    }

    public void setNuméro(int numéro) {
        this.numero = numéro;
    }

    public String getTypesChambre() {
        String liste = "Types de chambre : \n";
        for (int i = 0; i < typesChambre.length; i++) {
            liste += i + 1 + " : " + typesChambre[i] + "\n";
        }
        return liste;
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

    public String getType() {
        return typesChambre[type];
    }

    public void setType(int type) {
        this.type = type;
    }

}
