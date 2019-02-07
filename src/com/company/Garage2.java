package com.company;

import java.util.*;

public class Garage2 implements Iterable<Vehicule>{

    private Set<Vehicule> set = new TreeSet<>();

    public void add(Vehicule v){
        set.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triImmatriculation(){
        Vehicule[] arr =  set.toArray(new Vehicule[set.size()]);
        Arrays.sort(arr);
        Set<Vehicule> myset = new TreeSet<Vehicule>(Arrays.asList(arr));
        set = myset;
    }
    public void triCompteur(){
        triCompteurClass tri = new triCompteurClass();
        Vehicule[] arr =  set.toArray(new Vehicule[set.size()]);
        Arrays.sort(arr,tri);
        Set<Vehicule> myset = new TreeSet<Vehicule>(Arrays.asList(arr));
        set = myset;
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
