
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * Enrichir le tableau avec les données suivantes : Pierre 24 ans, Rémi 25 ans,
 * Joe 33 ans, Eric 28 ans et Toto 18 ans.
 *
 * @author sayan593
 */
public class ExoTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TestPersonne liste = new TestPersonne();
        System.out.println(liste.toString());

        System.out.println("Switch Toto pour Marie");
        for (int i = 0; i < liste.getPersonnes().length; i++) {
            if (liste.getPersonnes()[i] != null && liste.getPersonnes()[i].getPrenom().equals("Toto")) {
                liste.getPersonnes()[i].setPrenom("Marie");
            }
        }
        System.out.println(liste.toString());

        System.out.println("Recherche nom : ");
        liste.search(scan.next());
    }

}
