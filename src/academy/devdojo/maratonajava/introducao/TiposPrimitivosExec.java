package academy.devdojo.maratonajava.introducao;


import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
* Prática
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
*
* Eu <nome>, morando no endereço <endereço>,
* confirmo que recebi o salário de <salario>, na data <data>
* */
public class TiposPrimitivosExec {
    public static void main(String[] args) {
        String nome = "José Ferreira Mota";
        String endereco = "rua  Ferreira, 1212,  Branca";
        Double salario = 2100.90;
        String data = "10/10/10";
        String relatorio ="Eu "+nome+", morando no endereço "+endereco+",\n" +
                "confirmo que recebi o salário de "+salario+", na data "+data+"";

        System.out.println(relatorio);

    }
}



