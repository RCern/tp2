package com.company;

import java.util.*;

public class Garage{



    private List<Vehicule> list = new ArrayList();
    private Set<Vehicule> set = new TreeSet<>();

    public void add(Vehicule v){
        list.add(v);
    }

    public void addToSet(Vehicule v){set.add(v);}

    public void triImmatriculation(){
        Collections.sort(this.list);
    }
    public void triCompteur(){
        triCompteurClass tri = new triCompteurClass();
        Collections.sort(this.list,tri);
    }

    @Override
    public String toString() {
        return "[" +
                "list=" + list ;
    }
    /*
    @Override
    public String toString() {
        return "[" +
                "set=" + set ;
    }*/

}
