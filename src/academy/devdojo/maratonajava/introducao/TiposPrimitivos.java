package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade =(int) 10000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean isTrue = true;
        boolean isFalse = false;
        char caractere = '\u0041';  //caractere é aspas simples.
        String nome = "Goku da Silva Ayumi Jun Mota Obara Ramos Ferreira";   // aspas duplas
        System.out.println("A idade é "+idade+" anos"); // Ctrl + D duplica a linha
        System.out.println(isTrue);
        System.out.println(caractere);
        System.out.println(nome);
    }
}
