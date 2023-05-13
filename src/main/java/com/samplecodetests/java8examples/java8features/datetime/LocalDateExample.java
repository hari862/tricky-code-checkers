package com.samplecodetests.java8examples.java8features.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

// Examples understood from https://www.baeldung.com/java-8-date-time-intro
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Java.util.date = "+ new Date() + "\nJava.time.date = " + localDate);

        LocalDate may52023 = LocalDate.of(2023, 7, 5);
        System.out.println(may52023);

        LocalDate april22of2023 = LocalDate.parse("2023-04-22");
        System.out.println(april22of2023);

        april22of2023 = LocalDate.parse("2023-22-04",
                DateTimeFormatter.ofPattern("yyyy-dd-MM"));
        System.out.println(april22of2023);

        // ISO_DATE(2011-Dec-03) = 2011-12-03
        LocalDate march22of2023 = LocalDate.parse("2023-03-22", DateTimeFormatter.ISO_DATE);
        System.out.println(march22of2023);

        LocalDate today = LocalDate.now(); // 2023-05-07
        LocalDate tomorrow = LocalDate.now().plusDays(1); // 2023-05-08
        LocalDate yesterday = LocalDate.now().minus(Period.ofDays(1)); // 2023-05-06
        LocalDate yesterday1 = LocalDate.now().minus(1, ChronoUnit.DAYS); // 2023-05-06
        LocalDate nextMonthSameDay = LocalDate.now().plusMonths(1); // 2023-06-07
        LocalDate nextMonthSameDay1 = LocalDate.now().plus(1, ChronoUnit.MONTHS); // 2023-06-07

        System.out.println(today + " " + tomorrow + " " + yesterday
                +"\n " + yesterday1 + " " + nextMonthSameDay + " " + nextMonthSameDay1);

        System.out.println(LocalDate.EPOCH + " " + LocalDate.MAX + " " + LocalDate.MIN);
        // 1970-01-01 +999999999-12-31 -999999999-01-01

        System.out.println(today.getDayOfMonth() + " " + today.getDayOfWeek() + " " + today.getDayOfYear()
                + " " + today.getMonth() + " " + today.getYear());
    }

}
