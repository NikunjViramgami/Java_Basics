import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class calendar {
    public static void main(String[] args) {
        // Calendar c =  Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone().getID());
        // System.out.println(c.getTime());
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println(c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.MINUTE));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        // GregorianCalendar g = new GregorianCalendar();
        // System.out.println(g.isLeapYear(2020));

        // LocalTime lt = LocalTime.now();
        // System.out.println(lt);

        // LocalDate ld = LocalDate.now();
        // System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dft = DateTimeFormatter.ofPattern("|dd-MM-YYYY -- E H:m a|");
        DateTimeFormatter df1 = DateTimeFormatter.BASIC_ISO_DATE;

        String mydate = ldt.format(dft);
        System.out.println(mydate);
        // String mydate = ldt.format(df1);
        // System.out.println(mydate);


        }
}
