package pl.sdacademy.java.basic.exercices.extras;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First char:");
        String firstChar = scanner.nextLine();
        System.out.print("Second char:");
        String secondChar = scanner.nextLine();
        int distanceBetwenChars = Math.abs(firstChar.charAt(0) - secondChar.charAt(0));
        System.out.println("Distance: " + distanceBetwenChars);
    }
}