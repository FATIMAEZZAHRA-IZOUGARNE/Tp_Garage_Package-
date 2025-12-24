package com.garage;

public class GarageTest {
    public static void main(String[] args) {
        // Creation d'une voiture
        Voiture voiture = new Voiture("Peugeot", "208", 2021, 5);

        // Creation d'une moto
        Moto moto = new Moto("Yamaha", "MT-07", 2020, 689);

        // Affichage des details (polymorphisme)
        System.out.println("Details de la voiture:");
        voiture.afficherDetails();

        System.out.println("\nDétails de la moto:");
        moto.afficherDetails();
    }
}
