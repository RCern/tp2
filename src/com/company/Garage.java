package com.company;

import java.util.ArrayList;

public class Garage{



    private ArrayList<Vehicule> list = new ArrayList();

    public void add(Vehicule v){
        list.add(v);
    }

    public Garage triImmatriculation(){
        return list.sort();
    }

    @Override
    public String toString() {
        return "[" +
                "list=" + list ;
    }

}
