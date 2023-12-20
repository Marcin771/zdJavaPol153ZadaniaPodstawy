package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static final String WORD_REGEX_FORMAT = "a+ psik";

    public static void main(String[] args) {
        System.out.println(metoda("a psik"));
        System.out.println(metoda("aaaaaa psik"));
        System.out.println(metoda("psik"));
    }
    private static boolean metoda(String input) {
        String regex = WORD_REGEX_FORMAT;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
