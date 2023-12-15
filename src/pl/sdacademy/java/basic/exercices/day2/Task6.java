package pl.sdacademy.java.basic.exercices.day2;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        char char1 = 'a';
        int numberOfExistingCharacter = occurrenceNumber(input, char1);
        System.out.println("Input: " + input);
        System.out.println("Serched Character: " + char1);
        System.out.println("Result: " + numberOfExistingCharacter);

        char1 = 'z';
        numberOfExistingCharacter = occurrenceNumber(input, char1);
        System.out.println("Input: " + input);
        System.out.println("Serched Character: " + char1);
        System.out.println("Result: " + numberOfExistingCharacter);
    }

    private static int occurrenceNumber(String input, char char1) {
        int counter = 0;
        String stringChar = String.valueOf(char1);
        if (StringValidator.isValid(input) && StringValidator.isValid(stringChar) && input.contains(String.valueOf(char1))) {
            return input.indexOf(stringChar);
        }
        return -1;
    }
}
