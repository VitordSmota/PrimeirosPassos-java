package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
    criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
       try{
           boolean isCriado = file.createNewFile();
           System.out.println("Arquivo criado" + isCriado);
       }catch(IOException e){

           System.out.println("!Arquivo não criado !");
           e.printStackTrace();
       }

    }

}
