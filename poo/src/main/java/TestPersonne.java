/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sayan593
 */
public class TestPersonne {

    private final Personne[] personnes = new Personne[10];

    public TestPersonne() {
        this.personnes[0] = new Personne("Belmarre", "Pierre", 24);
        this.personnes[1] = new Personne("Gaillard", "Rémi", 25);
        this.personnes[2] = new Personne("Doe", "Joe", 33);
        this.personnes[3] = new Personne("Cantona", "Eric", 28);
        this.personnes[4] = new Personne("Tutu", "Toto", 18);
    }

    public Personne[] getPersonnes() {
        return personnes;
    }

    /**
     * REcherche une personne dans le tableau
     *
     * @param nom
     */
    public void search(String nom) {
        String resultat = "Personne non trouvée";
        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] != null && this.personnes[i].getNom().toLowerCase().equals(nom.toLowerCase())) {
                resultat = this.personnes[i].toString();
            }
        }
        System.out.println(resultat);
    }

    @Override
    public String toString() {
        String listing = "";
        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] != null) {
                listing += this.personnes[i].toString() + "\n---\n";
            }
        }
        return listing;
    }

}
