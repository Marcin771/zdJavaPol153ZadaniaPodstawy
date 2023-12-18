package pl.sdacademy.java.basic.exercices.day3;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Task6 {
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {

        howManyDaysLeft();

    }

    private static void howManyDaysLeft() {
        System.out.println("Please insert date [in format [yyyy-MM-dd HH:mm:ss]");
        String inputDate = new Scanner(System.in).nextLine();
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(inputDate, dtf);
        Duration period = Duration.between(currentDate, nextLesson);
        long days = period.toDays();
        int hours = period.toHoursPart();
        int minutes = period.toMinutesPart();
        int seconds = period.toSecondsPart();
        System.out.printf("You have Days: %01d Hours : %01d Minutes : %01d Secs %01d to the next lesson.", days, hours, minutes, seconds);
        System.out.println("You have Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Secs: " + seconds);
    }
}
