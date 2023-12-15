package pl.sdacademy.java.basic.exercices.day2;

public class Task7 {
    private static final char SPACE_CHAR = ' ';

    public static void main(String[] args) {
        String input = "Ala ma kota";
        double result = percentOfSpaceInString(input);
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }

    private static double percentOfSpaceInString(String input) {
        if (StringValidator.isValid(input) && input.contains(String.valueOf(SPACE_CHAR))) {
            double counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == SPACE_CHAR) {
                    counter++;
                }
            }
            return (counter / input.length()) * 100;
        } else return 0;
    }
}
