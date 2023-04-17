package academy.devdojo.maratonajava.javacore.JHeranca.teste;

import academy.devdojo.maratonajava.javacore.JHeranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.JHeranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.JHeranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("0123456-908");
        Pessoa pessoa = new Pessoa();

        pessoa.setEndereco(endereco);
        pessoa.setCpf("123.123.123-23");

        Funcionario funcionario = new Funcionario();

        funcionario.setCpf("999.999.999-99");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.00);
        funcionario.imprime();
        endereco.imprime();
    }
}
