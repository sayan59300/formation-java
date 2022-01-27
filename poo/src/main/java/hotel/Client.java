/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class Client {

    private String nom;
    private static String[] typesClient = {"Personne", "Groupe", "Société"};
    private int type = 0;

    public Client(String nom, int type) {
        this.nom = nom;
        this.type = type - 1;
    }

    public void setType(int type) {
        this.type = type - 1;
    }

    public String getType() {
        return typesClient[type];
    }

    /**
     * retourne la liste des types de clients
     *
     * @return
     */
    public static String getTypesClient() {
        String liste = "Types de client : \n";
        for (int i = 0; i < typesClient.length; i++) {
            liste += i + 1 + " : " + typesClient[i] + "\n";
        }
        return liste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Nom = " + nom + ", type = " + typesClient[type];
    }

}
