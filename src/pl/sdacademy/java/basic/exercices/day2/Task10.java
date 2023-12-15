package pl.sdacademy.java.basic.exercices.day2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        wordMadeFromLastCharacters();
    }

    private static void wordMadeFromLastCharacters() {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = 0;
        System.out.println("How many words would you like to insert? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter number!");
            scanner.next();//usuwa niepoprawne dane wejsciowe
        }
        numberOfWords = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Input appropriate number of words");
        scanner.nextLine();
        while (numberOfWords-- > 0) {
            String inputWord = scanner.nextLine();
            stringBuilder.append(inputWord.charAt(inputWord.length() - 1));
        }
        System.out.println(stringBuilder);
    }
}