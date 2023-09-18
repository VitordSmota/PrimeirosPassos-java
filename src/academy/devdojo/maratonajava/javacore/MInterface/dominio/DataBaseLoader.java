package academy.devdojo.maratonajava.javacore.MInterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Chegando permissões no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro de retrieveMaxDataSize do Banco de dados");
    }
}
