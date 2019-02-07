package com.company;

import java.util.*;

public class Garage2{

    private SortedSet<Vehicule> set = new TreeSet<>();

    public void add(Vehicule v){
        set.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triImmatriculation(){
        Collections.sort(this.set);
    }
    public void triCompteur(){
        triCompteurClass tri = new triCompteurClass();
        Collections.sort(this.set,tri);
    }

    @Override
    public String toString() {
        return "[" +
                "set=" + set ;
    }

}
