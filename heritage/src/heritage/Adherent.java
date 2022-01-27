/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heritage;

/**
 *
 * @author Sayan593
 */
public class Adherent extends Personne {

    private final int numAdherent;

    public Adherent(int numAdherent, String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String afficher() {
        return super.afficher() + "\nNuméro adhérent : " + numAdherent;
    }
}
