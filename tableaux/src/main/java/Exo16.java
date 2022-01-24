
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo16 {

    /**
     * Afficher les 2 plus grand nombre d'un tableau
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[6];
        int max = 0;
        int max2 = 0;

        //on rempli le tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrer valeur : ");
            tab[i] = scan.nextInt();
            //max
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        //max2
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max2 && tab[i] != max) {
                max2 = tab[i];
            }
        }

        System.out.println("Le nombre maximum est : " + max);
        System.out.println("Le second nombre maximum est : " + max2);

    }

}
