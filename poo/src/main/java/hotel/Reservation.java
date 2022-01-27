/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Date;

/**
 *
 * @author Sayan593
 */
public class Reservation {

    private Chambre chambre;
    private Client client;
    private Date date;

    public Reservation(Chambre chambre, Client client, Date date) {
        this.chambre = chambre;
        this.client = client;
        this.date = date;
    }

    public Chambre getChambre() {
        return chambre;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

}
