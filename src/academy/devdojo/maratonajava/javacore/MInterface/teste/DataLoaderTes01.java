package academy.devdojo.maratonajava.javacore.MInterface.teste;

import academy.devdojo.maratonajava.javacore.MInterface.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.MInterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.MInterface.dominio.FileLoader;

import java.io.File;

public class DataLoaderTes01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
        dataBaseLoader.remove();
        fileLoader.remove();
        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();
    }
}
