package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salario = null;
    private double media = 0;
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salario != null) {
            for (double salario : salario) {
                System.out.print(salario + " ");
            }
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){

        if(salario != null) {
            for (double salario : salario) {
                media += salario;
            }

        System.out.println("\n"+media/ salario.length);
    }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
