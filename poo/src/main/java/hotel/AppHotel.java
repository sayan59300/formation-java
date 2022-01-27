/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Sayan593
 */
public class AppHotel {

    /**
     * Réserver une chambre (réserve la première chambre vide), Libérer une
     * chambre (libère la dernière chambre occupée)
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String choix = "";
        String choixQuestionType = "";
        int choixType = 0;
        Hotel hotel = new Hotel("Waldorf Astoria", 20);
        for (int i = 0; i < hotel.getListeChambre().length; i++) {
            Chambre chambre = new Chambre(i + 1, random.nextInt(4), random.nextInt(2), random.nextDouble(30, 50));
            hotel.getListeChambre()[i] = chambre;
        }
        do {
            System.out.println("""

                               ---------------MENU HOTEL CDA JAVA---------------
                               A- Afficher l'état de l'hôtel
                               B- Afficher le nombre de chambres réservées
                               C- Afficher le nombre de chambres libres
                               D- Afficher le numéro de la première chambre vide
                               E- Afficher le numéro de la dernière chambre vide
                               F- Réserver une chambre
                               G- Libérer une chambre

                               Q- Quitter l'application
                               -------------------------------------------------
                               """);
            choix = scan.next().toLowerCase();

            if (choix.equals("a")) {
                System.out.println(hotel);
            }
            if (choix.equals("b")) {
                System.out.println("Nombre de chambres réservées " + hotel.getChambresReservees());
            }
            if (choix.equals("c")) {
                System.out.println("Nombre de chambres libres " + hotel.getChambresLibres());
            }
            if (choix.equals("d")) {
                do {
                    System.out.println("Voulez vous un type particulier ? oui/non");
                    choixQuestionType = scan.next();
                    if (choixQuestionType.equals("oui")) {
                        do {
                            System.out.println("Quel type recherchez vous ?\n" + Chambre.getListeTypesChambre());
                            choixType = scan.nextInt();
                            if (choixType == 1) {
                                System.out.println("Première chambre libre" + hotel.getPremiereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 2) {
                                System.out.println("Première chambre libre" + hotel.getPremiereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 3) {
                                System.out.println("Première chambre libre" + hotel.getPremiereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 4) {
                                System.out.println("Première chambre libre" + hotel.getPremiereChambreLibreParType(choixType));
                                break;
                            }
                        } while (choixType != 1 || choixType != 2 || choixType != 3 || choixType != 4);
                    } else if (choixQuestionType.equals("non")) {
                        System.out.println("Première chambre libre" + hotel.getPremiereChambreLibre());
                        break;
                    }
                    break;
                } while (!choixQuestionType.equals("oui") || !choixQuestionType.equals("non"));
            }
            if (choix.equals("e")) {
                do {
                    System.out.println("Voulez vous un type particulier ? oui/non");
                    choixQuestionType = scan.next().toLowerCase();
                    if (choixQuestionType.equals("oui")) {
                        do {
                            System.out.println("Quel type recherchez vous ?\n" + Chambre.getListeTypesChambre());
                            choixType = scan.nextInt();
                            if (choixType == 1) {
                                System.out.println("Dernière chambre libre" + hotel.getDerniereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 2) {
                                System.out.println("Dernière chambre libre" + hotel.getDerniereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 3) {
                                System.out.println("Dernière chambre libre" + hotel.getDerniereChambreLibreParType(choixType));
                                break;
                            }
                            if (choixType == 4) {
                                System.out.println("Dernière chambre libre" + hotel.getDerniereChambreLibreParType(choixType));
                                break;
                            }
                        } while (choixType != 1 || choixType != 2 || choixType != 3 || choixType != 4);
                    } else if (choixQuestionType.equals("non")) {
                        System.out.println("Dernière chambre libre" + hotel.getDerniereChambreLibre());
                        break;
                    }
                    break;
                } while (!choixQuestionType.equals("oui") || !choixQuestionType.equals("non"));
            }
            if (choix.equals("f")) {

            }
            if (choix.equals("g")) {

            }

        } while (!choix.equals("q"));
    }

}
