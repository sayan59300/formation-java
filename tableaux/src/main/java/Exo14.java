/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Exo14 {

    /**
     * range le tableau en mettant les nombres négatifs au début et les positifs
     * à la fin
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nombres = {1, -4, 6, 8, -12, 14, -9, 27, 6, 5};
        int[] nombresTries = new int[10];
        int positionneg = 0;
        int positionpos = 9;

        // tri des valeurs
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] < 0) {
                nombresTries[positionneg] = nombres[i];
                positionneg++;
            } else {
                nombresTries[positionpos] = nombres[i];
                positionpos--;
            }
        }

        //affichage
        for (int i = 0; i < nombresTries.length; i++) {
            System.out.println(nombresTries[i]);
        }

    }

}
