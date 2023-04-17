package academy.devdojo.maratonajava.introducao;

public class Arrays2 {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Luffky";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
        nomes = new String[5]; // fazendo referência a um novo espaço na memória e perdendo a antiga referência
        System.out.println(nomes);
    }
}
