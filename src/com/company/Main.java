package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicule x = new Vehicule(2);

        System.out.println(x.toString());
        x.faireLePlein();
        System.out.println(x.toString());
        x.rouler(100);
        System.out.println(x.toString());
        x.mettreDeLessence(20);
        System.out.println(x.toString());
        Vehicule  y = new Vehicule(2);
        System.out.println(y.toString());
        System.out.println(x.compareTo(y));

        Garage g = new Garage();
        g.add(x);
        g.add(y);
        System.out.println(g);
    }
}
