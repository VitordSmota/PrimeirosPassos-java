package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        double salario = 1000;

        // condição ? true : false

        String  resultado = salario > 5000
                ? "Eu vou doar 500 pro DevDojo"
                :"Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);

    }
}
