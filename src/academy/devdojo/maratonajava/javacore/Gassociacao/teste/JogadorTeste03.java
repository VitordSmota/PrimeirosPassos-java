package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador1 = new Jogador("Pelé");
        Jogador[] jogadores = {jogador, jogador1};
        Time time = new Time("CBF");

        jogador.setTime(time);
        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----- Jogador -----");

        jogador.imprime();
        jogador1.imprime();

        System.out.println("------- Time --------");

        time.imprime();

    }
}
