package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        //pt-BR
        Locale localItaly = new Locale("it","IT");
        Locale localFR = new Locale("fr","MF");
        Locale localIN = new Locale("hi","IN");
        Locale localJP = new Locale("ja","JP");
        Locale localNL = new Locale("nl","NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localFR);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localIN);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localJP);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localNL);

        System.out.println("Italy: "+ df1.format(calendar.getTime()));
        System.out.println("França: "+ df2.format(calendar.getTime()));
        System.out.println("India: "+ df3.format(calendar.getTime()));
        System.out.println("Japão: "+ df4.format(calendar.getTime()));
        System.out.println("Holanda: "+ df5.format(calendar.getTime()));

        System.out.println(localItaly.getDisplayCountry());
        System.out.println(localNL.getDisplayCountry());
        System.out.println(localJP.getDisplayCountry());

    }
}
