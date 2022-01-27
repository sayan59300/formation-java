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
    private static final String login = "nicolas";
    private static final String password = "employe01";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String choix = "";
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
                String choixQuestionType = "";
                int choixType = 0;
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
                String choixQuestionType = "";
                int choixType = 0;
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
                System.out.println("Login : ");
                String loginSaisie = scan.next().toLowerCase();
                System.out.println("Mot de passe : ");
                String passwordSaisie = scan.next();
                if (anthentification(loginSaisie, passwordSaisie)) {
                    System.out.println("Quel type de chambre voulez vous réserver ? " + Chambre.getListeTypesChambre());
                    int choixTypeChambre = scan.nextInt();
                    Chambre chambre = hotel.getPremiereChambreLibreParType(choixTypeChambre);
                    System.out.println("Nom du client : ");
                    String nomClient = scan.next();
                    System.out.println(Client.getTypesClient());
                    int typeClient = scan.nextInt();
                    Client client = new Client(nomClient, typeClient);
                    Reservation reservation = new Reservation(chambre, client);
                    if (hotel.ajoutReservation(reservation)) {
                        System.out.println("Réservation enregistrée");
                    } else {
                        System.out.println("Plus de place disponible");
                    }
                } else {
                    System.out.println("Autentification invalide");
                }
            }
            if (choix.equals("g")) {
                System.out.println("Login : ");
                String loginSaisie = scan.next().toLowerCase();
                System.out.println("Mot de passe : ");
                String passwordSaisie = scan.next();
                if (anthentification(loginSaisie, passwordSaisie)) {
                    System.out.println("Quel type de chambre voulez vous libérer ? " + Chambre.getListeTypesChambre());
                    int choixTypeChambre = scan.nextInt();
                    Chambre chambre = hotel.getDerniereChambreOccupeeParType(choixTypeChambre);
                    chambre.setStatut(true);
                    System.out.println("La dernière chambre de ce type est de nouveau disponible");
                } else {
                    System.out.println("Autentification invalide");
                }
            }

        } while (!choix.equals("q"));
    }

    private static boolean anthentification(String loginSaisie, String passwordSaisie) {
        boolean valide = false;
        if (loginSaisie.equals(login) && passwordSaisie.equals(password)) {
            valide = true;
        }
        return valide;
    }

}
