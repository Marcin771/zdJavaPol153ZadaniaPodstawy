package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    private static final String IBAN_REGEX_FORMAT = "PL+[0-9]{26}";

    public static void main(String[] args) {
        System.out.println(isIBAMCorrect("PL10105000997603123456789123"));
        System.out.println(isIBAMCorrect("PP10105000997603123456789123"));
        System.out.println(isIBAMCorrect("PL10105000997603123456782349123"));
    }

    private static boolean isIBAMCorrect(String iban) {
        String regex = IBAN_REGEX_FORMAT;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(iban);
        return matcher.matches();
    }
}
