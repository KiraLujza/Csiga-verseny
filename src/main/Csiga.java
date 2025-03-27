package main;

import java.util.Random;

public class Csiga {

    Random RND = new Random();

    private String szin;
    private String szinkód;
    private int sebesseg;
    private int megtettTav;
    private final String TAV = "-";
    private final String GYTAV = "=";
    private boolean gyors;
    private String haladas;

    public Csiga(String szin) {
        this.szin = szin;
        this.gyors = false;
        this.megtettTav = megtettTav;
        this.haladas = haladas;
    }

    public int SebessegSorsolas() {
        this.sebesseg = RND.nextInt(4);
        return sebesseg;
    }

    public String getSzinKód() {
        return szinkód;
    }

    public void setSzinkód(String szinkód) {
        this.szinkód = szinkód;
    }

    public void setGyors() {
        this.gyors = true;
    }

    public String getTav() {
        return this.TAV;
    }

    public String getGyTav() {
        return this.GYTAV;
    }

    public void haladas() {
        String aktualis = "";

        if (this.gyors) {
            for (int i = 0; i < this.SebessegSorsolas() * 2; i++) {
                aktualis += GYTAV;
            }
        } else if (this.gyors == false) {
            for (int i = 0; i < this.SebessegSorsolas(); i++) {
                aktualis += TAV;
            }
        }
        this.haladas += aktualis;
    }

    public void megtett() {
        if (this.gyors) {
            this.megtettTav += this.SebessegSorsolas() * 2;
        } else {
            this.megtettTav += this.SebessegSorsolas();
        }

    }
}
