
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Voyelles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer la chaîne de caractère : ");
        String chaine = scan.next();
        int voyelles = 0;
        //on parcourt la chaine
        for (int i = 0; i < chaine.length(); i++) {
            //lit le caractère courant
            char caractere = chaine.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' || caractere == 'y') {
                voyelles++;
            }
        }
        System.out.println("Nombre de voyelles : " + voyelles);
    }

}
