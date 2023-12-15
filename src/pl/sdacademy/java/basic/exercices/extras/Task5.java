package pl.sdacademy.java.basic.exercices.extras;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Input sequence number: ");
        int inputSequenceNumber = new Scanner(System.in).nextInt();
        int result = fibonacciSequenceRecursion(inputSequenceNumber);
        System.out.println("Number " + inputSequenceNumber + " in Fibonacci sequence is: " + result);
    }

    private static int fibonacciSequenceRecursion(double sequenceNumber) {
        //wyraz ciągu   0   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16  17      18      19
        // wartosc      0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181
        if (sequenceNumber == 0) {
            return 0;
        } else if (sequenceNumber == 1) {
            return 1;
        } else {
            return fibonacciSequenceRecursion(sequenceNumber - 1) + fibonacciSequenceRecursion(sequenceNumber - 2);
        }
    }
}
