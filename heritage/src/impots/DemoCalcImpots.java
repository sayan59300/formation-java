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
        Habitation[] habitationsMarly = new Habitation[3];
        Habitation[] habitationsValenciennes = new Habitation[3];

        Habitation habitationMarly1 = new HabitationIndividuelle(proprio1, "23 rue du menile 59770 Marly", 100, 8, false);
        Habitation habitationMarly2 = new HabitationProfessionnelle(proprio2, "26 rue du foutoir 59770 Marly", 2000, 60);
        Habitation habitationMarly3 = new HabitationIndividuelle(proprio4, "73 rue du vieux port 59770 Marly", 150, 10, true);
        Habitation habitationValenciennes1 = new HabitationProfessionnelle(proprio2, "26 rue du mermose 59300 Valenciennes", 1000, 37);
        Habitation habitationValenciennes2 = new HabitationProfessionnelle(proprio3, "32 rue du puy 59300 Valenciennes", 500, 15);
        Habitation habitationValenciennes3 = new HabitationIndividuelle(proprio1, "23 rue du cheval fougueux 59770 Marly", 180, 11, true);

        habitationsMarly[0] = habitationMarly1;
        habitationsMarly[1] = habitationMarly2;
        habitationsMarly[2] = habitationMarly3;

        habitationsValenciennes[0] = habitationValenciennes1;
        habitationsValenciennes[1] = habitationValenciennes2;
        habitationsValenciennes[2] = habitationValenciennes3;

        Commune communeMarly = new Commune(59770, "Marly", habitationsMarly);
        Commune communeValenciennes = new Commune(59300, "Valenciennes", habitationsValenciennes);

        System.out.println("Impots locaux de la commune de " + communeMarly.getNom() + " : " + communeMarly.calculImpotsLocaux() + " €");
        System.out.println("Impots locaux de la commune de " + communeValenciennes.getNom() + " : " + communeValenciennes.calculImpotsLocaux() + " €");
    }

}
