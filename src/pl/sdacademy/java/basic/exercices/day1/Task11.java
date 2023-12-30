package pl.sdacademy.java.basic.exercices.day1;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(101);
        int userNumber = 0;
        do {
            System.out.println("Insert number from 0 to 100");
            userNumber = new Scanner(System.in).nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Not enough");
            } else if (userNumber > randomNumber) {
                System.out.println("Too much");

            } else System.out.println("Bingo!");

        } while (randomNumber!=userNumber);
    }
}
