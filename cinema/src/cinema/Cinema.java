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
        //places des salles
        int[] places = {10, 15, 5};
        //places restantes des salles
        int[] placesRestantes = {10, 15, 5};
        //liste des films
        String[] film = {"Les sept samouraïs", "8 1/2", "Nostalghia"};
        //prix des séances
        int[] prix = {7, 5, 10};
        //choix menu principal
        int choix = 0;
        //choix menu film
        int choixFilm = 0;

        //menu principal
        do {
            System.out.println(
                    """
                    Quelle action souhaitez vous réaliser ?
                    1 - Choisir un film
                    2 - Vider une salle
                    3 - Quitter l'application
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
                            }
                            break;
                        case 2:
                            if (checkPlaces(choixFilm - 1, placesRestantes)) {
                                afficherPlacesRestantes(choixFilm - 1, places, placesRestantes);
                                afficherPrix(choixFilm - 1, prix);
                            }
                            break;
                        case 3:
                            if (checkPlaces(choixFilm - 1, placesRestantes)) {
                                afficherPlacesRestantes(choixFilm - 1, places, placesRestantes);
                                afficherPrix(choixFilm - 1, prix);
                            }
                            break;
                        default:
                            break;
                    }
                } while (choixFilm != 1 && choixFilm != 2 && choixFilm != 3);
                //fin menu film
            }
        } while (choix != 3);
        //fin menu principal

    }

    /**
     * Affiche le prix du film sélectionné
     *
     * @param index
     * @param prix
     */
    private static void afficherPrix(int index, int[] prix) {
        System.out.println(prix[index] + " €");
    }

    /**
     * Affiche le prix du film sélectionné
     *
     * @param index
     * @param prix
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

}
