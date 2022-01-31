/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package batiment;

import java.util.ArrayList;

/**
 *
 * @author sayan593
 */
public class TestBatiment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Batiment batiment = new Batiment("23 rue du pneu", 230);
        Batiment maison = new Maison("25 rue du pif", 100, 6, 800);
        Batiment immeuble = new Immeuble("40 avenue Staline", 4000, 40);
        Batiment batiment2 = new Batiment("26 rue du pneu", 430);
        Batiment maison2 = new Maison("35 rue du pif", 200, 10, 1000);
        Batiment immeuble2 = new Immeuble("60 avenue Staline", 8000, 80);
        Batiment batiment3 = new Batiment("33 rue du pneu", 2300);
        Batiment maison3 = new Maison("73 rue du pif", 80, 4, 200);
        Batiment immeuble3 = new Immeuble("98 avenue Staline", 20000, 100);
        Batiment batiment4 = new Batiment("123 rue du pneu", 2350);

        ArrayList<Batiment> liste = new ArrayList<Batiment>();

        liste.add(batiment);
        liste.add(maison);
        liste.add(immeuble);
        liste.add(batiment2);
        liste.add(maison2);
        liste.add(immeuble2);
        liste.add(batiment3);
        liste.add(maison3);
        liste.add(immeuble3);
        liste.add(batiment4);

        for (Batiment batiment1 : liste) {
            System.out.println(batiment1);
        }

    }

}
