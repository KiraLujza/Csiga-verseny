package main;

import java.util.Random;
import java.util.Scanner;

public class Verseny {

    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    Csiga kek;
    Csiga piros;
    Csiga zold;
    private String haladas;

    public Verseny() {
        kek = new Csiga("kék");
        piros = new Csiga("piros");
        zold = new Csiga("zöld");
        this.haladas = haladas;

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

}
