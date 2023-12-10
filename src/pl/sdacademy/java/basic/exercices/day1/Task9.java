package pl.sdacademy.java.basic.exercices.day1;

public class Task9 {

    public static void main(String[] args) {
        int number = 35;
        metoda(number);
    }
        private static void metoda(int number) {

        for (int i = 1; i < number; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else System.out.println(i);
        }
    }
}
