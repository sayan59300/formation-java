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
        personne.setAge(44);

        System.out.println(personne.toString());

        System.out.println("-----------------------");

        Personne personne2 = new Personne("Philippe", "Edouart", 46);

        System.out.println(personne2.toString());

        System.out.println("-----------------------");

        Personne personne3 = new Personne();

        personne3.setNom("Hollande");
        personne3.setPrenom("François");
        personne3.setAge(67);

        System.out.println(personne3.toString());

        System.out.println("-----------------------");

        Personne[] liste = {personne, personne2, personne3};

        System.out.println("""
                            Affichage tableau
                            ------------------
                            ------------------""");
        for (int i = 0; i < liste.length; i++) {
            System.out.println(liste[i].toString());
            System.out.println("-----------------------");
        }
    }

}
