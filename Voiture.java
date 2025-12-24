package com.garage;

public class Voiture extends Vehicule {
    // Attribut specifique
    private int nombreDePortes;

    // Constructeur
    public Voiture(String marque, String modele, int annee, int nombreDePortes) {
        super(marque, modele, annee); // Appel du constructeur de la super-classe
        this.nombreDePortes = nombreDePortes;
    }

    // Redéfinition de la méthode afficherDetails
    @Override
    public void afficherDetails() {
        super.afficherDetails(); // Affiche les détails de base
        System.out.println("Nombre de portes: " + nombreDePortes);
    }
}
