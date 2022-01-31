/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batiment;

/**
 *
 * @author sayan593
 */
public class Immeuble extends Batiment {

    private final int nbAppart;

    public Immeuble(String adresse, double surfaceHabitable, int nbAppart) {
        super(adresse, surfaceHabitable);
        this.nbAppart = nbAppart;
    }

    @Override
    public String toString() {
        return super.toString() + """

               Immeuble
                                  """
                + "Nombre d'appartement : " + nbAppart;
    }

}
