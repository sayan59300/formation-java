/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sayan593
 */
public class Vol {

    private final int numero;
    private final Date dateDepart;
    private final Date dateArrivee;
    private final Aeroport AeroportDepart;
    private final Aeroport AeroportArrivée;
    private final ArrayList<Escale> escales = new ArrayList<>();

    public Vol(int numero, Date dateDepart, Date dateArrivee, Aeroport AeroportDepart, Aeroport AeroportArrivée) {
        this.numero = numero;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.AeroportDepart = AeroportDepart;
        this.AeroportArrivée = AeroportArrivée;
    }

    public int getNumero() {
        return numero;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public Aeroport getAeroportDepart() {
        return AeroportDepart;
    }

    public Aeroport getAeroportArrivée() {
        return AeroportArrivée;
    }

    public ArrayList<Escale> getEscales() {
        return escales;
    }

    public Vol ajouterEscale(Escale escale) {
        escales.add(escale);
        return this;
    }

}
