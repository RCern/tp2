package com.company;



public  class Vehicule implements Comparable<Vehicule> {
    private int numero_inm;
    private Compteur comp = new Compteur();
    private static int registre = 0;
    private double capacite = 50.0;
    private double jauge;
    private double consommation;

    public Vehicule(double consommation) {
        registre++;
        this.setNumero_inm(registre);
        this.consommation = consommation;
        this.faireLePlein();
    }

    public int getNoImmatriculation() {
        return numero_inm;
    }

    public void setNumero_inm(int numero_inm) {
        this.numero_inm = numero_inm;
    }

    public void setComp(Compteur comp) {
        this.comp = comp;
    }

    public static int getRegistre() {
        return registre;
    }

    public static void setRegistre(int registre) {
        Vehicule.registre = registre;
    }

    public double getCapacite() {
        return capacite;
    }

    public void setCapacite(double capacite) {
        this.capacite = capacite;
    }

    public double getJauge() {
        return jauge;
    }

    public void setJauge(double jauge) {
        this.jauge = jauge;
    }

    public double getConsommation() {
        return consommation;
    }

    public void setConsommation(double consommation) {
        this.consommation = consommation;
    }

    public Compteur getCompteur() {
        return comp;
    }

    public void mettreDeLessence(double essence) throws CapaciteDepasseeException{
        if((this.jauge+essence) < this.capacite)
             this.jauge += essence;
        else{
            throw new CapaciteDepasseeException();
        }
    }

    public void faireLePlein(){
        this.jauge = this.capacite;
    }

    public double rouler(double kilometres){

        double conso = this.consommation  * (kilometres/100);
        if(this.jauge > conso){
            this.jauge -= conso;
            this.getCompteur().add(kilometres);
        }
        else{
            kilometres = this.jauge/this.consommation * 100;
            this.getCompteur().add(kilometres);
            this.faireLePlein();
        }

        return kilometres;
    }

    @Override
    public String toString() {
        return "Vehicule " + numero_inm + " " +comp.toString() +
                ";"+
                " jauge=" + jauge + "\n";
    }

    @Override
    public int compareTo(Vehicule v) {
        return (this.getNoImmatriculation()-v.getNoImmatriculation());
    }
}
