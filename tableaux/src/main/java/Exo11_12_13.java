
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo11_12_13 {

    /**
     * rempli un tableau de 10 entiers avec les entrées de l'utilisateur,
     * affiche l'index correspondant à la case prise par la saisie dans le
     * tableau, affiche le résultat de l'addition des entiers, affiche la valeur
     * minimal entrée, affiche la valeur maximal entrée, calcul la moyenne et
     * l'affiche
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nombres = new int[10];
        int i = 0;
        double resultat = 0;
        int min = 0;
        int max = 0;
        double moyenne;

        // on rempli le tableau
        do {
            System.out.println("Entrez un nombre");
            nombres[i] = scan.nextInt();
            System.out.println("Le nombre " + nombres[i] + " prend la position " + i + " dans le tableau");
            if (min > nombres[i] || min == 0) {
                min = nombres[i];
            }
            if (max < nombres[i]) {
                max = nombres[i];
            }
            i++;
        } while (i < nombres.length);

        // calcul
        for (int j = 0; j < nombres.length; j++) {
            resultat += nombres[j];
        }
        moyenne = resultat / nombres.length;

        //affichage
        System.out.println("Le résultat de l'addition est : " + resultat);
        System.out.println("Le minimum est : " + min);
        System.out.println("Le maximum est : " + max);
        System.out.println("La moyenne est : " + moyenne);

    }
}
