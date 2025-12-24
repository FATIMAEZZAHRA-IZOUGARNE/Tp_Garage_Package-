package com.garage;

public class Vehicule {
    // Attributs proteges pour etre accessibles dans les classes filles
    protected String marque;
    protected String modele;
    protected int annee;

    // Constructeur
    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    // Méthode pour afficher les détails
    public void afficherDetails() {
        System.out.println("Marque: " + marque + ", Modele: " + modele + ", Annee: " + annee);
    }
}
