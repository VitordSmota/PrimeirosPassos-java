package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador10 = new Jogador("Pelé");
        Jogador jogador09 = new Jogador("Ronaldo");
        Jogador jogador11 = new Jogador("Ronaldinho Gaúcho");

        Jogador[] jogadores = {jogador10, jogador09, jogador11};

        for ( Jogador jogador: jogadores
             ){
            jogador.imprime();

        }
    }
}
