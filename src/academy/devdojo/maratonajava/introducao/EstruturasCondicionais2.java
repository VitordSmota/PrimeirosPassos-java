package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        // idade < 15 (Categoria infantil)
        // idade >= 15 && idade < 18 (Categoria juvenil)
        // idade >= 18 (Categoria adulto)

        int idade = 15;



        String categoria = idade < 15
                ? "Categoria Infantil"
                : idade >= 15 && idade < 18
                ? "Categoria Juvenil"
                : "Categoria Adulto";
        System.out.println(categoria);
    }
}
