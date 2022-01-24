
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo15 {

    /**
     * fusionner 2 tableaux
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab1 = new int[5];
        int[] tab2 = new int[5];
        int[] tab3 = new int[10];

        //on rempli le premier tableau
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("Entrer valeur pour le premier tableau : ");
            tab1[i] = scan.nextInt();
        }

        //on rempli le second tableau
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Entrer valeur pour le second tableau : ");
            tab2[i] = scan.nextInt();
        }

        //on fusionne les 2 tableaux
        for (int i = 0; i < tab3.length; i++) {
            if (i < tab1.length) {
                tab3[i] = tab1[i];
            } else {
                tab3[i] = tab2[i - tab1.length];
            }
        }

        // on tri le tableau fusionné
        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3.length; j++) {
                if (tab3[i] < tab3[j]) {
                    int temp = tab3[i];
                    tab3[i] = tab3[j];
                    tab3[j] = temp;
                }
            }
        }

        System.out.println("Après avoir trié les entrées voilà le résultat");
        for (int i = 0; i < tab3.length; i++) {
            System.out.println("Entrée " + i + " = " + tab3[i]);
        }

    }

}
