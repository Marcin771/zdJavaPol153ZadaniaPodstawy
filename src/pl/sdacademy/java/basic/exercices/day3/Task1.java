package pl.sdacademy.java.basic.exercices.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    /*
    przed @"
    małe litery
    wielkie litery
    cyfry
    bez znaków specjalnych

    @

    po @:
    małe litery
    sda@com sda@com.pl  sda@programowanie.com.pl
    */
    public static void main(String[] args) {
        System.out.println(isCorrectEmailFormat("s@c"));
        System.out.println(isCorrectEmailFormat("1@c"));
        System.out.println(isCorrectEmailFormat("1@1"));    //false
        System.out.println(isCorrectEmailFormat(".@1"));    //false
        System.out.println(isCorrectEmailFormat("a.@1"));   //false
        System.out.println(isCorrectEmailFormat("sda@com"));
        System.out.println(isCorrectEmailFormat("sda1@com"));
        System.out.println(isCorrectEmailFormat("sda1@com.pl"));
        System.out.println(isCorrectEmailFormat("sda1@programowanie.com.pl"));
        System.out.println(isCorrectEmailFormat("sda1@a.b.c"));
        System.out.println(isCorrectEmailFormat("sda1@programowanie.com.pl."));
    }

    private static boolean isCorrectEmailFormat(String email) {
        String regex = "[a-zA-Z0-9]+@[a-z]+(.[a-z]+)*";
//        String regex2 = "[\\w\\d]+@[\\w]+(.[a-z]+)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
