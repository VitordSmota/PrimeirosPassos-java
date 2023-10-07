package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.of(23,59,59);
        System.out.println(timeNow);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        String formaterTime = timeNow.toString().substring(0,8);
        System.out.println(formaterTime);
        
    }
}
