package lesson13.localdatetime8.period;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo4 {
    public static void main(String[] args) {
        Period period2d = Period.ofDays(3);
        Period period8d = period2d.withDays(2);
        Period period2y1m2d = period2d.withYears(2).withMonths(1);

        System.out.println(period2d);
        System.out.println(period8d);
        System.out.println(period2y1m2d);

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        //If your birthday has occurred this year already, add 1 to the year.
        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            nextBDay = nextBDay.plusYears(1);
        }
    }
}
