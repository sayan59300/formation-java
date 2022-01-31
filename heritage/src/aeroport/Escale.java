/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeroport;

/**
 *
 * @author sayan593
 */
public class Escale {

    private final int numero;
    private final Aeroport aeroport;

    public Escale(int numero, Aeroport aeroport) {
        this.numero = numero;
        this.aeroport = aeroport;
    }

    public int getNumero() {
        return numero;
    }

    public Aeroport getAeroport() {
        return aeroport;
    }

}
