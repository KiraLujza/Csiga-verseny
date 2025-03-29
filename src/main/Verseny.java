package main;

import java.util.Random;
import java.util.Scanner;

public class Verseny {

    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    Csiga kek;
    Csiga piros;
    Csiga zold;
    private String fogadottCsiga;

    public Verseny() {
        kek = new Csiga("kék");
        piros = new Csiga("piros");
        zold = new Csiga("zöld");
        this.fogadottCsiga = fogadottCsiga;

    }

    public void fogadottCsigaSetter() {
        this.fogadottCsiga = fogadas();
    }

    public void gyorsitas() {
        int sorsolas = rnd.nextInt(101) + 1;
        if (sorsolas >= 1 && sorsolas <= 20) {
            kek.setGyors(true);
        } else if (sorsolas >= 21 && sorsolas <= 40) {
            piros.setGyors(true);
        } else if (sorsolas >= 41 && sorsolas <= 60) {
            zold.setGyors(true);
        }
    }

    public void kor() {
        kek.SebessegSorsolas();
        piros.SebessegSorsolas();
        zold.SebessegSorsolas();

        System.out.println(kek.getSebesseg());
        System.out.println(piros.getSebesseg());

        kek.haladas();
        piros.haladas();
        zold.haladas();

        kek.megtett();
        piros.megtett();
        zold.megtett();
    }

    public String fogadas() {
        System.out.println("Kire fogad?:");
        String fogadott = sc.nextLine();
        return fogadott;
    }

    public void GyorsitoVisszaallit() {
        kek.setGyors(false);
        piros.setGyors(false);
        zold.setGyors(false);
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
        if (this.nyertes().equals(fogadottCsiga)) {
            eredmenyHirdetes = "Gratulálunk, a %s nyert, így Ön megnyerte a fogadást!".formatted(this.nyertes());
        } else {
            eredmenyHirdetes = "Sajnáljuk, a %s nyert, Ön elvesztette a fogadást.".formatted(this.nyertes());
        }
        return eredmenyHirdetes;
    }

    public void Start() {

        fogadottCsigaSetter();
        for (int i = 0; i < 5; i++) {
            gyorsitas();
            kor();
            GyorsitoVisszaallit();
        }
        System.out.println(kek.getHaladas());
        System.out.println(piros.getHaladas());
        System.out.println(zold.getHaladas());
        System.out.println(nyertes());
        System.out.println(fogadasEredmenye());

    }

}
