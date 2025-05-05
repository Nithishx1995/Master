import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class SecondFriday {
    public static void main(String[] args) {
        Locale lang=Locale.CHINESE;
        String word="I Love JAVA";

        LocalDate today= LocalDate.now();
        LocalDate nextMonth= today.plusMonths(2).with(TemporalAdjusters.firstDayOfMonth());
        LocalDate secondFridayOfMonth = nextMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY));

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//        SimpleDateFormat sf= new SimpleDateFormat();
        System.out.println(formatter.format(secondFridayOfMonth));

    }
}
