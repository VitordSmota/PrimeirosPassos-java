package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeDefault = Locale.getDefault();
        NumberFormat[] nfa = new NumberFormat[4];

       nfa[0] = NumberFormat.getInstance();
       nfa[1] = NumberFormat.getInstance(localeIT);
       nfa[2] = NumberFormat.getInstance(localeJP);
       nfa[3] = NumberFormat.getInstance(localePT);

       double valor = 10_000_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
