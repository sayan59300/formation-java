
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class PairImpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        int sommePair = 0;
        int sommeImpair = 0;

        System.out.println("Saisir un entier (0 pour arrêter)");
        nombre = scan.nextInt();

        for (int i = 1; i <= nombre; i++) {
            if (i % 2 == 0) {
                sommePair += i;
            } else {
                sommeImpair += i;
            }
        }

        System.out.println("somme des entiers pairs : " + sommePair);
        System.out.println("somme des entiers impairs : " + sommeImpair);
    }
}
