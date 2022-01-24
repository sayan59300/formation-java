
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Avenir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        exo1(scan);
        exo2(scan);
    }

    private static void exo1(Scanner scan) {
        int heure;
        int minute;

        System.out.println("Entrer l'heure : ");
        heure = scan.nextInt();

        System.out.println("Entrer les minutes : ");
        minute = scan.nextInt();

        if (minute == 59) {
            heure += 1;
            minute = 0;
        } else {
            minute += 1;
        }

        if (heure == 24) {
            heure = 0;
            minute = 0;
        }

        System.out.println("Dans une minute il sera " + heure + " heures(s) " + minute + " minute(s)");
    }

    private static void exo2(Scanner scan) {
        int heure;
        int minute;
        int seconde;

        System.out.println("Entrer l'heure : ");
        heure = scan.nextInt();

        System.out.println("Entrer les minutes : ");
        minute = scan.nextInt();

        System.out.println("Entrer les secondes : ");
        seconde = scan.nextInt();

        if (seconde == 59) {
            minute += 1;
            if (minute == 60) {
                heure += 1;
                minute = 0;
            }
            seconde = 0;
        } else {
            seconde += 1;
        }

        if (heure == 24) {
            heure = 0;
            minute = 0;
        }

        System.out.println("Dans une seconde il sera " + heure + " heures(s) " + minute + " minute(s) " + seconde + " secondes(s)");
    }

}
