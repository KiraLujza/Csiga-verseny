package main;

import java.util.Random;
import java.util.Scanner;

public class Verseny {

    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    Csiga kek;
    Csiga piros;
    Csiga zold;

    public Verseny() {
        kek = new Csiga("kék");
        piros = new Csiga("piros");
        zold = new Csiga("zöld");

    }

    public void gyorsitas() {
        int sorsolas = rnd.nextInt(101) + 1;
        if (sorsolas >= 1 && sorsolas <= 20) {
            kek.setGyors();
        } else if (sorsolas >= 21 && sorsolas <= 40) {
            piros.setGyors();
        } else if (sorsolas >= 41 && sorsolas <= 60) {
            zold.setGyors();
        }
    }

    public String fogadas() {
        System.out.println("Kire fogad?:");
        String fogadott = sc.nextLine();
        return fogadott;
    }

    public String nyertes() {
        String gyoztes = "";
        if (kek.getMegtettTav() > piros.getMegtettTav() && kek.getMegtettTav() > zold.getMegtettTav()) {
            gyoztes = "kék";
        } else if (piros.getMegtettTav() > kek.getMegtettTav() && piros.getMegtettTav() > zold.getMegtettTav()) {
            gyoztes = "piros";
        } else if (zold.getMegtettTav() > piros.getMegtettTav() && zold.getMegtettTav() > kek.getMegtettTav()) {
            gyoztes = "kék";
        }
        return gyoztes;
    }

    public String fogadasEredmenye() {
        String eredmenyHirdetes = "";
        if (this.nyertes().equals(this.fogadas())) {
            eredmenyHirdetes = "Gratulálunk, a %s nyert, így Ön megnyerte a fogadást!".formatted(this.nyertes());
        } else {
            eredmenyHirdetes = "Sajnáljuk, a %s nyert, Ön elvesztette a fogadást.".formatted(this.nyertes());
        }
        return eredmenyHirdetes;
    }

}
