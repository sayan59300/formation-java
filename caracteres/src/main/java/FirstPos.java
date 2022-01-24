
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sayan593
 */
public class FirstPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer la chaîne de caractère : ");
        String chaine = scan.next();
        System.out.println("Caractère à rechercher : ");
        String lettre = scan.next();
        if (chaine.contains(lettre)) {
            System.out.println("Le caractère est en position " + (chaine.indexOf(lettre) + 1));
        } else {
            System.out.println("Caractère absent de la chaîne");
        }
    }

}
