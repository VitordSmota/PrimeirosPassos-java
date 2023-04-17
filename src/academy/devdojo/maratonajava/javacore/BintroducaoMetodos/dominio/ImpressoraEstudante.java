package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante std){
        System.out.println(std.nome);
        System.out.println(std.sexo);
        System.out.println(std.idade);
    }
}
