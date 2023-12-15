package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int[] array = new int[]{12, 7, 19, 33, 66, 80, 3, 5};
        int[] intsResult = reverseArray(array);
        System.out.println(Arrays.toString(intsResult));
    }
    private static int[] reverseArray(int[] inputArray) {
        int[] newArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            newArray[newArray.length - i - 1] = inputArray[i];
        }
        return newArray;
    }
}
