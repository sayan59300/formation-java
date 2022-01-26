/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voiture;

/**
 *
 * @author Sayan593
 */
public class AppVoiture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roue roue1 = new Roue(1, 205);
        Roue roue2 = new Roue(2, 205);
        Roue roue3 = new Roue(3, 205);
        Roue roue4 = new Roue(4, 205);

        Voiture voiture = new Voiture(55, "Peugeot", "Noire");
        voiture
                .ajoutRoue(roue1, 1)
                .ajoutRoue(roue2, 2)
                .ajoutRoue(roue3, 3)
                .ajoutRoue(roue4, 4);

        System.out.println("Etat de la roue 1 : " + roue1.getEtat());

    }

}
