package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {

        int[] resultArray = metoda(6, 3, 9);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] metoda(int length, int firstElement, int odds) {
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = firstElement;
            firstElement = firstElement + odds;
        }
        return newArray;
    }

}
