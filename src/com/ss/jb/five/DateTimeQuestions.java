package com.ss.jb.five;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;

public class DateTimeQuestions {

//    Which class would you use to store your birthday in years, months, days, seconds, and nanoseconds?
//      LocalDateTime. If a particular time zone was taken into consideration: ZoneDateTime

//    Given a random date, how would you find the date of the previous Thursday?
//      TemporalAdjusters!
    public static void findThursday() {
        LocalDate localDate = LocalDate.now();
        LocalDate previousThursday = localDate.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(previousThursday);
    }

//    What is the difference between a ZoneId and a ZoneOffset?
//      ZoneId- a class that tracks an offset of Greenwich/UTC. Not absolute.
//          Uses ZoneRules to determine the desired offset
//      ZoneOffset- a class that tracks an absolute offset of Greenwich/UTC

//    How would you convert an Instant to a java.time.ZonedDateTime? How would you convert a ZonedDateTime to an java.time.Instant?
//
    public static void zoneDateTimeInstantExample() {
        // ZoneDateTime to Instant:
        ZonedDateTime myZoneDateTime = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ZoneDateTime to Instant: " + myZoneDateTime);
        // Instant to ZoneDateTime:
        Instant myInstant = ZonedDateTime.now().toInstant();
        System.out.println("Instant to ZoneDateTime: " + myInstant);

    }
//    Write an example that, for a given year, reports the length of each month within that year.
//
    public static void lengthOfMonths(int year) {
        System.out.println("In the year " + year);
        for (Month month : Month.values()) {
            YearMonth yearMonth = YearMonth.of(year, month);
            System.out.println(month + " had " + yearMonth.lengthOfMonth() + "days.");
        }
    }
//    Write an example that, for a given month of the current year, lists all of the Mondays in that month.
//
    public static void mondaysInTheMonth(Month month) {
        LocalDate date = Year.now().atMonth(month).atDay(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month monthCheck = date.getMonth();
        while (monthCheck == month) {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            monthCheck = date.getMonth();
        }

    }
//    Write an example that tests whether a given date occurs on Friday the 13th.

    public static Boolean fridayTheThirteenth(TemporalAccessor date) {
        return ((date.get(ChronoField.DAY_OF_MONTH) == 13) &&
                (date.get(ChronoField.DAY_OF_WEEK) == 5));
    }
}
