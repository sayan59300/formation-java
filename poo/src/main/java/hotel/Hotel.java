/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class Hotel {

    private String nom;
    private Chambre[] listeChambres;
    private Reservation[] listeReservations;

    public Hotel(String nom, int taille) {
        this.nom = nom;
        this.listeChambres = new Chambre[taille];
        this.listeReservations = new Reservation[taille];
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chambre[] getListeChambre() {
        return listeChambres;
    }

    public int getChambresLibres() {
        int count = 0;
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut()) {
                count++;
            }
        }
        return count;
    }

    public Chambre getPremiereChambreLibre() {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut()) {
                chambre = listeChambres[i];
                break;
            }
        }
        return chambre;
    }

    public Chambre getPremiereChambreLibreParType(int type) {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut() && listeChambres[i].getType() == type - 1) {
                chambre = listeChambres[i];
                break;
            }
        }
        return chambre;
    }

    public Chambre getDerniereChambreLibre() {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut()) {
                chambre = listeChambres[i];
            }
        }
        return chambre;
    }

    public Chambre getDerniereChambreLibreParType(int type) {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut() && listeChambres[i].getType() == type - 1) {
                chambre = listeChambres[i];
            }
        }
        return chambre;
    }

    public int getChambresReservees() {
        int count = 0;
        for (int i = 0; i < listeReservations.length; i++) {
            if (listeReservations[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void ajoutChambre(Chambre chambre, int index) {
        for (int i = 0; i < listeChambres.length; i++) {
            listeChambres[i] = chambre;
        }
    }

    public String afficheListeChambres() {
        String affiche = "-----------------------Liste des chambres------------------------\n";
        for (int i = 0; i < listeChambres.length; i++) {
            affiche += listeChambres[i];
        }
        affiche += "\n--------------------------------------------------------------\n";
        return affiche;
    }

    @Override
    public String toString() {
        String affiche = "-----------------------Etat de l'hotel------------------------"
                + "\nNom = " + nom + "\nNombre de chambres = " + listeChambres.length;
        affiche += "\n--------------------------------------------------------------\n";
        return affiche;
    }
}
