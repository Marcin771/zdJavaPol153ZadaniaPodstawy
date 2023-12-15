package pl.sdacademy.java.basic.exercices.extras;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 0, 5, 10, 0, 6};
        int[] ints = sortArray(array);
        System.out.println("Input: " + Arrays.toString(array));
        System.out.println("Output: " + Arrays.toString(ints));
    }

    private static int[] sortArray(int[] inputArray) {
        int counter = 0;
        int[] newArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                newArray[counter] = inputArray[i];
                counter++;
            }
        }
        return newArray;
    }
}
