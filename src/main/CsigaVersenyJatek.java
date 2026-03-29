package main;

import java.util.Random;

public class CsigaVersenyJatek {

    private static final Random RND = new Random();
    public static final int KOROK_SZAMA = 5;
    public static final int GYORSITO_ESELY = 20; // 20%

    private Csiga cs1;
    private Csiga cs2;
    private Csiga cs3;
    private Jatekos jatekos;

    public CsigaVersenyJatek(String jatekosNev) {
        cs1 = new Csiga("piros");
        cs2 = new Csiga("zöld");
        cs3 = new Csiga("kék");
        jatekos = new Jatekos(jatekosNev);
    }

    public void start() {
        System.out.println("=== CSIGAVERSENY ===");
        System.out.println("3 csiga versenyzik " + KOROK_SZAMA + " körön keresztül.");
        System.out.println("Egy körben egy csiga 0..3 egységet megy.");
        System.out.println("Minden körben " + GYORSITO_ESELY + "% eséllyel valamelyik csiga gyorsítót kap (dupla sebesség).\n");
        jatekos.fogadas();
    }
}//class
