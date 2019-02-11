package com.company;

import java.util.Comparator;

public class CompteurComparator implements Comparator<Vehicule> {

    @Override
    public int compare(Vehicule a,Vehicule b) {
        return (int) (a.getCompteur().getTotalisateur() - b.getCompteur().getTotalisateur());
    }
}
