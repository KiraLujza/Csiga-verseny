package main;

import java.util.Random;

public class Csiga {

    Random RND = new Random();

    private String szin;
    private String szinkód;
    private int sebesseg;
    private final String TAV = "-";
    private final String GYTAV = "=";
    private boolean gyors;

    public Csiga(String szin) {
        this.szin = szin;
        this.gyors = false;
    }
    
    public int SebessegSorsolas(){
        this.sebesseg = RND.nextInt(4);
        return sebesseg;
    }

    public String getSzinKód() {
        return szinkód;
    }
    
    public void setSzinkód(String szinkód){
        this.szinkód = szinkód;
    }
    public void setGyors(){
         this.gyors = true;
    }
    
    public String getTav(){
        return this.TAV;
    }
    
    public String getGyTav(){
        return this.GYTAV;
    }
}
