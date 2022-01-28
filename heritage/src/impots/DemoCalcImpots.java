/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class DemoCalcImpots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proprietaire proprio1 = new Proprietaire("Buffart", "Nicolas", 40, 1);
        Proprietaire proprio2 = new Proprietaire("Bay", "Mickael", 56, 2);
        Proprietaire proprio3 = new Proprietaire("Abrams", "JJ", 47, 3);
        Proprietaire proprio4 = new Proprietaire("Jackson", "Mickael", 70, 4);

        System.out.println(proprio1);
        System.out.println(proprio2);
        System.out.println(proprio3);
        System.out.println(proprio4);

    }

}
