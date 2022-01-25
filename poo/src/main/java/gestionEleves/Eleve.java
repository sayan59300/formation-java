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
    private double[] listeNotes = new double[1];
    private int nombreNotes = 0;
    private double moyenne = 0;

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void getListeNotes() {
        for (int i = 0; i < listeNotes.length; i++) {
            System.out.println("Note " + (i + 1) + " : " + listeNotes[i]);
        }
    }

    public double getMoyenne() {
        double totalNote = 0;
        for (int i = 0; i < listeNotes.length; i++) {
            totalNote = totalNote + listeNotes[i];
        }
        moyenne = totalNote / nombreNotes;
        return moyenne;
    }

    public void ajouterNote(int note) {
        if (nombreNotes == 0) {
            listeNotes[0] = note;
            nombreNotes++;
        } else {
            double[] newlisteNotes = new double[listeNotes.length + 1];
            for (int i = 0; i < listeNotes.length; i++) {
                newlisteNotes[i] = listeNotes[i];
            }
            newlisteNotes[newlisteNotes.length - 1] = note;
            listeNotes = new double[newlisteNotes.length];
            for (int i = 0; i < newlisteNotes.length; i++) {
                listeNotes[i] = newlisteNotes[i];
            }
            nombreNotes++;
        }

    }

    @Override
    public String toString() {
        return "Eleve : " + nom + "\nMoyenne = " + getMoyenne();
    }

}
