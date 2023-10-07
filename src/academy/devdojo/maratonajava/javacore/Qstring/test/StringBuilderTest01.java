package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Vitor Mota";
        nome.concat(" Devdojo_MaratonaJava");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Vitor Mota");
        System.out.println(sb);
        sb.append(" Devdojo_MaratonaJava").append(" Academy");
        sb.reverse();
        sb.reverse();

        System.out.println(sb);




    }
}
