package pl.sdacademy.java.basic.exercices.day2;

public class Task7 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        double result = percentOfSpaceInString(input);
        System.out.println(result);
    }

    private static double percentOfSpaceInString(String input) {
        int lenghtOfString = input.length();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1).equals(" ")) {
                counter++;
            }
        }
        return ((double) counter / (double) lenghtOfString)*100;
    }
}
