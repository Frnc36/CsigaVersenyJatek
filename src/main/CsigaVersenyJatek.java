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



    public void start() {
        System.out.println("=== CSIGAVERSENY ===");
        System.out.println("3 csiga versenyzik " + KOROK_SZAMA + " körön keresztül.");
        System.out.println("Egy körben egy csiga 0..3 egységet megy.");
        System.out.println("Minden körben " + GYORSITO_ESELY + "% eséllyel valamelyik csiga gyorsítót kap (dupla sebesség).\n");

        jatekos.fogadas();

    }

}//class
