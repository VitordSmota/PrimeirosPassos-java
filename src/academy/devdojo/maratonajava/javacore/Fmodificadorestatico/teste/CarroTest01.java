package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BWM", 280);
        Carro carro1 = new Carro("Mercedes", 290);
        Carro carro2 = new Carro("Audi", 170);

        carro.imprime();
        carro1.imprime();
        carro2.imprime();
    }

}
