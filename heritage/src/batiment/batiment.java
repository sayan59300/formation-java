/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batiment;

/**
 *
 * @author sayan593
 */
public class Batiment {

    private final String adresse;
    private final double surfaceHabitable;

    public Batiment(String adresse, double surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    @Override
    public String toString() {
        return "\nAdresse : " + adresse + "\nSurface habitable : " + surfaceHabitable;
    }

}
