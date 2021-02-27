package main.java.tasks.day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseDateParse {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date = dateFormat.parse("04.06.2012");
        //date

        Date date1 = dateFormat.parse("07.06.2012");
        Date date2 = dateFormat.parse("06.06.2012");

        System.out.println(date1.compareTo(date2));

        int x = 3;
        Integer y = 3;

        date.getDay();
    }

    public class Ezh implements Runnable {

        @Override
        public void run() {
            System.out.println("fgfdgdfgfdg");
            boolean isOpened = false;
            while (!isOpened) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (isOpened) {
                    degas();
                }
            }
        }

        private void degas() {
        }

    }
}

