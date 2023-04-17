package academy.devdojo.maratonajava.introducao;

public class EstruturaRepeticao3 {
    // Dado o valor de um carro, descubra em quantos ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {

        double precoCarro = 79999;
        double valorParcela = 79999;
        for (int quantParcelaMax = 1; valorParcela >= 1000; quantParcelaMax++) {

            valorParcela = precoCarro/quantParcelaMax;
            if(valorParcela < 1000) continue;
             System.out.println("Seu carro custa "+precoCarro+" parcelado em: "+quantParcelaMax+"\n valor da parcela: "+valorParcela);



        }
    }
}
