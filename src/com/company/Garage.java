package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Garage{



    private ArrayList<Vehicule> list = new ArrayList();

    public void add(Vehicule v){
        list.add(v);
    }

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

}
