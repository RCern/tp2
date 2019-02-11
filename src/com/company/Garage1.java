package com.company;

import java.util.*;

public class Garage1 implements Iterable<Vehicule> {

    private List<Vehicule> list = new ArrayList<Vehicule>();

    public void add(Vehicule v) {
        list.add(v);
    }

    public void triNoImmatriculion() {
        Collections.sort(this.list);
    }

    public void triCompteur() {
        triCompteurClass tri = new triCompteurClass();
        Collections.sort(this.list, tri);
    }

    public void faireLePleinAll(){
       for(Vehicule v: list){
           v.faireLePlein();
       }
    }

    public void resetPartielAll(){
        for(Vehicule v:list){
            v.getCompteur().resetPartiel();
        }
    }


    @Override
    public String toString() {
        return "[" +
                "list=" + list;
    }

    @Override
    public Iterator<Vehicule> iterator() {
        return list.iterator();
    }
}