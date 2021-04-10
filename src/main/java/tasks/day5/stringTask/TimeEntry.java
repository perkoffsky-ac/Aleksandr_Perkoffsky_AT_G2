package tasks.day5.stringTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeEntry {
    public static void main(String[] args) throws ParseException {

        String dateEntry = "22.00 07.09.2020";  // Start date
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        Date date = dateFormat.parse(dateEntry);
        SimpleDateFormat newDate = new SimpleDateFormat("MMMM, dd, yyyy HH:mm");
        System.out.println(newDate.format(date));
    }
}
