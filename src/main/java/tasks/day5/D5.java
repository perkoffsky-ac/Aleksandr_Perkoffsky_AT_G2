package main.java.tasks.day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class D5 {

    /**
     * @
     * @param args
     */


    public static void main(String[] args) throws ParseException {

        String mam = "мама мыла раму чисто";
        String exl = "!";
        String cr = "\r\n";

        String comb = "!\r\n";

        System.out.printf("мама%1$sмыла%1$sраму%1$sчисто%1$s", comb);

        format2(new Mysh(), new Ezh());


    }

    public static void format2(Object... args) { //можно передать любое значение а данный массив

    }

    public static void format(Object[] args) {

    }

    static class Ezh{


    }

    static class Uzh{


    }

    static class Mysh{


    }

    public class Multiply {
        public double multiply(Double a, Double b) {
            var v = a * b;
            return v;
        }
    }


}
