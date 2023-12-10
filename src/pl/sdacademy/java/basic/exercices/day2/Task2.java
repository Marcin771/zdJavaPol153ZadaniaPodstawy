package pl.sdacademy.java.basic.exercices.day2;

import java.text.ParseException;

import static pl.sdacademy.java.basic.exercices.day2.StringValidator.isValid;

public class Task2 {
    StringBuilder stringBuilder = new StringBuilder();
    ParseException s;

    public static void main(String[] args) {
        String input = "programowanie";
        String prefix = "pro";
        boolean result = isCorrectPrefix(input, prefix);
        System.out.println(result);

        input = "java";
        prefix = null;
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false

        input = null;
        prefix = "java";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result); //false

        input = "java";
        prefix = "abc";
        result = isCorrectPrefix(input, prefix);
        System.out.println(result);
    }

    private static boolean isCorrectPrefix(String input, String prefix) {
        if (isValid(input) && isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;

    }


}
