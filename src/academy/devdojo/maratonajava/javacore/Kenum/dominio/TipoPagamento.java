package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 10/100;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 05/100;
        }
    };

    public abstract double calcularDesconto(double valor);
}