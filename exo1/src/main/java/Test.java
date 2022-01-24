/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.lang.Math;

/**
 *
 * @author sayan593
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 8;
        int b = 5;

        System.out.println("---addition---");
        addition(a, b);
        System.out.println("---reste---");
        reste(a, b);
        System.out.println("---puissance---");
        puissance(a, b);

    }

    /**
     * affiche le résultat de l'addition de nombre1 et de nombre 2, affiche quel
     * nombre est le plus grand ou si ils sont égaux
     *
     * @param nombre1
     * @param nombre2
     */
    private static void addition(int nombre1, int nombre2) {
        System.out.println("L'addition de a et de b donne : " + (nombre1 + nombre2));

        if (nombre1 > nombre2) {
            System.out.println("Le nombre le plus grand est a");
        } else if (nombre1 < nombre2) {
            System.out.println("Le nombre le plus grand est b");
        } else {
            System.out.println("Les nombres sont égaux");
        }
    }

    /**
     * affiche le reste de la division de nombre1 et de nombre2
     *
     * @param nombre1
     * @param nombre2
     */
    private static void reste(int nombre1, int nombre2) {
        System.out.println("Le reste de la division de a et de b est de : " + (nombre1 % nombre2));
    }

    /**
     * elève nombre à la puissance passée en argument et affiche le résultat
     *
     * @param nombre
     * @param puissance
     */
    private static void puissance(int nombre, int puissance) {
        System.out.println(nombre + " puissance " + puissance + " = " + Math.pow(nombre, puissance));
    }

}
