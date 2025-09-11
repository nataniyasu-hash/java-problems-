//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import   java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Duration;
import  java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
LocalDate date= LocalDate.of(2025,8,07);
System.out.println(date);

LocalTime time = LocalTime.of (11,10,30);
System.out.println(time);

 LocalDateTime ltd = LocalDateTime.now ();
 LocalDateTime ltd2 = ltd.plusMonths(2). plusDays(5).plusMinutes(24);
 System.out.println(ltd.isAfter(ltd2));
 System.out.println(Duration.between(ltd, ltd2).toHours());
 System.out.println(ltd2);

        DateTimeFormatter tag = DateTimeFormatter.ofPattern (" EE dd MMM YYYY  H:m:s").withLocale(Locale.US);
        System.out.println(tag.format(ltd) );


    }
}