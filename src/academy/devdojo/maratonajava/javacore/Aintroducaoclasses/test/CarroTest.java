package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        carro2 = carro1;

        System.out.println("Carro1: "+carro1.nome+" "+carro1.modelo+" "+carro1.ano);
        System.out.println("\nCarro2: "+carro2.nome+" "+carro2.modelo+" "+carro2.ano);


    }
}
