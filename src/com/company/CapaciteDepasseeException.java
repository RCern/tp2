package com.company;

public class CapaciteDepasseeException extends Exception {

    double quantite;

    public CapaciteDepasseeException(double quantite) {
        this.quantite = quantite;
    }

    public String getMessage(){
        return "Votre reservoir a une capacite insuffisante pour mettre " + quantite + " d'essence";
    }
}
