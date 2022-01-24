
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo18 {

    /**
     * Créez un programme qui crée et initialise un tableau de taille N (à
     * donner par l'utilisateur), puis supprimez un élément de ce tableau à la
     * position spécifiée (de 0 à N-1)
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int deletedValue;
        int temp;

        //on demande la taille du tableau souhaitée
        System.out.println("Taille du tableau ? ");
        int[] tab1 = new int[scan.nextInt()];
        int[] finalTab = new int[tab1.length - 1];

        //On rempli le tableau
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("Valeur " + (i + 1));
            tab1[i] = scan.nextInt();
        }

        System.out.println("Valeur à supprimer : ");
        deletedValue = scan.nextInt();

        //On supprime la valeur, on décale, on réduit la taille
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] == deletedValue) {
                tab1[i] = tab1[i + 1];
                //décalage
                for (int j = i + 1; j < tab1.length - 1; j++) {
                    temp = tab1[j + 1];
                    tab1[j] = temp;
                }
                //réduction de la taille
                for (int j = 0; j < finalTab.length; j++) {
                    finalTab[j] = tab1[j];
                }
            }
        }

        System.out.println("valeurs du tableau final : ");
        for (int i = 0; i <= finalTab.length - 1; i++) {
            System.out.println(finalTab[i]);
        }

    }

}
