package com.company;


import java.util.Comparator;

public class CompteurComparator2 implements Comparator<Vehicule> {
    @Override
    public int compare(Vehicule a,Vehicule b) {
        return (a.getNoImmatriculation()-b.getNoImmatriculation());
    }
}
