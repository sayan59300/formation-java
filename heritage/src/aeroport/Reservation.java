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
public class Reservation {

    private final Vol vol;
    private final ArrayList<Passager> listePassagers = new ArrayList<>();

    public Reservation(Vol vol) {
        this.vol = vol;
    }

    public Vol getVol() {
        return vol;
    }

    public ArrayList<Passager> getPassagers() {
        return listePassagers;
    }

    /**
     * Ajoute une Reservation à la liste
     *
     * @param passager
     * @return
     */
    public Reservation AjouterPassager(Passager passager) {
        listePassagers.add(passager);
        return this;
    }

}
