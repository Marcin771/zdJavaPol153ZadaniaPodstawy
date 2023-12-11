package pl.sdacademy.java.basic.exercices.day2;

import java.util.Scanner;

public class Task9 {
    private static final String STOP_WORD = "Enough";

    public static void main(String[] args) {
        longestWord();
    }

    private static void longestWord() {
        Scanner scanner = new Scanner(System.in);
        String input;
        int longestWordLength = 0;
        String longestWord = null;
        StringBuilder sb = new StringBuilder();
        do {
            System.out.print("Please insert your text:");
            input = scanner.nextLine();
            if (input.equals(STOP_WORD)) {
                break;
            } else if (input.isBlank()) {
                System.out.println("No input");
            } else {
                if (input.length() > longestWordLength) {
                    longestWord = input;
                    longestWordLength = input.length();
                }
            }
        } while (!input.equals(STOP_WORD));
        System.out.println("Result: " + longestWord);
    }
}
