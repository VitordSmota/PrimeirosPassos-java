package academy.devdojo.maratonajava.javacore.Rdates.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) {
        Instant now  = Instant.now();
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(LocalDateTime.now());
    }
}
