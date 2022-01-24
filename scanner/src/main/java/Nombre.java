
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        int resultat = 0;
        int min = 0;

        do {
            System.out.println("Saisir un entier (0 pour arrêter)");
            nombre = scan.nextInt();
            resultat += nombre;
            if (min > nombre || min == 0) {
                if (nombre != 0) {
                    min = nombre;
                }
            }
        } while (nombre != 0);

        System.out.println("---somme et plus petit---");
        System.out.println("La somme des nombres vaut : " + resultat);
        System.out.println("Le plus petit nombre est : " + min);
    }
}
