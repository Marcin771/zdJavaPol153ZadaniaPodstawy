package pl.sdacademy.java.basic.exercices.day1;

public class Task8 {

    public static void main(String[] args) {
        int zakresPoczątek = 0;
        int zakresKoniec = 1000000;
        for (int i = zakresPoczątek; i <= zakresKoniec; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
