package pl.sdacademy.java.basic.exercices.day3.Task12;

public class Computer {
//    Napisz klasę Computer, zawierającą klasy zagnieżdżone jako kolejne komponenty komputera:
//    a) Processor, posiadający prywatne pola przechowujące informacje o rdzeniach (cores, typu
//int) i producencie (producer, typu String);
//    b) Memory, posiadający prywatne pola przechowujące informacje o ilości pamięci (memory, typu
//int), producencie (producer, typu String) oraz typie (type, typu String);
//    c) ExternalPort, jako klasę statyczną, posiadającą prywatne pole przechowujące informacje
//    o typie (type, typu String).
//    Następnie w klasie Main spróbuj stworzyć obiekt nowego komputera, wykorzystując wszystkie
//    komponenty

    public Processor processor;
    public Memory memory;
    public ExternalPort externalPort;

    public Computer(Processor processor, Memory memory, ExternalPort externalPort) {
        this.processor = processor;
        this.memory = memory;
        this.externalPort = externalPort;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", externalPort=" + externalPort +
                '}';
    }

    public static class Processor {
        private int cores;
        private String producer;

        public Processor(int cores, String producer) {
            this.cores = cores;
            this.producer = producer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "cores=" + cores +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }

    public static class Memory {
        private int memory;
        private String producer;

        private String type;

        public Memory(int memory, String producer, String type) {
            this.memory = memory;
            this.producer = producer;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Memory{" +
                    "memory=" + memory +
                    ", producer='" + producer + '\'' +
                    '}';
        }
    }

    public static class ExternalPort {
        private String type;

        public ExternalPort(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "ExternalPort{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }
}
