package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String input = "a psik";
        String input2 = "aaaaaa psik";
        System.out.println(metoda("a psik"));
        System.out.println(metoda("aaaaaa psik"));
        System.out.println(metoda("psik"));
    }

    private static boolean metoda(String input) {
        String regex = "a+ psik";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
