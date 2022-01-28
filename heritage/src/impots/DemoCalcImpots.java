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

        Habitation habitation1 = new HabitationIndividuelle(proprio1, "23 rue du menile 59770 Marly", 100, 8, false);
        Habitation habitation2 = new HabitationProfessionnelle(proprio2, "26 rue du mermose 59300 Valenciennes", 1000, 37);
        Habitation habitation3 = new HabitationProfessionnelle(proprio3, "32 rue du puy 59300 Valenciennes", 500, 15);
        Habitation habitation4 = new HabitationIndividuelle(proprio4, "73 rue du vieux port 59770 Marly", 150, 10, true);

        System.out.println(habitation3.impot());
    }

}
