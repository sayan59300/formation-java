/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author Sayan593
 */
public class Auteur extends Personne {

    int numAuteur;

    public Auteur(int numAuteur, String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;
    }

    @Override
    public String afficher() {
        return super.afficher() + "\nNuméro auteur : " + numAuteur;
    }
}
