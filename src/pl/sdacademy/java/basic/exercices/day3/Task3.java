package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String input = "1234,1234";
        System.out.println(isInputCorrect(input));
    }

    private static boolean isInputCorrect(String inputString) {
        String regex = "[0-9]+,[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
