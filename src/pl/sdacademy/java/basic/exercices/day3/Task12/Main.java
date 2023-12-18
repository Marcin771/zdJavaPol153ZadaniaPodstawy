package pl.sdacademy.java.basic.exercices.day3.Task12;

import pl.sdacademy.java.basic.exercices.day3.Task12.Computer.Processor;
import pl.sdacademy.java.basic.exercices.day3.Task12.Computer.Memory;
import pl.sdacademy.java.basic.exercices.day3.Task12.Computer.ExternalPort;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(12, "Intel");
        Memory memory = new Memory(16, "GoodRam","SSD");
        ExternalPort externalPort = new ExternalPort("USB");

        Computer computer = new Computer(processor,memory,externalPort);
        System.out.println(computer);
    }
}
