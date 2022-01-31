/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.ArrayList;

/**
 *
 * @author sayan593
 */
public class CompagnieAerienne {

    private final int id;
    private final String nom;
    private final ArrayList<Vol> vols = new ArrayList<>();

    public CompagnieAerienne(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Vol> getVols() {
        return vols;
    }

    /**
     * Ajoute un Vol à la liste
     *
     * @param vol
     * @return
     */
    public CompagnieAerienne ajouterVol(Vol vol) {
        vols.add(vol);
        return this;
    }

}
