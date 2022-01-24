/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionEleves;

/**
 *
 * @author sayan593
 */
public class Eleve {

    private String nom;
    private int[] listeNotes;
    private int nombreNotes = 0;
    private double moyenne = 0;

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int[] getListeNotes() {
        return listeNotes;
    }

    public void setListeNotes(int[] listeNotes) {
        this.listeNotes = listeNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public void ajouterNote(int note) {
        listeNotes[nombreNotes + 1] = note;
        nombreNotes++;
    }

}
