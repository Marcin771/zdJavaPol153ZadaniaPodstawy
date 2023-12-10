package pl.sdacademy.java.basic.exercices.day2;

public class Task3 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "rma";
        int result = getIndex(input, word);
        System.out.println(result);
    }

    private static int getIndex(String input, String word) {
        if (StringValidator.isValid(input) && StringValidator.isValid(word)) {
            // sama metoda indexOf zwraca -1 kiedy input nie zawiera slowa word
            // wiec if jest w zasadzie zbędny
            //if (input.contains(word)) {
                return input.indexOf(word);
            //}
        }
        return -1;
    }
}
