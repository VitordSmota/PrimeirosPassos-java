package academy.devdojo.maratonajava.introducao;

public class Operadores {

    public static void main(String[] args) {
        // + - / *
        int  numero1 = 10;
        double numero2 = 20;
        // int / int = int(0) sem decimais   ==///==  int / double = 0.5 -> casas decimais
        double result = numero1/numero2;
        System.out.println("Valor " + result);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // x<y || x <= y (x menor que y || menor ou igual que y)
        // x > y  || x >= y (maior ||maior ou igual)

         boolean isDezMaiorQueVinte = 10 > 20;
         boolean isDezMenorQueVinte = 10 < 20;
         boolean isDezIgualVinte = 10 == 20;
         boolean isDezdiferenteDez = 10 != 10;
         boolean isDezequalDez = 10 == 10;
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);
        System.out.println("isDezdiferenteDez "+ isDezdiferenteDez);
        System.out.println("isDezequalDez "+ isDezequalDez);

       // Operadores Lógicos: &&(AND) ||(OU)  !(NOT)
       int age = 35;
       float salary = 3500F;
       boolean isMaiorQueTrinta = age > 30 && salary >= 4612;
       boolean isMenorQueTrinta = age < 30 && salary >= 3381;

        System.out.println("Estou dentro da Lei: "+isMaiorQueTrinta );
        System.out.println("Estou dentro da Lei: "+isMenorQueTrinta );

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 4000;
        float valorPlay = 5000F;

        boolean iCanBuyPlayFive = valorTotalContaCorrente > valorPlay || valorTotalContaPoupanca > valorPlay;

        System.out.println("I could buy this? " +iCanBuyPlayFive);

        // =  += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        bonus *= 2;
        bonus /= 8;
        bonus %=7;
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;
        contador = 0;
        System.out.println(contador);


    }
}
