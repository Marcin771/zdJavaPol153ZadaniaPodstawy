package pl.sdacademy.java.basic.exercices.day2;

public class Task8 {

    private static final int VALLUE_UPPER_A_IN_ASCII = 65;
    private static final int VALLUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALLUE_LOWER_A_IN_ASCII = 97;
    private static final int VALLUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        String input = "Ala MA kota!";
        String result = replaceCharecters(input);
        System.out.println(result);
    }

    private static String replaceCharecters(String input) {
//        String result = "";
        StringBuilder result = new StringBuilder();
        if (StringValidator.isValid(input)) {
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar >= VALLUE_UPPER_A_IN_ASCII && currentChar <= VALLUE_UPPER_Z_IN_ASCII) {
//                    result += String.valueOf((char) (currentChar + DIFF_UPPER_AND_LOWER));
                    result.append((char) (currentChar + DIFF_UPPER_AND_LOWER));
                } else if (currentChar >= VALLUE_LOWER_A_IN_ASCII && currentChar <= VALLUE_LOWER_Z_IN_ASCII) {
//                    result += String.valueOf((char) (currentChar - DIFF_UPPER_AND_LOWER));
                    result.append((char) (currentChar - DIFF_UPPER_AND_LOWER));
                } else {
//                    result += currentChar;
                    result.append(currentChar);

                }
            }
            return result.toString();
        }
        return input;
    }
}
