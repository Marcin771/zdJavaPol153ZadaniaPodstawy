package pl.sdacademy.java.basic.exercices.day1;

import java.util.Scanner;

public class Task2 {

//    private static final float PI = 3.14F;
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        double calculatedCircumference = calculateCircumference(radius);
        double calculatedArea = calculateArea(radius);
        System.out.println("Circumference of a circle: " +calculatedCircumference);
        System.out.println("Area of a circle: " +calculatedArea);
    }

    private static double calculateArea(float radius) {
        // pi * r^2
        return PI * (float) Math.pow(radius,2);
    }

    private static double calculateCircumference(float radius) {
        //2 * pi * r
        return 2 * PI * radius;
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter");
        return scanner.nextFloat();
    }
}
