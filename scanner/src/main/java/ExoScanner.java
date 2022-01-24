
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class ExoScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("---jour---");
        jour(scan);

    }

    private static void jour(Scanner scan) {

        String[] jours = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        System.out.println("Saisir le chiffre du jour de la semaine : ");
        int a = scan.nextInt();
        if (a > 7 || a < 1) {
            System.out.println("Ne correspont à aucun jour");
        } else {
            System.out.println("Le jour de la semaine est : " + jours[a - 1]);
        }

    }

    private static void somme(Scanner scan) {
        System.out.println("Saisir un premier entier : ");
        int a = scan.nextInt();

        System.out.println("Saisir un second entier : ");
        int b = scan.nextInt();

        int resultat = a + b;
        System.out.printf("La somme de %d et %d de vaut %d\n", a, b, resultat);
    }
}
