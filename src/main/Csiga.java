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
        this.megtettTav = 0;
        this.haladas = "";
    }

    public void SebessegSorsolas() {
        this.sebesseg = RND.nextInt(4);

    }

    public String getSzinKód() {
        return szinkód;
    }

    public int getMegtettTav() {
        return this.megtettTav;
    }

    public void setSzinkód(String szinkód) {
        this.szinkód = szinkód;
    }

    public void setGyors(boolean gyorsabb) {
        this.gyors = gyorsabb;
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
            for (int i = 0; i < this.getSebesseg() * 2; i++) {
                aktualis += GYTAV;
            }
        } else {
            for (int i = 0; i < this.getSebesseg(); i++) {
                aktualis += TAV;
            }
        }
        this.haladas += aktualis;
    }

    public String getHaladas() {
        return this.haladas;
    }

    public int getSebesseg() {
        return this.sebesseg;
    }

    public void megtett() {
        if (this.gyors) {
            this.megtettTav += this.getSebesseg() * 2;
        } else {
            this.megtettTav += this.getSebesseg();
        }

    }
}
