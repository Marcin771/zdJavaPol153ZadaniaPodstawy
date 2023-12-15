package pl.sdacademy.java.basic.exercices.extras;

public class Task6 {
    public static void main(String[] args) {
        int numberOfRows = 10;
        int numberOfColumns = 10;
        multiplicationTable(numberOfRows, numberOfColumns);
    }

    private static void multiplicationTable(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.printf("%-4s", i * j);
            }
            System.out.println();
        }
    }
}
