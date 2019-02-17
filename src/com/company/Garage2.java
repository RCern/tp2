package com.company;

import java.util.*;

public class Garage2 implements Iterable<Vehicule>{

    private Set<Vehicule> set;
    CompteurComparator comparator;

    public Garage2(CompteurComparator CompteurComparator) {
            this.comparator = CompteurComparator;
            set = new TreeSet<Vehicule>(CompteurComparator);
    }
    public Garage2(){
            set = new TreeSet<Vehicule>();
            comparator = new CompteurComparator();
    }

    public void add(Vehicule v){
        set.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triNoImmatriculion(){
        CompteurComparator2 comparator2 = null;
        Set<Vehicule> newSetVehicule = new TreeSet<>(comparator2);
        newSetVehicule.addAll(set);
        set = newSetVehicule;
    }
    public void triCompteur(){
        Set<Vehicule> newSetVehicule = new TreeSet<>(comparator);
        newSetVehicule.addAll(set);
        set = newSetVehicule;

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
