/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concours;

/**
 *
 * @author Sayan593
 */
public class Fonctionnaire extends Candidat {

    double salaire;

    public Fonctionnaire(String nom, String prenom, int numero, int age, double salaire) {
        super(nom, prenom, numero, age);
        this.salaire = salaire;
    }

    @Override
    public String afficher() {
        return super.afficher() + "\nSalaire : " + salaire;
    }
}
