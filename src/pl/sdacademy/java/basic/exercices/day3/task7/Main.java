package pl.sdacademy.java.basic.exercices.day3.task7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Filemon");
        Cat cat2 = new Cat("Filemon");
        Cat cat3 = cat2;
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1==cat2);
        System.out.println(cat3==cat2);
    }
}
