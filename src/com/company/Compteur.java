package com.company;

public class Compteur {
    private double totalisateur = 0;
    private double partiel = 0;
    private static final int MaxPartiel = 1000;

    public Compteur(){

    }

    public double getTotalisateur() {
        return totalisateur;
    }

    public void setTotalisateur(int totalisateur) {
        this.totalisateur = totalisateur;
    }

    public double getPartiel() {
        return partiel;
    }

    public void setPartiel(int partiel) {
        this.partiel = partiel;
    }

    public void resetPartiel(){
        this.partiel = 0;
    }

    public void add(double partiel){
        this.partiel += partiel;
        this.totalisateur += partiel;
        if(this.partiel == MaxPartiel){
            this.resetPartiel();
        }
    }


    @Override
    public String toString() {
        return "compteur = " +
                "[Totalisateur=" + totalisateur +
                "| Partiel = " + partiel +
                "];";
    }
}
