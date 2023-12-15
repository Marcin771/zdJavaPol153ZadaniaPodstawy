package pl.sdacademy.java.basic.exercices.day2;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    private static final int NUMBER_OF_ARRAY_ELEMENTS = 10;

    public static void main(String[] args) {
        /*
        //hardcoded example
        int[] array = new int[]{2, 4, 6, 0, -5, -7, 3, 9, -4, -5};
        int[] intsResult = sortArray(array);
        System.out.println("Result: "+ Arrays.toString(intsResult));
        */

        System.out.println("Please insert " + NUMBER_OF_ARRAY_ELEMENTS + " digits");
        int[] arrayFromUser = getArrayFromUser(NUMBER_OF_ARRAY_ELEMENTS);
        int[] resultArray = sortArray(arrayFromUser);
        System.out.println("Result: " + Arrays.toString(resultArray));
    }

    private static int[] getArrayFromUser(int numberOfArrayElements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfArrayElements];
        int counter = 0;
        while (counter < numberOfArrayElements) {
            System.out.print("Insert digit: ");
            array[counter] = scanner.nextInt();
            counter++;
        }
        return array;
    }

    private static int[] sortArray(int[] inputArray) {
        boolean isChanged;
        do {
            isChanged = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int temp = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = temp;
                    isChanged = true;
                }
            }
        } while (isChanged);
        return inputArray;
    }
}
