package academy.devdojo.maratonajava.introducao;

public class EstruturaRepeticao2 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000

        for (int i = 0; i < 100; i++) {
            boolean interval = i <= 25;
            if(interval)  System.out.println(i);
            if(!interval) break;
        }
    }
}
