package pl.sdacademy.java.basic.exercices.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        stoper();
    }

    private static void stoper() {
        System.out.println("To start timing press ENTER:");
        new Scanner(System.in).nextLine();
        System.out.println("Process started...");
        LocalDateTime localTime1 = LocalDateTime.now();
        System.out.println("To stop timing press ENTER:");
        new Scanner(System.in).nextLine();
        LocalDateTime localTime2 = LocalDateTime.now();
        long duration = Duration.between(localTime2, localTime1).toSeconds();
        System.out.println("Total time: " + Math.abs(duration) + " sec");
    }
}
