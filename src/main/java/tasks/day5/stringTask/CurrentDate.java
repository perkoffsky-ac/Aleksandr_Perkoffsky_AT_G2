package tasks.day5.stringTask;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentDate {

    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar(2020, Calendar.SEPTEMBER, 19, 3, 13);
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM, yyy, H часа m минут");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}

