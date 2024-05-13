package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateExample {
    public static void LocalDateTimeApi(){

        // current date
        LocalDate date = LocalDate.now();
        System.out.println("The current date is " + date);

        // current time
        LocalTime time = LocalTime.now();
        System.out.println("The current time is " + time);

        // will give us the current time and data
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time: " + current);

        // to print in a particular format
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);

        System.out.println("in a formatted manner " + formatedDateTime);

        // printing months, days, and seconds
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month: " + month + " day: " + " seconds: " + seconds);

        // printing some specified date
        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("Republic day: " + date2);

        // printing with current time
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println("specific date with " + "current time: " + specificDate);

    }
}
