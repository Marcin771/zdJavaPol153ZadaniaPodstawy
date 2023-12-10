package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task17 {

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 0, -5, -7, 3, 9, -4, -5};
        int[] intsResult = sortArray(array);
        System.out.println(Arrays.toString(intsResult));
    }
    private static int[] sortArray(int[] inputArray) {
        boolean isChanged;
        do {
            isChanged = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i+1];
                    inputArray[i+1] = inputArray[i];
                    inputArray[i] = temp;
                    isChanged = true;
                }
            }
        } while (isChanged);
        return inputArray;
    }
}
