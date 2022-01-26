/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package societe;

/**
 *
 * @author sayan593
 */
public class Societe {

    private String nom;
    private Employe[] employes = new Employe[1];
    private double masseSalariale = 0;
    private int nombreEmployes;

    public Societe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public double getMasseSalariale() {
        for (int i = 0; i < employes.length; i++) {
            masseSalariale += employes[i].getSalaire();
        }
        return masseSalariale;
    }

    public void embaucher(Employe employe) {
        if (nombreEmployes == 0) {
            this.employes[0] = employe;
            nombreEmployes++;
        } else {
            societe.Employe[] newlisteEmployes = new societe.Employe[this.employes.length + 1];
            System.arraycopy(this.employes, 0, newlisteEmployes, 0, this.employes.length);
            newlisteEmployes[newlisteEmployes.length - 1] = employe;
            this.employes = new societe.Employe[newlisteEmployes.length];
            System.arraycopy(newlisteEmployes, 0, this.employes, 0, newlisteEmployes.length);
            nombreEmployes++;
        }
    }

    public void augmentationGenerale(double taux) {
        for (int i = 0; i < employes.length; i++) {
            employes[i].augmenterSalaire(taux);
        }
    }

    public String listeEmployes() {
        String liste = "";
        for (int i = 0; i < employes.length; i++) {
            liste += employes[i] + "\n";
        }
        return liste;
    }

    @Override
    public String toString() {
        return nom;
    }

}
