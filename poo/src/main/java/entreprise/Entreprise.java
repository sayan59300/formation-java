/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entreprise;

/**
 *
 * @author sayan593
 */
public class Entreprise {

    private String nom;
    private String secteur;
    private Employe[] employes = new Employe[1];
    private int nombreEmployes;
    Employe temp;

    @Override
    public String toString() {
        return "Entreprise "
                + nom + "\nSecteur = "
                + secteur + "\nNombre d'employé(s) = "
                + nombreEmployes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    /**
     * Retourne la liste des employés
     *
     * @return
     */
    public String getEmployes() {
        String liste = "";
        for (int i = 0; i < this.employes.length; i++) {
            liste += this.employes[i] + "\n";
        }
        return liste;
    }

    /**
     * Ajoute un employé
     *
     * @param employes
     */
    public void setEmployes(Employe employes) {
        if (nombreEmployes == 0) {
            this.employes[0] = employes;
            nombreEmployes++;
        } else {
            Employe[] newlisteEmployes = new Employe[this.employes.length + 1];
            System.arraycopy(this.employes, 0, newlisteEmployes, 0, this.employes.length);
            newlisteEmployes[newlisteEmployes.length - 1] = employes;
            this.employes = new Employe[newlisteEmployes.length];
            System.arraycopy(newlisteEmployes, 0, this.employes, 0, newlisteEmployes.length);
            nombreEmployes++;
        }
    }

    /**
     * Ajoute un employé
     *
     * @param nom
     */
    public void editEmployes(String nom) {
        //rechercher l'employer
        //sauvegarder sa position
        //demander les nouvelles valeurs
        //enregistrer les modifications dans l'employé à la position sauvegardéé
    }

    /**
     * Supprime un employé
     *
     * @param nom
     */
    public void delete(String nom) {
        for (int i = 0; i < this.employes.length; i++) {
            if (this.employes[i].getNom().equals(nom)) {
                this.employes[i] = null;
                nombreEmployes--;
                //décalage
                for (int j = i + 1; j < this.employes.length - 1; j++) {
                    temp = this.employes[j + 1];
                    this.employes[j] = temp;
                }
                Employe[] inter = new Employe[this.employes.length - 1];
                //réduction de la taille
                System.arraycopy(this.employes, 0, inter, 0, inter.length);
                this.employes = new Employe[inter.length];
                System.arraycopy(inter, 0, this.employes, 0, inter.length);
            }
        }
    }

    /**
     * Recherche un employé
     *
     * @param nom
     */
    public void search(String nom) {
        boolean trouve = false;
        for (int i = 0; i < this.employes.length; i++) {
            if (this.employes[i].getNom().equals(nom)) {
                trouve = true;
                System.out.println(
                        "---Employé trouvé---"
                        + this.employes[i]
                );
            }
        }
        if (!trouve) {
            System.out.println("\nEmployé {" + nom + "} non trouvé");
        }
    }

}
