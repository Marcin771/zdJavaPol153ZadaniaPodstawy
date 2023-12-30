package pl.sdacademy.java.basic.exercices.day1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    private static final String STOP_WORD = "Stop";
    private static final String OPERATOR_PATTERN = "[+-/*]";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = null;
        do {
            System.out.println("Please enter first number");
            float firstNumber = input.nextFloat();
            input.nextLine();
            System.out.println("What is the operation +-/*?");
            String operator = input.nextLine();

            System.out.println("Please enter second number");
            float secondNumer = input.nextFloat();
            input.nextLine();
            if (isOperatorCorrect(operator)) {
                float result = calculate(firstNumber, secondNumer, operator);
                System.out.println(firstNumber + operator + secondNumer + " = " + result);
            } else {
                System.out.println("Wrong operator");
            }
            System.out.println("Finish work?");
            word = input.nextLine();
        } while (!word.equalsIgnoreCase(STOP_WORD));
    }

    private static float calculate(float firstNumber, float secondNumer, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumer;
                break;
            case "-":
                result = firstNumber - secondNumer;
                break;
            case "*":
                result = firstNumber * secondNumer;
                break;
            case "/":
                if (secondNumer == 0) {
                    System.out.println("Invalid operation");
                    System.exit(1);
                } else {
                    result = firstNumber / secondNumer;
                    break;
                }
        }
        return result;
    }

    private static boolean isOperatorCorrect(String operator) {
        Pattern pattern = Pattern.compile(OPERATOR_PATTERN);
        return pattern.matcher(operator).matches();
    }
}
