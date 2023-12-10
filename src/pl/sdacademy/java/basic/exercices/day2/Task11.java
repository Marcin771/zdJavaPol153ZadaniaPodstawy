package pl.sdacademy.java.basic.exercices.day2;

public class Task11 {

    public static void main(String[] args) {
        String tekst1 = "Kajak";
        String tekst2 = "Kobyła ma mały bok";
        String tekst3 = "Owocowo";
        String tekst4 = "ten tekst na pewno nie jest palindromem";

        boolean result = isPalindrome(tekst2);
        System.out.println(result);
    }

    private static boolean isPalindrome(String input) {
        if (StringValidator.isValid(input)) {
            String reverseInput = new StringBuilder(input).reverse().toString();
            return input.equals(reverseInput);
        }
        return false;
    }
}
