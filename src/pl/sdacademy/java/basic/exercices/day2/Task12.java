package pl.sdacademy.java.basic.exercices.day2;

public class Task12 {
    private static final int RANGE_START = 97;
    private static final int RANGE_END = 122;

    public static void main(String[] args) {
        String expectedResult = "dctfbqnwdkgrtqitcoqyce";
        String inputText = "bardzo lubie programowac";

        int shift = 2;
        String result = cesarCipher(inputText, shift);

        System.out.println("Result:          " + result);
        System.out.println("Expected result: " + expectedResult);
    }

    private static String cesarCipher(String input, int shift) {

        if (input.contains(" ")) {
            input = input.replace(" ", "");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            //sprawdz czy nie wychodzisz poza zakres 97-122
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
