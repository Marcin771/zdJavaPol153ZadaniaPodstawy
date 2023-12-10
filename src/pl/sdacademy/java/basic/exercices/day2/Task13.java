package pl.sdacademy.java.basic.exercices.day2;

import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = new int[3];
        inputs[0] = 12;
        inputs[1] = 7;
        inputs[2] = 19;

        int[] inputs2 = {12, 7, 19};
        int minValue = getMinValue(inputs);
        System.out.println("Min value: " + minValue);

        int maxValue = getMaxValue(inputs);
        System.out.println("Min value: " + maxValue);

        int sumResult = sum(inputs);
        System.out.println("Sum: " + sumResult);
    }

    private static int sum(int[] inputs) {
        //Arrays.stream(inputs).sum();
        int sum = 0;
        for (int element : inputs
        ) {
            sum += element;
        }
    }

    private static int getMinValue(int[] ints) {
        int currentMinValue = ints[0];
        /*for (int i = 1; i < ints.length; i++) {
            if (ints[i] < currentMinValue) {
                currentMinValue = ints[i];
            }
        }*/
        for (int element : ints) {
            if (element < currentMinValue) {
                currentMinValue = element;
            }
        }
        return currentMinValue;
    }

    private static int getMaxValue(int[] ints) {
        //Arrays.stream(ints).max().getAsInt();
        int currentMaxValue = ints[0];
        for (int element : ints) {
            if (element > currentMaxValue) {
                currentMaxValue = element;
            }
        }
        return currentMaxValue;
    }
}
