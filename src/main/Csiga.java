package main;

import java.util.Random;

public class Csiga {

    private static final Random RND = new Random();

    private String szin;
    private int tav;

    public Csiga(String szin) {
        this.szin = szin;
        this.tav = 0;
    }

    public int getTav() {
        return tav;
    }

    public String getSzin() {
        return szin;
    }

    public void reset() {
        tav = 0;
    }
    public void megy(boolean gyorsitott) {
        int lepes = RND.nextInt(4); // 0..3
        if (gyorsitott) {
            lepes *= 2;
        }
        tav += lepes;
    }

}//class
