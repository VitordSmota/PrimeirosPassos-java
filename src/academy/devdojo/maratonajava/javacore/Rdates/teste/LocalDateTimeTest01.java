package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.*;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate date = LocalDate.parse("2022-12-25");
        LocalTime time = LocalTime.parse("09:45:01");
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.atTime(time));
        System.out.println(time.atDate(date));

        LocalDateTime timeStamp = LocalDate.now().atTime(LocalTime.now());
        System.out.println(timeStamp);

    }
}
