package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade =  Integer.parseInt(entrada.nextLine());

        System.out.println("Digite seu sexo (M ou F)");
         char sexo = entrada.nextLine().charAt(0);
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Sexo: "+sexo);

    }
}
