/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class Proprietaire extends Personne {

    private final int identifiant;
    private double impots;

    public Proprietaire(String nom, String prenom, int age, int identifiant) {
        super(nom, prenom, age);
        this.identifiant = identifiant;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public double getImpots() {
        return impots;
    }

    public void setImpots(double impots) {
        this.impots = impots;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIdentifiant : " + identifiant + '}';
    }

}
