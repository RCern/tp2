package com.company;

public class Compteur {
    private double totalisateur = 0;
    private double partiel = 0;
    /* a is MaxPartial*/
    private static final int  a = 1000;

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

    public void add(double partiel,double totalisateur){
        this.partiel += partiel;
        this.totalisateur += totalisateur;
        if(this.partiel == a){
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
