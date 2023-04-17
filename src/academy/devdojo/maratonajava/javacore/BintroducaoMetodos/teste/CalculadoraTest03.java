package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double result = calculadora.divideDoisNumeros(23, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20, 2));
    }
}
