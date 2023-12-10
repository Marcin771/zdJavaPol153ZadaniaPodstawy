package pl.sdacademy.java.basic.exercices.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] input1 = new String[]{"Ala", "ma", "kota"};
        String[] input2 = new String[]{"Ala", "ma", "kota"};
        boolean isArraysMatching = stringArrayCompare(input1, input2);
        System.out.println(isArraysMatching);
    }

    private static boolean stringArrayCompare(String[] ints1, String[] ints2) {
        boolean result= false;
        if (ints1.length == ints2.length) {
            for (int i = 0; i < ints1.length; i++) {
                if (ints1[i].equals(ints2[i])) {
                    result = true;
                }else {
                    result = false;
                }
            }
        } else {
            return false;
        }
        return result;
    }
}
