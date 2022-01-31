/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batiment;

/**
 *
 * @author sayan593
 */
public class Maison extends Batiment {

    private final int nbPieces;
    private double surfaceJardin;

    public Maison(String adresse, double surfaceHabitable, int nbPieces, double surfaceJardin) {
        super(adresse, surfaceHabitable);
        this.nbPieces = nbPieces;
        this.surfaceJardin = surfaceJardin;
    }

    @Override
    public String toString() {
        return super.toString() + """

               Maison
                                  """
                + "Nombre de pièce(s) : " + nbPieces + "\nSurface du jardin : " + surfaceJardin;
    }

}
