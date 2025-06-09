package org.example.dates;

import java.time.*;

public class WorkingWithDates {
    // Working with Dates
    LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(now.getMonth());
//        System.out.println(now.getDayOfYear());
//        System.out.println(now.getDayOfWeek());
//        System.out.println(now.getHour());
//        System.out.println(now.getMinute());
//        System.out.println(now.getSecond());
//        System.out.println(now.minusHours(5));


    // date
    LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        System.out.println(localDate.getMonth());
//        System.out.println(localDate.getDayOfYear());
//        System.out.println(localDate.getDayOfWeek());

    LocalDateTime someDate =  LocalDateTime.of(
            2000,
            Month.DECEMBER,
            1,
            14,
            55
    );
//        System.out.println(someDate);

    LocalDate someDate2 =  LocalDate.of(
            2000,
            Month.DECEMBER,
            1
    );

//        System.out.println(someDate2);

    LocalTime someTime =  LocalTime.of(
            12, 55,55
    );

//        System.out.println(someTime);
// ZoneIds
LocalDateTime currentZoneId = LocalDateTime.now(ZoneId.of("Europe/Athens"));
//        System.out.println(currentZoneId);

//    for (String zone: ZoneId.getAvailableZoneIds()) {
//        System.out.println(zone);
//    }


    // ZoneDateTime
//        System.out.println(LocalDateTime.now());
//        System.out.println(ZonedDateTime.now());
//        System.out.println(Instant.now());

}
