package pl.sdacademy.java.basic.exercices.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char char1 = 'a';
        int numberOfExistingCharacter = occurrenceNumber(input, char1);
        System.out.println(numberOfExistingCharacter);
    }

    private static int occurrenceNumber(String input, char searchedCharacter) {
        int counter = 0;
        String stringChar = String.valueOf(searchedCharacter);
        if (StringValidator.isValid(input) && StringValidator.isValid(stringChar) && input.contains(String.valueOf(searchedCharacter))) {
            //int k=input.indexOf(searchedCharacter); pętla może być wydajniejsza
            for (int i = 0; i < input.length() ; i++) {
                if (input.substring(i, i + 1).equals(stringChar)) {
                    counter++;
                }
            }
            return counter;
        }
        return 0;
    }
}
