package pl.sdacademy.java.basic.exercices.day2;

import java.util.Scanner;

public class Task12 {
    private static final int RANGE_START = 97;
    private static final int RANGE_END = 122;
    private static final char SPACE_CHAR = ' ';

    public static void main(String[] args) {
       /*
        //hardcoded example
        String expectedResult = "dctfbqnwdkgrtqitcoqyce";
        String inputText = "bardzo lubie programowac";
        int shift = 2;
        String result = cesarCipher(inputText, shift);
        System.out.println("Result:          " + result);
        System.out.println("Expected result: " + expectedResult);
        */

        //using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your text:");
        String inputText = scanner.nextLine();
        System.out.println("Please insert shift: ");
        int shift = scanner.nextInt();
        String result = cesarCipher(inputText, shift);
        System.out.println("Encrypted text: " + result);
    }

    private static String cesarCipher(String input, int shift) {
        if (input.contains(String.valueOf(SPACE_CHAR))) {
            input = input.replace(" ", "");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            //check if you do not go beyond the 97-122 range
            char prepparedChar = checkCharRange(shift, currentChar);
            result.append(prepparedChar);
        }
        return result.toString();
    }

    private static char checkCharRange(int shift, char currentChar) {
        if (currentChar + shift > RANGE_END) {
            return (char) (RANGE_START + Math.abs(RANGE_END - (currentChar + shift)) - 1);
        } else {
            return (char) (currentChar + shift);
        }
    }
}
