package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.IOException;
import java.io.Closeable;
public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando o Leitor 1");
    }
}
