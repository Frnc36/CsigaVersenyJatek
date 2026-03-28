package main;

import java.util.Scanner;

public class JatekIndito {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a neved: ");
        String nev = scanner.nextLine();

        CsigaVersenyJatek verseny = new CsigaVersenyJatek(nev);
        verseny.start();

    }//main

}//class
