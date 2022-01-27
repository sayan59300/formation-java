/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.text.DecimalFormat;

/**
 *
 * @author Sayan593
 */
public class Chambre {

    private static final DecimalFormat formater = new DecimalFormat("0.00");
    private int numero;
    private static String[] typesChambre = {"single", "twin", "double", "suite"};
    double prix;
    private boolean statut = true;
    private int type = 0;

    public Chambre() {
    }

    public Chambre(int numéro, int type) {
        this.numero = numéro;
        this.type = type;
    }

    public Chambre(int numéro, int type, int statut, double prix) {
        this.numero = numéro;
        this.type = type;
        if (statut == 0) {
            this.statut = false;
        }
        this.prix = prix;
    }

    public int getNuméro() {
        return numero;
    }

    public void setNuméro(int numéro) {
        this.numero = numéro;
    }

    public static String getListeTypesChambre() {
        String liste = "Types de chambre : \n";
        for (int i = 0; i < typesChambre.length; i++) {
            liste += i + 1 + " : " + typesChambre[i] + "\n";
        }
        return liste;
    }

    public static String[] getTypesChambre() {
        return typesChambre;
    }

    public String getTypeChambre(int index) {
        return typesChambre[index];
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean getStatut() {
        return statut;
    }

    @Override
    public String toString() {
        return "\n------------------\nChambre " + numero + "\nType : " + typesChambre[type] + "\nPrix : " + formater.format(prix) + "\nStatut " + (statut ? "Libre" : "Occupée");
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type - 1;
    }

}
