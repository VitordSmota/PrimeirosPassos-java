package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);

        funcionario.setSalario(new double[]{1200,987.32,2000});
        funcionario.imprime();
        System.out.println("Media" + funcionario.getMedia());
    }
}
