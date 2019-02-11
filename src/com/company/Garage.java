package com.company;

import java.util.*;

public class Garage implements Collection{



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
        CompteurComparator tri = new CompteurComparator();
        Collections.sort(this.list,tri);
    }

    @Override
    public String toString() {
        return "[" +
                "list=" + list ;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    /*
    @Override
    public String toString() {
        return "[" +
                "set=" + set ;
    }*/

}
