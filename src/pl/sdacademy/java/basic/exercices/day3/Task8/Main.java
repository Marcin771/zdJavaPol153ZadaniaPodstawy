package pl.sdacademy.java.basic.exercices.day3.Task8;

import pl.sdacademy.java.basic.exercices.day3.Task8.Author;
import pl.sdacademy.java.basic.exercices.day3.Task8.Poem;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Mickiewicz", "polish");
        Author author2 = new Author("Prus", "polish");
        Author author3 = new Author("Sienkiewicz", "polish");
        Poem[] poems = new Poem[3];
        poems[0] = new Poem(author1, 150);
        poems[1] = new Poem(author2, 1505);
        poems[2] = new Poem(author3, 60);

        int maxStropheNumbers = poems[0].getStropheNumbers();
        Author authorWithLongestPoem=null;
        for (Poem p : poems) {
            if (p.getStropheNumbers() > maxStropheNumbers) {
                maxStropheNumbers = p.getStropheNumbers();
                authorWithLongestPoem = p.getCreator();
            }
        }
        System.out.println(authorWithLongestPoem);
    }
}
