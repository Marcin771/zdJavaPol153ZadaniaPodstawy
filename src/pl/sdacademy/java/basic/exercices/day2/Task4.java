package pl.sdacademy.java.basic.exercices.day2;

public class Task4 {
    private static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala ma, kota. a kot, ma Ale";
        String result = replaceChar(input);
        System.out.println(result);
        String result2 = replaceCharRegex(input);
        System.out.println(result2);
    }

    private static String replaceChar(String input) {

        if (StringValidator.isValid(input)) {
            return input
                    .replace(",", REPLACEMENT)
                    .replace(".", REPLACEMENT);
        }
        return input;
    }

    private static String replaceCharRegex(String input) {

        if (StringValidator.isValid(input)) {
            return input.replaceAll("[.,]", REPLACEMENT);
        }
        return input;
    }
}
