/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

/**
 *
 * @author Sayan593
 */
public class AppHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = new Client("Gérard");

        System.out.println(client);

        System.out.println(client.getTypeClient());
    }

}
