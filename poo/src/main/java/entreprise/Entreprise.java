/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entreprise;

/**
 *
 * @author sayan593
 */
public class Entreprise {

    private String nom;
    private String secteur;
    private Employe[] employes = new Employe[1];
    private int nombreEmployes;

    @Override
    public String toString() {
        return "Entreprise " + nom + "\nSecteur = " + secteur + "\nNombre d'employé(s) = " + nombreEmployes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public String getEmployes() {
        String liste = "";
        for (int i = 0; i < this.employes.length; i++) {
            liste += this.employes[i] + "\n";
        }
        return liste;
    }

    public void setEmployes(Employe employes) {
        if (nombreEmployes == 0) {
            this.employes[0] = employes;
            nombreEmployes++;
        } else {
            Employe[] newlisteEmployes = new Employe[this.employes.length + 1];
            for (int i = 0; i < this.employes.length; i++) {
                newlisteEmployes[i] = this.employes[i];
            }
            newlisteEmployes[newlisteEmployes.length - 1] = employes;
            this.employes = new Employe[newlisteEmployes.length];
            for (int i = 0; i < newlisteEmployes.length; i++) {
                this.employes[i] = newlisteEmployes[i];
            }
            nombreEmployes++;
        }
    }

}
