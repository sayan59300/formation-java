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

        System.out.println("Nom : " + personne.getNom());
        System.out.println("Prénom : " + personne.getPrenom());
        System.out.println("Age : " + personne.getAge() + " an(s)");

        System.out.println("-----------------------");

        Personne personne2 = new Personne("Philippe", "Edouart", 46);

        System.out.println("Nom : " + personne2.getNom());
        System.out.println("Prénom : " + personne2.getPrenom());
        System.out.println("Age : " + personne2.getAge() + " an(s)");

        System.out.println("-----------------------");

        TestPersonne personne3 = new TestPersonne();

        personne3.setNom("Hollade");
        personne3.setPrenom("François");
        personne3.setAge(75);
        personne3.setPoids(90);

        System.out.println("Nom : " + personne3.getNom());
        System.out.println("Prénom : " + personne3.getPrenom());
        System.out.println("Age : " + personne3.getAge() + " an(s)");
        System.out.println("Poids : " + personne3.getPoids() + " kg");

        System.out.println("-----------------------");

        Personne[] liste = {personne, personne2, personne3};

        System.out.println("""
                            Affichage tableau
                            ------------------
                            ------------------""");
        for (int i = 0; i < liste.length; i++) {
            System.out.println("Nom : " + liste[i].getNom());
            System.out.println("Prénom : " + liste[i].getPrenom());
            System.out.println("Age : " + liste[i].getAge() + " an(s)");

            System.out.println("-----------------------");
        }
    }

}
