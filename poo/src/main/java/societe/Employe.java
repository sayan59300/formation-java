/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package societe;

import java.util.Random;

/**
 *
 * @author sayan593
 */
public class Employe {

    private int numero;
    private String nom;
    private Societe societe;
    private double salaire;

    public Employe(String nom, Societe societe) {
        Random random = new Random();
        int inter = 1;
        for (int i = 0; i < 30; i++) {
            inter = inter + random.nextInt(9);
        }
        this.numero = inter;
        this.nom = nom;
        this.societe = societe;
    }

    public Societe getSociete() {
        return societe;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void augmenterSalaire(double taux) {
        this.salaire += ((this.salaire * taux) / 100);
    }

    public boolean estCollegue(Employe collegue) {
        boolean estCollegue = false;
        if (collegue.getSociete().getNom().equals(this.societe.getNom())) {
            estCollegue = true;
        }
        return estCollegue;
    }

    @Override
    public String toString() {
        return nom + " numero:" + numero + " societe:" + societe + " salaire:" + salaire;
    }

}
