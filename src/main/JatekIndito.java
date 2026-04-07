package main;

public class JatekIndito {

    public static void main(String[] args) {

        Jatekos jatekos = new Jatekos();
        CsigaVersenyJatek verseny = new CsigaVersenyJatek(jatekos);
        verseny.start();

    }//main

}//class
