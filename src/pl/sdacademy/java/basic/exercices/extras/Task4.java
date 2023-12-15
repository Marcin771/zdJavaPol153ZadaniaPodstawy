package pl.sdacademy.java.basic.exercices.extras;

import java.util.Scanner;

public class Task4 {
    private static final String STAR = "*";
    private static final String SPACE_STRING = " ";

    public static void main(String[] args) {

        System.out.println("Podaj długosc wężyka");
        int dlugosc1 = new Scanner(System.in).nextInt();
        System.out.println("Podaj wysokość wężyka");
        int wysokoscWezyka1 = new Scanner(System.in).nextInt();
        String[][] tablica = new String[wysokoscWezyka1][dlugosc1];

        przygotujTablice(tablica);
        algorytmWezyka(tablica, dlugosc1);
        drukujWezyka(tablica);
    }

    private static void przygotujTablice(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
//                tablica[i][j] = i + "" + j;
                tablica[i][j] = SPACE_STRING;
            }
        }
    }

    private static void algorytmWezyka(String[][] tablica, int dlugoscWezyka) {
        int dlugoscObiegu = tablica.length;
        int counter = 0;
        int X = 0;
        int Y = 0;
        boolean obiegWDol = true;
        int counterObiegu = 0;

        if (dlugoscWezyka >= dlugoscObiegu) {
            while (counter < dlugoscWezyka) {
                tablica[X][Y] = STAR;
                counter++;
                counterObiegu++;
//---------------------------------------------------------------
                if (counterObiegu < dlugoscObiegu) {
                    X += obiegWDol ? 1 : -1;
                } else {
                    counterObiegu = 0;
                    obiegWDol = !obiegWDol;
                }
                Y++;
//---------------KOD POWYŻEJ BARDZIEJ UPOŻĄDKOWANY----------------
//                if (obiegWDol) {
//                    if (counterObiegu < dlugoscObiegu) {
//                        X++;
//                        Y++;
//                    } else {
//                        counterObiegu = 0;
//                        obiegWDol = false;
//                        Y++;
//                    }
//                } else if (!obiegWDol) {
//                    if (counterObiegu < dlugoscObiegu) {
//                        X--;
//                        Y++;
//                    } else {
//                        counterObiegu = 0;
//                        obiegWDol = true;
//                        Y++;
//                    }
//                }
//---------------------------------------------------------------
            }
        } else {
            // wężyk ma mniej niż dlugoscObiegu
            while (counter < dlugoscWezyka) {

                tablica[X][Y] = STAR;
                counter++;
                counterObiegu++;
                X++;
                Y++;
            }
        }
    }

    private static void drukujWezyka(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
    }
}


