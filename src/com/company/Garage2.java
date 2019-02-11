package com.company;

import java.util.*;

public class Garage2 implements Iterable<Vehicule>{

    private Set<Vehicule> set = new TreeSet<>();

    public Garage2(CompteurComparator CompteurComparator) {

    }
    public Garage2(){

    }

    public void add(Vehicule v){
        set.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triNoImmatriculion(){
        Vehicule[] arr =  set.toArray(new Vehicule[set.size()]);
        Arrays.sort(arr);
        Set<Vehicule> myset = new TreeSet<Vehicule>(Arrays.asList(arr));
        set = myset;
    }
    public void triCompteur(){
        CompteurComparator tri = new CompteurComparator();
        Vehicule[] arr =  set.toArray(new Vehicule[set.size()]);
        Arrays.sort(arr,tri);
        Set<Vehicule> myset = new TreeSet<Vehicule>(Arrays.asList(arr));
        set = myset;
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

    public void faireLePleinAll(){
        for(Vehicule v: set){
            v.faireLePlein();
        }
    }

    public void resetPartielAll(){
        for(Vehicule v: set){
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
