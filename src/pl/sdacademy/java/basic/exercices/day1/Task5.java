package pl.sdacademy.java.basic.exercices.day1;

public class Task5 {
    public static void main(String[] args) {
        int firstDigit = 4;
        int secondDigit = 11;
        int result = 0;
        for (int i = firstDigit; i < secondDigit; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
