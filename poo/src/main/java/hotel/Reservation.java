/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class Reservation {

    private Chambre chambre;
    private Client client;

    public Reservation(Chambre chambre, Client client) {
        this.chambre = chambre;
        this.client = client;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public Client getClient() {
        return client;
    }
}
