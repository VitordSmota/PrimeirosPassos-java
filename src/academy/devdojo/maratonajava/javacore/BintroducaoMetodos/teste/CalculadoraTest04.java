package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int a =66;
        int b = 34;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(a,b);
        System.out.println(a+" "+ b);
    }


}
