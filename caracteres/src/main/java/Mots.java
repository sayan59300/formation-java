
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class Mots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une phrase : ");
        String phrase = scan.nextLine();
        int count = 1;

        for (int i = 0; i < phrase.length() - 1; i++) {
            //lit le caractère courant
            char caractere = phrase.charAt(i);
            //lit le caractère suivant
            char suivant = phrase.charAt(i + 1);
            if (caractere == ' ' && suivant != ' ') {
                count++;
            }
        }

        System.out.println("La phrase contient " + count + " mot(s)");
    }

}
