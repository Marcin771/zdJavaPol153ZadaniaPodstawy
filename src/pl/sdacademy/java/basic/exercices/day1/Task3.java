package pl.sdacademy.java.basic.exercices.day1;

import java.util.Scanner;

public class Task3 {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int firstDigitFromUser = getFirstDigitFromUser(scanner);
        int secondDigitFromUser = getSecondDigitFromUser(scanner);

        boolean isXGratherThanY = isXGratherThanY(firstDigitFromUser, secondDigitFromUser);
        System.out.println("Is X grather than Y: " + isXGratherThanY);

        boolean isXMultiplyBy3IsGratherThanY = isXMultiplyBy3IsGratherThanY(firstDigitFromUser, secondDigitFromUser);
        System.out.println("Is X*3 grather than Y: " + isXMultiplyBy3IsGratherThanY);

        boolean pointCMethodResult = pointCMethod(firstDigitFromUser, secondDigitFromUser);
        System.out.println("Method C result: " + pointCMethodResult);

        boolean pointDMethodResult = pointDMethod(firstDigitFromUser, secondDigitFromUser);
        System.out.println("Method D result: " + pointDMethodResult);
    }

    private static boolean pointDMethod(int firstDigitFromUser, int secondDigitFromUser) {
        return firstDigitFromUser * secondDigitFromUser % 2 == 0;
    }

    private static boolean pointCMethod(int firstDigitFromUser, int secondDigitFromUser) {
        return ((secondDigitFromUser++ < ++firstDigitFromUser) && (--firstDigitFromUser < secondDigitFromUser++));
    }

    private static boolean isXMultiplyBy3IsGratherThanY(int firstDigitFromUser, int secondDigitFromUser) {
        return firstDigitFromUser * 3 > secondDigitFromUser;
    }

    private static boolean isXGratherThanY(int firstDigitFromUser, int secondDigitFromUser) {
        return firstDigitFromUser > secondDigitFromUser;
    }

    private static int getSecondDigitFromUser(Scanner scanner) {
        System.out.print("Please insert first digit: ");
        return scanner.nextInt();
    }

    private static int getFirstDigitFromUser(Scanner scanner) {
        System.out.print("Please insert second digit: ");
        return scanner.nextInt();
    }
}
