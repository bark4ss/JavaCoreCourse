package localdatetime8.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class LocalDateTimeAppl {

    public static void main(String[] args) {
    //https://www.examclouds.com/java/java-core-russian/new-date-time-api
        //Get current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate specificDate = LocalDate.of(2021, Month.FEBRUARY,15);
        System.out.println("Specific date with particular data: " + specificDate);
        System.out.println(specificDate);
        //Get Date at the 01.01.1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(366);
        System.out.println("Date at the start date: " + dateFromBase);

        LocalDate date256_2017 = LocalDate.ofYearDay(2017, 256);
        System.out.println("256 day of 2017: " + date256_2017);

        boolean leapYear = dateFromBase.isLeapYear();
        System.out.println("leapYear.isLeapYear(): " + leapYear);

        //Get current time
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);


        //Get current Time with specific ZoneId
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);

        System.out.println(now1);
        System.out.println(now2);

        System.out.println(now1.isBefore(now2));
        System.out.println(now1.isAfter(now2));

        //Get current time
        LocalTime sec2000 = LocalTime.ofSecondOfDay(200);
        System.out.println("Current time sec2000: " + sec2000);

    }
}
