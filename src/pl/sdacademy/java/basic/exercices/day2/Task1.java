package pl.sdacademy.java.basic.exercices.day2;

public class Task1 {

    private static char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String napis1 = "Ala";
        String napis2 = "domek";

        System.out.println(getLastCharacter(napis1));
        System.out.println(getLastCharacter(napis2));

        String napis4 = null;
        System.out.println(getLastCharacter(napis4));

    }

    private static char getLastCharacter(String input) {
      /*  if(input.equals(null)){

        }
        wywołanie metody equals na obiekcie input też wywali exception
        bo wykonujmy metode na nullowym obiekcie
        */
        if (StringValidator.isValid(input)) {
            int lastPosition = input.length() - 1;
            return input.charAt(lastPosition);
        }
        System.out.println("Wrong input!");
        return DEFAULT_CHAR;
    }
}
