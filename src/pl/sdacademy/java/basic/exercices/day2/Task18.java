package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int[] generatedArray = generateArray();
        System.out.println("Generated array: " + Arrays.toString(generatedArray));
        int[] intsResult = countOccurrences(generatedArray);
        printResultList(intsResult);
    }

    private static void printResultList(int[] intsResult) {
        for (int i = 0; i < intsResult.length; i++) {
            System.out.println(i + ": " + intsResult[i]);
        }
    }

    private static int[] countOccurrences(int[] resultArray) {
        int[] newArry = new int[resultArray.length];
        int index = 0;
        for (int i = 0; i < resultArray.length; i++) {
            index = resultArray[i];
            newArry[index]++;
        }
        return newArry;
    }

    private static int[] generateArray() {
        int[] resultArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            resultArray[i] = random.nextInt(10);
        }
        return resultArray;
    }
}
