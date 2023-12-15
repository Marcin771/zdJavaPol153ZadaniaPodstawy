package pl.sdacademy.java.basic.exercices.extras;

public class Task8 {
    public static void main(String[] args) {
        powersTable();
    }

    private static void powersTable() {
        int[][] array = new int[3][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0) {
                    System.out.printf("%-4s", j + 1);
                } else System.out.printf("%-4s", (int) (Math.pow(j + 1, i + 1)));
            }
            System.out.println();
        }
    }
}