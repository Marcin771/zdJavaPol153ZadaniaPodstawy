package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String iban1 = "PL10105000997603123456789123";
        System.out.println(isIBAMCorrect(iban1));
    }

    private static boolean isIBAMCorrect(String iban) {
        String regex = "[PL]+[0-9]{26}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}
