/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concours;

/**
 *
 * @author Sayan593
 */
public class Candidat {

    String nom, prenom;
    int numero, age;

    public Candidat(String nom, String prenom, int numero, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero = numero;
        this.age = age;
    }

    public String afficher() {
        return "\nCandidat numéro : " + numero + "\nNom : " + nom + "\nPrénom : " + prenom + "\nAge : " + age;
    }

}
