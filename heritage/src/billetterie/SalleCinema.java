/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billetterie;

/**
 *
 * @author sayan593
 */
public class SalleCinema {

    private final String film;
    private final int nombrePlaces;
    private final double tarifNormal;
    private int nombrePlacesVenduesTarifNormal = 0;
    private int nombrePlacesVenduesTarifReduit = 0;

    public String getFilm() {
        return film;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public double getTarifNormal() {
        return tarifNormal;
    }

    public int getNombrePlacesVenduesTarifNormal() {
        return nombrePlacesVenduesTarifNormal;
    }

    public int getNombrePlacesVenduesTarifReduit() {
        return nombrePlacesVenduesTarifReduit;
    }

    public SalleCinema(String film, int nombrePlaces, double tarifNormal) {
        this.film = film;
        this.nombrePlaces = nombrePlaces;
        this.tarifNormal = tarifNormal;
    }

    public int nombrePlacesDisponibles() {
        return nombrePlaces - (nombrePlacesVenduesTarifNormal + nombrePlacesVenduesTarifReduit);
    }

    public double ChiffreAffaire() {
        return (nombrePlacesVenduesTarifNormal * tarifNormal) + (nombrePlacesVenduesTarifReduit * (tarifNormal - (tarifNormal * 20) / 100));
    }

    public void vendrePlaces(int nombre, boolean tarifReduit) {
        double total;
        if (nombre > nombrePlacesDisponibles()) {
            System.out.println("Le nombre de places demandées dépasse le nombre de place(s) restante(s)");
        } else {
            if (tarifReduit) {
                total = nombre * (tarifNormal - ((tarifNormal * 20) / 100));
                nombrePlacesVenduesTarifReduit += nombre;
            } else {
                total = nombre * tarifNormal;
                nombrePlacesVenduesTarifNormal += nombre;
            }
            System.out.println("Total encaissé : " + total + " €");
        }
    }

    @Override
    public String toString() {
        return "\nFilm = " + film
                + "\nnombrePlaces = " + nombrePlaces
                + "\ntarifNormal = " + tarifNormal
                + "\nnombrePlacesVenduesTarifNormal = " + nombrePlacesVenduesTarifNormal
                + "\nnombrePlacesVenduesTarifReduit = " + nombrePlacesVenduesTarifReduit
                + "\nnombrePlacesDisponibles = " + nombrePlacesDisponibles();
    }

}
