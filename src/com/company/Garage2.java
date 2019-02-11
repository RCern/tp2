package com.company;

import java.util.*;

public class Garage2 implements Iterable<Vehicule>{

    private Set<Vehicule> set;

    public Garage2(CompteurComparator CompteurComparator) {
            set = new TreeSet<Vehicule>(CompteurComparator);
    }
    public Garage2(){
            set = new TreeSet<Vehicule>();
    }

    public void add(Vehicule v){
        set.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triNoImmatriculion(){

    }
    public void triCompteur(){

    }
    public void faireLePleinAll(){
        for(Vehicule v: set){
            v.faireLePlein();
        }
    }

    public void resetPartielAll(){
        for(Vehicule v:set){
            v.getCompteur().resetPartiel();
        }
    }


    @Override
    public String toString() {
        return "[" +
                "set=" + set ;
    }
    @Override
    public Iterator<Vehicule> iterator() {
        return set.iterator();
    }

}
