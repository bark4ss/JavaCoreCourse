package localdatetime8.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateTimeDemo1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM d, yy HH:mm:ss");
        //https://www.examclouds.com/ru/java/java-core-russian/format-date-java8
        LocalDateTime localDateTime = LocalDateTime.parse("02 5, 18 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("M d, yyyy", Locale.US);
        LocalDate localDate = LocalDate.parse("1 5, 2018", formatter2);
        System.out.println(localDate);

        DateTimeFormatter specificFormat = DateTimeFormatter.ofPattern("EE: yyyy-MMM-dd | HH-mm-ss",Locale.US);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(specificFormat));
    }
}
