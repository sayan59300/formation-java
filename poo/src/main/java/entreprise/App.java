/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entreprise;

/**
 *
 * @author sayan593
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Entreprise entreprise1 = new Entreprise();
        entreprise1.setNom("Total");
        entreprise1.setSecteur("Pollution");

        Employe employe = new Employe();
        employe.setId(1, entreprise1.getNom());
        employe.setNom("Brochard");
        employe.setPrenom("Maurice");
        employe.setSexe("Homme");
        employe.setSalaire(2000);

        Employe employe2 = new Employe();
        employe2.setId(2, entreprise1.getNom());
        employe2.setNom("Collard");
        employe2.setPrenom("Gilbert");
        employe2.setSexe("Homme");
        employe2.setSalaire(4000);

        Employe employe3 = new Employe();
        employe3.setId(3, entreprise1.getNom());
        employe3.setNom("Carembeuh");
        employe3.setPrenom("Adriana");
        employe3.setSexe("Femme");
        employe3.setSalaire(3000);

        entreprise1.setEmployes(employe);
        entreprise1.setEmployes(employe2);
        entreprise1.setEmployes(employe3);

        System.out.println(entreprise1.toString());
        System.out.println(entreprise1.getEmployes());

        System.out.println("----------------------------\n");

        Entreprise entreprise2 = new Entreprise();
        entreprise2.setNom("France");
        entreprise2.setSecteur("Vache à lait");
        Employe employe4 = new Employe();
        employe4.setId(1, entreprise2.getNom());
        employe4.setNom("Hollande");
        employe4.setPrenom("François");
        employe4.setSexe("Homme");
        employe4.setSalaire(2000000);
        Employe employe5 = new Employe();
        employe5.setId(2, entreprise2.getNom());
        employe5.setNom("Sarkozy");
        employe5.setPrenom("Nicolas");
        employe5.setSexe("Homme");
        employe5.setSalaire(3000000);
        entreprise2.setEmployes(employe4);
        entreprise2.setEmployes(employe5);

        System.out.println(entreprise2.toString());
        System.out.println(entreprise2.getEmployes());

        System.out.println("------------Suppression employé--------\n");

        entreprise2.delete("Sarkozy");

        System.out.println(entreprise2.toString());
        System.out.println(entreprise2.getEmployes());

        System.out.println("------------Recherche employé--------\n");

        entreprise1.search("Carembeuh");
        entreprise1.search("Camembert");
    }
}
