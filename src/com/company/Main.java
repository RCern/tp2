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
        g.addToSet(x);
        g.addToSet(y);
        Vehicule  z = new Vehicule(1);
        z.faireLePlein();
        Vehicule  a = new Vehicule(1);
        a.faireLePlein();
        Vehicule  b = new Vehicule(1);
        b.faireLePlein();
        z.rouler(500);
        g.add(z);

        g.add(a);
        a.rouler(230);
        g.add(b);
        b.rouler(56);
        System.out.println(g);
        g.triCompteur();
        System.out.println(g);
        g.triImmatriculation();
        System.out.println(g);
    }
}
