package com.garage;

public class Moto extends Vehicule {
    private int cylindree;

    // Constructeur
    public Moto(String marque, String modele, int annee, int cylindree) {
        super(marque, modele, annee); // Appel du constructeur de la super-classe
        this.cylindree = cylindree;
    }

    // Redefinition de la méthode afficherDetails
    public void afficherDetails() {
        super.afficherDetails(); // Affiche les détails de base
        System.out.println("Cylindrée: " + cylindree + " cm3");
    }
}
