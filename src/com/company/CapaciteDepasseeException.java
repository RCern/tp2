package com.company;

public class CapaciteDepasseeException extends Exception {

    int quantite;

    public CapaciteDepasseeException(int quantite) {
        quantite = quantite;
    }

    public String getMessage(){
        return "Votre reservoir a une capacite insuffisante pour mettre " + quantite + " d'essence";
    }
}
