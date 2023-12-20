package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static final String NUMBER_REGEX_FORMAT = "[0-9]+,[0-9]+";

    public static void main(String[] args) {
        System.out.println(isInputCorrect("1234,1234"));
        System.out.println(isInputCorrect("1234a1234"));
        System.out.println(isInputCorrect("123,123"));
    }

    private static boolean isInputCorrect(String inputString) {
        String regex = NUMBER_REGEX_FORMAT;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
