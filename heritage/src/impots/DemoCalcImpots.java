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
        Habitation habitation2 = new HabitationProfessionnelle(proprio2, "26 rue du mermose 59300 Valenciennes", 100, 37);

        System.out.println(habitation2.affiche());
    }

}
