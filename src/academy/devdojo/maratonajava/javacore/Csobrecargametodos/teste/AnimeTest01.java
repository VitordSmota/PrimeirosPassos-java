package academy.devdojo.maratonajava.javacore.Csobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime onePiece = new Anime("Jujustsu Kaisen","Shonen",1049,"AA","Production");


        System.out.println(onePiece.getEpisodios());
        System.out.println(onePiece.getTipo());
        System.out.println(onePiece.getNome());
        System.out.println(onePiece.getGenero());
    }
}
