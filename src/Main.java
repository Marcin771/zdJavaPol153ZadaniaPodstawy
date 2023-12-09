public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        wezykGwiazdek();
    }
    private static void wezykGwiazdek() {
        //długość wężyka podana przez użytkownika
        System.out.println("Podaj długosc wężyka");
//        int dlugosc = new Scanner(System.in).nextInt();
        System.out.println("Podaj wysokość wężyka");
//        int wysokoscWezyka = new Scanner(System.in).nextInt();
        int dlugosc2 = 89;
        int wysokoscWezyka = 4;
        String tablica[][] = new String[wysokoscWezyka][dlugosc2];

        przygotujTablice(tablica);
        algorytmWezyka(tablica, dlugosc2);
        drukujWezyk(tablica);


    }
    private static void przygotujTablice(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
//                tablica[i][j] = i + "" + j;
                tablica[i][j] = " ";
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
                tablica[X][Y] = "*";
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

                tablica[X][Y] = "*";
                counter++;
                counterObiegu++;
                X++;
                Y++;
            }
        }
    }
    private static void drukujWezyk(String[][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
//                System.out.print("[");
                System.out.print(tablica[i][j]);
//                System.out.print("]");
            }
            System.out.println();
        }
    }
}