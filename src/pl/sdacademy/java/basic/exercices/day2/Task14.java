package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5, 56, -99, 5, -3, -9};
        int[] result = getNegativeValues(inputs);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getNegativeValues(int[] ints) {
        int counter = 0;
        for (int element : ints) {
            if (element < 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int newArrayCounter = 0;
        // mozna uzyc tez pętle foreach
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < 0) {
                newArray[newArrayCounter] = ints[i];
                newArrayCounter++;
            }
        }
        return newArray;
    }
}
