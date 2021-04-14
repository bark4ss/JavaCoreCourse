package lesson13.localdatetime8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeAppl {

    public static void main(String[] args) {

        //Get current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate specificDate = LocalDate.of(2021, Month.FEBRUARY,15);
        System.out.println("Specific date with particular data: " + specificDate);

        //Get Date at the 01.01.1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(366);
        System.out.println("Date at the start date: " + dateFromBase);

        LocalDate date256_2017 = LocalDate.ofYearDay(2017, 256);
        System.out.println("256 day of 2017: " + date256_2017);

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

        //Get current time
        LocalTime sec2000 = LocalTime.ofSecondOfDay(2000);
        System.out.println("Current time sec2000: " + sec2000);

    }
}
