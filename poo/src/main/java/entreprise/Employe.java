/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entreprise;

/**
 *
 * @author sayan593
 */
public class Employe {

    private String id;
    private String nom;
    private String prenom;
    private String sexe;
    private double salaire;

    @Override
    public String toString() {
        return "---\nEmploye \nid = "
                + id + "\nNom = "
                + nom + "\nPrenom = "
                + prenom + "\nSexe = "
                + sexe + "\nSalaire = "
                + salaire;
    }

    public String getId() {
        return id;
    }

    public void setId(int id, String entreprise) {
        this.id = "2022-" + id + "-" + entreprise;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
