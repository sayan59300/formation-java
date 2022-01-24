
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class ExoEmploye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // création du tableau
        String[] tabEmploye = {
            "Hervé",
            "Jean-guy",
            "Sylvain",
            "Jean-claude",
            "Jeanne",
            "Frédérique",
            "Maeva",
            "Carole",
            "Nancy",
            "Philippe"
        };

        //choix de l'utilisateur dans le menu
        String choix;
        //nom de l'employé
        String employe;

        //affiche le tableau à l'utilisateur
        affichage(tabEmploye);

        //affichage du menu
        do {
            System.out.println("""
                               Que voulez vous faire ?
                               A - Chercher un employé
                               B - Supprimer un employé
                               C - Modifier un employé
                               D - Ajouter un employé
                               Q - Quitter
                               """);
            choix = scan.next().toLowerCase();
        } while (!choix.equals("a") && !choix.equals("b") && !choix.equals("c") && !choix.equals("d") && !choix.equals("q"));

        switch (choix) {
            case "a" -> {
                System.out.println("Qui cherchez vous ? ");
                employe = scan.next().toLowerCase();
                if (search(tabEmploye, employe)) {
                    System.out.println("L'employé a été trouvé.");
                } else {
                    System.out.println("L'employé n'existe pas.");
                }
            }
            case "b" -> {
                System.out.println("Qui voulez vous supprimer ? ");
                employe = scan.next().toLowerCase();
                if (delete(tabEmploye, employe)) {
                    System.out.println("L'employé a été supprimé.");
                } else {
                    System.out.println("L'employé n'existe pas.");
                }
                affichage(tabEmploye);
            }
            case "c" -> {
                System.out.println("Qui voulez modifier ? ");
                employe = scan.next().toLowerCase();
                if (search(tabEmploye, employe)) {
                    System.out.println("Nouveau nom ? ");
                    String nouveauNom = scan.next();
                    for (int i = 0; i < tabEmploye.length; i++) {
                        if (tabEmploye[i].toLowerCase().equals(employe)) {
                            tabEmploye[i] = nouveauNom;
                        }
                    }
                    System.out.println("L'employé a été modifié.");
                } else {
                    System.out.println("L'employé n'existe pas.");
                }
                affichage(tabEmploye);
            }
            case "d" -> {
                if (disponible(tabEmploye)) {
                    System.out.println("Nom de l'employé à ajouter : ");
                    String nouvelEmploye = scan.next();
                    add(tabEmploye, nouvelEmploye);
                    System.out.println("L'employé ajouté.");
                    affichage(tabEmploye);
                } else {
                    System.out.println("Il n'y a plus de place dans le tableau, supprimer un employé ? ");
                    String reponse = scan.next().toLowerCase();
                    if (reponse.equals("oui")) {
                        System.out.println("Quel employé voulez vous supprimer ?");
                        employe = scan.next().toLowerCase();
                        if (delete(tabEmploye, employe)) {
                            System.out.println("L'employé a été supprimé.");
                            System.out.println("Nom de l'employé à ajouter : ");
                            String nouvelEmploye = scan.next();
                            add(tabEmploye, nouvelEmploye);
                            System.out.println("L'employé ajouté.");
                            affichage(tabEmploye);
                        } else {
                            System.out.println("L'employé n'existe pas.");
                        }
                    } else {
                        break;
                    }
                }
            }
            default -> {
            }
        }

    }

    /**
     * Fonction de recherche d'un employé
     *
     * @param tabEmploye
     * @param employe
     * @return
     */
    private static boolean search(String[] tabEmploye, String employe) {
        boolean trouve = false;
        for (int i = 0; i < tabEmploye.length; i++) {
            if (tabEmploye[i].toLowerCase().equals(employe)) {
                trouve = true;
            }
        }
        return trouve;
    }

    /**
     * Fonction de suppression d'un employé
     *
     * @param tabEmploye
     * @param employe
     * @return
     */
    private static boolean delete(String[] tabEmploye, String employe) {
        boolean check = false;
        for (int i = 0; i < tabEmploye.length; i++) {
            if (tabEmploye[i].toLowerCase().equals(employe)) {
                tabEmploye[i] = null;
                check = true;
            }
        }
        return check;
    }

    /**
     * Affichage du tableau
     */
    private static void affichage(String[] tabEmploye) {
        System.out.println("---Liste des employés---");
        for (int i = 0; i < tabEmploye.length; i++) {
            System.out.println(tabEmploye[i]);
        }
        System.out.println("---Fin du tableau---");
    }

    /**
     * Contrôle si il y a un espace disponible dans le tableau
     */
    private static boolean disponible(String[] tabEmploye) {
        boolean empty = false;
        for (int i = 0; i < tabEmploye.length; i++) {
            if (tabEmploye[i] == null) {
                empty = true;
            }
        }
        return empty;
    }

    /**
     * Fonction d'ajout d'un employé
     *
     * @param tabEmploye
     * @param employe
     * @return
     */
    private static void add(String[] tabEmploye, String employe) {
        for (int i = 0; i < tabEmploye.length; i++) {
            if (tabEmploye[i] == null) {
                tabEmploye[i] = employe;
            }
        }
    }
}
