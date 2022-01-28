/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impots;

/**
 *
 * @author Sayan593
 */
public class HabitationIndividuelle extends Habitation {

    private final int identifiant;

    public HabitationIndividuelle(String proprietaire, String adresse, double surface, int identifiant) {
        super(proprietaire, adresse, surface);
        this.identifiant = identifiant;
    }

}
