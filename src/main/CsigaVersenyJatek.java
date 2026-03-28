package main;

public class CsigaVersenyJatek {

    private Jatekos jatekos;

    public CsigaVersenyJatek(String jatekosNev) {
        jatekos = new Jatekos(jatekosNev);
    }
    
    public void start() {
        jatekos.fogadas();
    }
}//class
