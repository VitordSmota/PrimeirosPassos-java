package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IOException {

        divisao(1,0);



        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b divisor não pode ser zero.
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
