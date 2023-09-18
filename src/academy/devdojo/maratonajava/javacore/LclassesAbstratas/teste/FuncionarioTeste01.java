package academy.devdojo.maratonajava.javacore.LclassesAbstratas.teste;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
    Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

    Desenvolvedor dev = new Desenvolvedor("Vitor", 400);
        System.out.println(dev);

        gerente.imprime();
        dev.imprime();

    }


}
