package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome= "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo= 'M';


        estudante02.nome= "Sakura";
        estudante02.idade = 16;
        estudante02.sexo= 'F';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
