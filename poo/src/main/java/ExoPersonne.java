/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sayan593
 */
public class ExoPersonne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personne personne = new Personne();

        personne.setNom("Macron");
        personne.setPrenom("Emmanuel");
        personne.setNom(44);

        System.out.println("Nom : " + personne.getNom());
        System.out.println("Prénom : " + personne.getPrenom());
        System.out.println("Age : " + personne.getAge() + " an(s)");

        System.out.println("-----------------------");

        Personne personne2 = new Personne("Philippe", "Edouart", 46);

        System.out.println("Nom : " + personne2.getNom());
        System.out.println("Prénom : " + personne2.getPrenom());
        System.out.println("Age : " + personne2.getAge() + " an(s)");

        System.out.println("-----------------------");
    }

}
