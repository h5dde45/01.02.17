package sl.t9;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class FormatterD {
    public static void main(String[] args) {

        Formatter f=new Formatter();
        f.format(" =%s =%S","qwe","asd");
        System.out.println(f);

        f=new Formatter();
        f.format(" =%x =%o%n=%1$#x =%2$#o ",11,11);
        System.out.println(f);

        Calendar calendar=Calendar.getInstance();
        f=new Formatter();
        f.format(
                Locale.ENGLISH,
                "%1$tr, %n%1$tH:%1$tM, %n" +
                "%1$tB %1$tb %1$tm ",calendar);
        System.out.println(f);

    }
}
