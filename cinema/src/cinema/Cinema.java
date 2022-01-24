/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinema;

import java.util.Scanner;

/**
 * 1 cinéma a 3 Salles, chaque salle diffusant toujours le même film.
 *
 * - la salle 1 a 10 places et diffuse le film Les sept samouraïs, pour 7€ la
 * place - la salle 2 a 15 places et diffuse le film 8 1/2 , pour 5€ la place -
 * la salle 3 a 5 places et diffuse le film Nostalghia , pour 10€ la place
 *
 * Ecrire un programme pour les employés du Cinéma, permettant: - de choisir un
 * film pour un spectateur(à partir d'un menu) - de le faire payer (en plusieurs
 * fois si besoin) - de lui indiquer la salle où aller - de dire si la salle est
 * pleine - de pouvoir vider la salle (permettant de simuler la sortie des gens
 * après la séance) - d'avoir une rubrique Historique dans le menu, permettant
 * d'afficher les 10 dernières exécutions
 *
 * Le menu doit se réafficher tant que l'employer n'a pas décidé de quitter le
 * programme
 *
 * @author Sayan593
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Places des salles
        int[] places = {10, 15, 5};
        //Places restantes des salles
        int[] placesRestantes = {10, 15, 5};
        //Liste des films
        String[] film = {"Les sept samouraïs", "8 1/2", "Nostalghia"};
        //Prix des séances
        int[] prix = {7, 5, 10};
        //Historique des places prises
        String[] historique = new String[10];
        //Choix menu principal
        int choix = 0;
        //Choix menu film
        int choixFilm = 0;
        int paiement = 0;

        //menu principal
        do {
            System.out.println(
                    """
                    Quelle action souhaitez vous réaliser ?
                    1 - Choisir un film
                    2 - Vider une salle
                    3 - Afficher l'historique
                    4 - Quitter l'application
                    """
            );
            choix = scan.nextInt();
            //menu film
            if (choix == 1) {
                do {
                    System.out.println("Liste des films \n"
                            + "1 - " + film[0] + "\n"
                            + "2 - " + film[1] + "\n"
                            + "3 - " + film[2]
                    );

                    choixFilm = scan.nextInt();
                    switch (choixFilm) {
                        case 1:
                            if (checkPlaces(choixFilm - 1, placesRestantes)) {
                                afficherPlacesRestantes(choixFilm - 1, places, placesRestantes);
                                afficherPrix(choixFilm - 1, prix);
                                //On décrémente les places restantes pour le film sélectionné
                                placesRestantes[choixFilm - 1]--;
                                //Paiement
                                payer(paiement, prix, choixFilm - 1);
                                //On hydrate l'historique
                                addHistorique(film[choixFilm - 1], prix[choixFilm - 1], historique);
                                System.out.printf("""
                                                   -------------------------------
                                                    Dirigez vous vers la salle %d
                                                   -------------------------------
                                                   """, choixFilm);
                            } else {
                                System.out.println("""
                                                   ------------------------------------
                                                    Il n'y a plus de place disponible.
                                                   ------------------------------------
                                                   """);
                            }
                            break;
                        case 2:
                            if (checkPlaces(choixFilm - 1, placesRestantes)) {
                                afficherPlacesRestantes(choixFilm - 1, places, placesRestantes);
                                afficherPrix(choixFilm - 1, prix);
                                //On décrémente les places restantes pour le film sélectionné
                                placesRestantes[choixFilm - 1]--;
                                //Paiement
                                payer(paiement, prix, choixFilm - 1);
                                //On hydrate l'historique
                                addHistorique(film[choixFilm - 1], prix[choixFilm - 1], historique);
                                System.out.printf("""
                                                   -------------------------------
                                                    Dirigez vous vers la salle %d
                                                   -------------------------------
                                                   """, choixFilm);
                            } else {
                                System.out.println("""
                                                   ------------------------------------
                                                    Il n'y a plus de place disponible.
                                                   ------------------------------------
                                                   """);
                            }
                            break;
                        case 3:
                            if (checkPlaces(choixFilm - 1, placesRestantes)) {
                                afficherPlacesRestantes(choixFilm - 1, places, placesRestantes);
                                afficherPrix(choixFilm - 1, prix);
                                //On décrémente les places restantes pour le film sélectionné
                                placesRestantes[choixFilm - 1]--;
                                //Paiement
                                payer(paiement, prix, choixFilm - 1);
                                //On hydrate l'historique
                                addHistorique(film[choixFilm - 1], prix[choixFilm - 1], historique);
                                System.out.printf("""
                                                   -------------------------------
                                                    Dirigez vous vers la salle %d
                                                   -------------------------------
                                                   """, choixFilm);
                            } else {
                                System.out.println("""
                                                   ------------------------------------
                                                    Il n'y a plus de place disponible.
                                                   ------------------------------------
                                                   """);
                            }
                            break;
                        default:
                            break;
                    }
                } while (choixFilm != 1 && choixFilm != 2 && choixFilm != 3);
                //fin menu film
            }
            if (choix == 3) {
                System.out.println("---Historique---");
                for (int i = 0; i < 10; i++) {
                    if (historique[i] != null) {
                        System.out.println(historique[i]);
                    }
                }
                System.out.println("---Fin de l'historique---\n");
            }
        } while (choix != 4);
        //fin menu principal

    }

    /**
     * Affiche le prix du film sélectionné
     *
     * @param index
     * @param prix
     */
    private static void afficherPrix(int index, int[] prix) {
        System.out.println("Prix : " + prix[index] + " €");
    }

    /**
     * Affiche le prix du film sélectionné
     *
     * @param index
     * @param places
     * @param placesRestantes
     */
    private static void afficherPlacesRestantes(int index, int[] places, int[] placesRestantes) {
        System.out.println("Place restantes : " + placesRestantes[index] + " sur " + places[index]);
    }

    /**
     * Contrôle le nombre de places restantes de la salle sélectionnée
     *
     * @param index
     * @param placesRestantes
     * @return
     */
    private static boolean checkPlaces(int index, int[] placesRestantes) {
        boolean disponible = false;
        if (placesRestantes[index] != 0) {
            disponible = true;
        }
        return disponible;
    }

    /**
     * Réglement de la place
     *
     * @param paiement
     * @param prix
     * @param film
     */
    private static void payer(int paiement, int[] prix, int film) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                           ----------
                            Paiement
                           ----------
                           """);
        paiement = scan.nextInt();
        while (paiement < prix[film]) {
            System.out.println("Il reste " + (prix[film] - paiement) + " à régler");
            paiement += scan.nextInt();
        }
        System.out.println("""
                           ------------------
                            Paiement complet
                           ------------------
                           """);

        if (paiement > prix[film]) {
            System.out.printf("""
                           ---------------
                            Rendre : %d €
                           ---------------
                           """, (paiement - prix[film]));
        }
    }

    /**
     * Rempli l'historique, si on trouve un place vide on rempli sinon on rempli
     * la première case
     *
     * @param film
     * @param prix
     * @param historique
     */
    public static void addHistorique(String film, int prix, String[] historique) {
        boolean trouve = false;
        for (int i = 0; i < historique.length; i++) {
            if (historique[i] == null) {
                historique[i] = "1 place prise pour le film : " + film + " au prix de " + prix + " €";
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            historique[0] = "1 place prise pour le film : " + film + " au prix de " + prix + " €";
        }
    }

}
