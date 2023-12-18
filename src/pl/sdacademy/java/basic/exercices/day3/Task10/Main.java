package pl.sdacademy.java.basic.exercices.day3.Task10;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Warrior xMen = new Warrior("Xmen", 7, 100);
        Warrior batman = new Warrior("Batman", 5, 100);

        System.out.println("Warriors");
        System.out.println(xMen);
        System.out.println(batman);

        xMen.attack(batman);
        xMen.attack(batman);
        xMen.attack(batman);
        System.out.println(batman);
        System.out.println("----");
        batman.attack(xMen);
        System.out.println(xMen);
        System.out.println("----");
        batman.attack(xMen);
        xMen.attack(batman);
        System.out.println(batman);
        System.out.println(xMen);

    }
}
