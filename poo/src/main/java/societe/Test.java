/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package societe;

/**
 *
 * @author sayan593
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Societe societe = new Societe("IBM beurk");
        Societe societe2 = new Societe("HP");

        Employe employe = new Employe("Toto", societe);
        employe.setSalaire(1000);
        Employe employe2 = new Employe("Titi", societe2);
        employe2.setSalaire(1000);
        Employe employe3 = new Employe("Tutu", societe2);
        employe3.setSalaire(1000);

        societe.embaucher(employe);
        societe2.embaucher(employe2);
        societe2.embaucher(employe3);

        societe.augmentationGenerale(10);
        societe2.augmentationGenerale(15);

        System.out.println(employe);
        System.out.println(employe2);
        System.out.println(employe.estCollegue(employe2));

        System.out.println("***************");

        System.out.println("Société HP");
        System.out.println(societe2.listeEmployes());
        System.out.println("Masse salariale : " + societe2.getMasseSalariale());

        System.out.println("""
                           ------------------
                           Liste des sociétés
                           ------------------
                           """);
        System.out.println(societe);
        System.out.println(societe2);
        System.out.println("***************");
    }

}
