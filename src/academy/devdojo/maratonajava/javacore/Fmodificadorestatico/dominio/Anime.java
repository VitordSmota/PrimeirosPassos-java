package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

   static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[99];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){

        this.nome = nome;
    }
    public Anime(){
        System.out.println(episodios);
        for (int episodio:
        Anime.episodios) {

            System.out.print(episodio+" ");

        }
        System.out.println();
    }


    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
