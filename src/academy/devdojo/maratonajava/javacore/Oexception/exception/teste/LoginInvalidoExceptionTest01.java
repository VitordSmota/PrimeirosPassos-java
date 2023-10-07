package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Digite o usuário: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Digite a senha");
        String senhaDigitada = teclado.nextLine();

        if(!senhaDB.equals(senhaDigitada) && !usernameDB.equals(usernameDigitado)){
            throw  new LoginInvalidoException();
        }
        if(!usernameDB.equals(usernameDigitado)){
            throw  new LoginInvalidoException("Usuário Inválido");
        }
        if(!senhaDB.equals(senhaDigitada)){
            throw  new LoginInvalidoException("Senha Inválida");
        }
        else{
            System.out.println("Banco de dados acessado, seja bem vindo "+ usernameDigitado);
        }

    }
}
