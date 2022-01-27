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

    public Reservation[] getListeReservations() {
        return listeReservations;
    }

    /**
     * retourne le nombre de chambres libres
     *
     * @return
     */
    public int getChambresLibres() {
        int count = 0;
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut()) {
                count++;
            }
        }
        return count;
    }

    /**
     * retourne la première chambre libre
     *
     * @return
     */
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

    /**
     * retourne la première chambre libre en fonction de son type
     *
     * @param type
     * @return
     */
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

    /**
     * retourne la dernière chambre libre
     *
     * @return
     */
    public Chambre getDerniereChambreLibre() {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut()) {
                chambre = listeChambres[i];
            }
        }
        return chambre;
    }

    /**
     * retourne la dernière chambre libre en fonction de son type
     *
     * @param type
     * @return
     */
    public Chambre getDerniereChambreLibreParType(int type) {
        Chambre chambre = new Chambre();
        for (int i = 0; i < listeChambres.length; i++) {
            if (listeChambres[i].getStatut() && listeChambres[i].getType() == type - 1) {
                chambre = listeChambres[i];
            }
        }
        return chambre;
    }

    /**
     * retourne la dernière chambre occupée en fonction de son type
     *
     * @param type
     * @return
     */
    public Chambre getDerniereChambreOccupeeParType(int type) {
        Chambre chambre = new Chambre();
        for (int i = listeChambres.length - 1; i > 0; i--) {
            if (!listeChambres[i].getStatut() && listeChambres[i].getType() == type - 1) {
                chambre = listeChambres[i];
            }
        }
        return chambre;
    }

    /**
     * retourne le nombre de chambres reservées
     *
     * @return
     */
    public int getChambresReservees() {
        int count = 0;
        for (int i = 0; i < listeReservations.length; i++) {
            if (listeReservations[i] != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * ajoute une chambre a la liste des chambres
     *
     * @param chambre
     * @param index
     */
    public void ajoutChambre(Chambre chambre, int index) {
        for (int i = 0; i < listeChambres.length; i++) {
            listeChambres[i] = chambre;
        }
    }

    /**
     * ajoute une réservation à la liste des réservations
     *
     * @param reservation
     * @return
     */
    public boolean ajoutReservation(Reservation reservation) {
        boolean reserve = false;
        for (int i = 0; i < listeReservations.length; i++) {
            if (listeReservations[i] == null) {
                listeReservations[i] = reservation;
                reservation.getChambre().setStatut(false);
                reserve = true;
                break;
            }
        }
        return reserve;
    }

    /**
     * affiche la liste des chambres
     *
     * @return
     */
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
