package main;

import java.util.Scanner;

public class Jatekos {

    private String nev;
    private int fogad;
    private static final String[] SZINEK = {"piros", "kék", "zöld"};

    public Jatekos(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void fogadas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(nev + ", melyik csigára 🐌 fogadsz? ");
        System.out.print("(0=piros, 1=zöld, 2=kék): ");
        fogad = scanner.nextInt();
        // Biztosítjuk, hogy érvényes tipp legyen
        while (fogad < 0 || fogad > 2) {
            System.out.print("Érvénytelen! Kérlek, 0, 1 vagy 2: ");
            fogad = scanner.nextInt();
        }
        System.out.println(nev + " a " + SZINEK[fogad] + " csigára fogadott.");
    }

}
