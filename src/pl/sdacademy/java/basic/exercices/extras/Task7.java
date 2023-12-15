package pl.sdacademy.java.basic.exercices.extras;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //method need to be fixed
        //int sumOfElementsOnDiagonal = sumNumbersOnDiagonals(array);
        //System.out.println("Sum of elements on diagonals: " + sumOfElementsOnDiagonal);

        int sumOfElementsOnEdges = sumNumbersOnEdges(array);
        System.out.println("Sum of elements on edges: " + sumOfElementsOnEdges);
    }

    private static int sumNumbersOnEdges(int[][] array) {
        int sum = 0;
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    private static int sumNumbersOnDiagonals(int[][] array) {
        //method need to be fixed
        int sum = 0;
        int rows = array.length;
        int cols = array[0].length;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j || cols - 1 - i == j) {
                    sum += array[i][j];
                }
            }
        }

        return sum;
    }
}
