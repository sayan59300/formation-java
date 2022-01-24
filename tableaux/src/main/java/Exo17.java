
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo17 {

    /**
     * créer un tableau et en faire une copie
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab1 = new int[6];
        int[] tab2 = new int[6];

        //on rempli le tableau
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("Entrer valeur : ");
            tab1[i] = scan.nextInt();
            //copie de la valeur de tab1 dans tab2
            tab2[i] = tab1[i];
            //syntaxe alterbative sur une ligne
            //tab2[i] = tab1[i] = scan.nextInt();
        }
        //avec Arrays : int tab2[] = Arrays.copyOf(tab1, tab1.length)

        //affichage
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Index " + i + " dans le tableau 1 : " + tab1[i]);
            System.out.println("Index " + i + " dans le tableau 2 : " + tab2[i]);
        }
    }

}
