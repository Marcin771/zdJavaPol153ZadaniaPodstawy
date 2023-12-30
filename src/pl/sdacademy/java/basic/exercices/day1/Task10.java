package pl.sdacademy.java.basic.exercices.day1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Please input digit");
        int number = new Scanner(System.in).nextInt();
        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);
    }

    private static int sumOfDigits(int number) {
        String stringNumber = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            result += Integer.parseInt(String.valueOf(stringNumber.charAt(i)));
        }
        return result;
    }
}
