package pl.sdacademy.java.basic.exercices.extras;

import pl.sdacademy.java.basic.exercices.day2.StringValidator;

public class Task1 {
    public static void main(String[] args) {
        String inputTex1 = "   Ala ma kota, a  kot ma Alę !    ";
        String inputTex2 = "          Hej, będę dziś później. Nie czekaj na mnie z kolacją.     ";
        String inputTex3 = "Ala ma kota, a kot ma myszkę.";
        String stringResult = shortenSmsMessage(inputTex3);
        System.out.println("Input: " + inputTex3);
        System.out.println("Output: " + stringResult);
    }

    private static String shortenSmsMessage(String input) {
        if (StringValidator.isValid(input)) {
            String trimmedText = input.trim();
            String[] splitedArray = trimmedText.split(" ");
            int counter = 0;
            StringBuilder resultSms = new StringBuilder();
            for (int i = 0; i < splitedArray.length; i++) {
                if (!splitedArray[i].isBlank()) {
                    String firstLetterOfWord = splitedArray[i].substring(0, 1).toUpperCase();
                    String restOfWord = splitedArray[i].substring(1).toLowerCase();
                    resultSms
                            .append(firstLetterOfWord)
                            .append(restOfWord);
                    counter++;
                }
            }
            return resultSms.toString();
        }
        return input;
    }
}

