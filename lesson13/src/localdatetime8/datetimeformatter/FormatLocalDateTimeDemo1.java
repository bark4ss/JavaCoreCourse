package localdatetime8.datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatLocalDateTimeDemo1 {
    public static void main(String[] args) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("LLL d, yy HH:mm:ss");
        //https://www.examclouds.com/ru/java/java-core-russian/format-date-java8
        LocalDateTime localDateTime = LocalDateTime.parse("Sep 5, 18 12:10:56", formatter1);
        System.out.println(localDateTime);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate localDate = LocalDate.parse("May 5, 2018", formatter2);
        System.out.println(localDate);
    }
}
