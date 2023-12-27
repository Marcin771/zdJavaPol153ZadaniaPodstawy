package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task19 {
//    Bigger array is: 1, 2, 3, 4, 5, 6,7, 8, 9
//    The biggest value is: 12
//    The lowest value is: -25

    public static void main(String[] args) {
        int[][] firstArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] secondArray = new int[][]{{10, -5, 5}, {-25, 6, 6}, {12, 8, 9}};
        int[][] ints = arrayWithBiggestSumOfDidigts(firstArray, secondArray);
        System.out.println("Bigger array is: ");
        printArray(ints);

        int lowestValue = lowestValue(firstArray, secondArray);
        int biggestValue = biggestValue(firstArray, secondArray);
        System.out.println();
        System.out.println("The biggest value is: " + biggestValue);
        System.out.println("The lowest value is: " + lowestValue);

    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (9 > (i + 1) * (j + 1)) {
                    System.out.print(", ");
                }
            }
        }
    }

    private static int lowestValue(int[][] firstArray, int[][] secondArray) {
        return Math.min(getMinValue(firstArray), getMinValue(secondArray));
    }

    private static int biggestValue(int[][] firstArray, int[][] secondArray) {
        return Math.max(getMaxValue(firstArray), getMaxValue(secondArray));
    }

    private static int getMinValue(int[][] array) {
        int currentMinValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < currentMinValue) {
                    currentMinValue = array[i][j];
                }
            }
        }
        return currentMinValue;
    }

    private static int getMaxValue(int[][] array) {
        int currentMaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > currentMaxValue) {
                    currentMaxValue = array[i][j];
                }
            }
        }
        return currentMaxValue;
    }

    private static int[][] arrayWithBiggestSumOfDidigts(int[][] firstArray, int[][] secondArray) {
        return sumOfDigits(firstArray) > sumOfDigits(secondArray) ? firstArray : secondArray;
    }

    private static int sumOfDigits(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }


}
