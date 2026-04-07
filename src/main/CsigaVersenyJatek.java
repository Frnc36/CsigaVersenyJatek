package main;

import java.util.Random;

public class CsigaVersenyJatek {

    private static final Random RND = new Random();
    public static final int KOROK_SZAMA = 5;
    public static final int GYORSITO_ESELY = 20;

    private Csiga cs1;
    private Csiga cs2;
    private Csiga cs3;
    private Jatekos jatekos;

    public static final String RESET = "\u001B[0m";
    public static final String PIROS = "\u001B[31m";
    public static final String ZOLD = "\u001B[32m";
    public static final String KEK = "\u001B[34m";

    public CsigaVersenyJatek(Jatekos jatekos) {
        cs1 = new Csiga("piros");
        cs2 = new Csiga("zöld");
        cs3 = new Csiga("kék");
        this.jatekos = jatekos;
    }
    
    private void rajzolCsiga(String szin, int tav, String szinezes) {
        System.out.print(szinezes+szin + ": ");
        for (int i = 0; i < tav; i++) {
            System.out.print("-");
        }
        System.out.println("🐌"+RESET);
    }

    public void start() {
        jatekBevezeto();

        jatekos.fogadas();

        System.out.println("\nA verseny kezdődik!\n");

        for (int kor = 1; kor <= KOROK_SZAMA; kor++) {
            System.out.println("-- " + kor + ".kör" + " --");

            Csiga gyorsitottCsiga = gyositoAd();

            cs1.megy(gyorsitottCsiga == cs1);
            cs2.megy(gyorsitottCsiga == cs2);
            cs3.megy(gyorsitottCsiga == cs3);

            rajzolCsiga("piros", cs1.getTav(), PIROS);
            rajzolCsiga("zöld", cs2.getTav(), ZOLD);
            rajzolCsiga("kék", cs3.getTav(), KEK);
            System.out.println();
        }
        System.out.println("A verseny vége!");

        String gyoztesSzin = gyoztesSzin();

    }//start()

    private String gyoztesSzin() {
        if (cs1.getTav() >= cs2.getTav() && cs1.getTav() >= cs3.getTav()) {
            return "piros";
        } else if (cs2.getTav() >= cs1.getTav() && cs2.getTav() >= cs3.getTav()) {
            return "zöld";
        } else {
            return "kék";
        }
    }

    private Csiga gyositoAd() {
        boolean vanGyorsito = RND.nextInt(100) < GYORSITO_ESELY;
        Csiga gyorsitottCsiga = null;
        if (vanGyorsito) {
            int melyik = RND.nextInt(3);
            if (melyik == 0) {
                gyorsitottCsiga = cs1;
                System.out.println("Gyorsítót kap: piros");
            } else if (melyik == 1) {
                gyorsitottCsiga = cs2;
                System.out.println("Gyorsítót kap: zöld");
            } else {
                gyorsitottCsiga = cs3;
                System.out.println("Gyorsítót kap: kék");
            }
        } else {
            System.out.println("Gyorsítót kap: -");
        }
        return gyorsitottCsiga;
    }

    private void jatekBevezeto() {
        System.out.println("=== CSIGAVERSENY ===");
        System.out.println("3 csiga versenyzik " + KOROK_SZAMA + " körön keresztül.");
        System.out.println("Egy körben egy csiga 0..3 egységet megy.");
        System.out.println("Minden körben " + GYORSITO_ESELY + "% eséllyel valamelyik csiga gyorsítót kap (dupla sebesség).\n");
    }

}//class
