package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        int idade = 20;
        boolean isAuth = idade >= 18;
        if(!isAuth){

            System.out.println("Pode comprar");
        }
        else{
            System.out.println("Não pode comprar");
        }
        System.out.println("Fora do IF/ELSE");
    }
}
