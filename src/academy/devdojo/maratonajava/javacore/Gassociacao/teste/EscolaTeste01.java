package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konoha", professores );

        escola.imprime();
    }
}
