package academy.devdojo.maratonajava.javacore.Rdates.teste;

import academy.devdojo.maratonajava.javacore.HexercicioAssociacao.dominio.Local;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1999, Month.JULY, 10,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Horas vividos pela Vitor :"+ChronoUnit.HOURS.between(aniversario, now));
        System.out.println("Dias vividos pela Vitor :"+ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas vividos pela Vitor :"+ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Anos vividos pela Vitor :"+ChronoUnit.YEARS.between(aniversario, now));
    }
}
