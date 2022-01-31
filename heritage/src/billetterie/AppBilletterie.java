/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billetterie;

/**
 *
 * @author sayan593
 */
public class AppBilletterie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalleCinema salle1 = new SalleCinema("Iron man", 20, 7);
        SalleCinema salle2 = new SalleCinema("Eternals", 30, 13);
        SalleCinema salle3 = new SalleCinema("Avengers", 50, 15);

        System.out.println(salle1);

        salle1.vendrePlaces(1, false);

        System.out.println(salle1);

        salle1.vendrePlaces(1, true);

        System.out.println(salle1);

        salle1.vendrePlaces(9, true);

        System.out.println(salle1);

        salle1.vendrePlaces(9, false);

        System.out.println(salle1);

        System.out.println("---------------");
        salle1.vendrePlaces(1, true);
        salle1.vendrePlaces(1, false);

        System.out.println("---------------");
        System.out.println("Chiffres d'affaire : " + salle1.ChiffreAffaire());
    }

}
