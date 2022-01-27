/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concours;

/**
 *
 * @author Sayan593
 */
public class Coucours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Candidat candidat1 = new Candidat("Staline", "Joseph", 14565, 65);
        Candidat candidat2 = new Fonctionnaire("Philippe", "Edouard", 17349, 49, 25000);

        Candidat[] candidats = {candidat1, candidat2};
        for (int i = 0; i < candidats.length; i++) {
            System.out.println(candidats[i].afficher());
        }
    }
}
