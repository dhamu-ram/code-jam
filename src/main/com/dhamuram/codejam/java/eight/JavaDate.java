package com.dhamuram.codejam.java.eight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class JavaDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 12, 10);
        System.out.println("Local Data : " + localDate);
        System.out.println("Local Data Start of the Day : " + localDate.atStartOfDay());
        System.out.println("Local Data Start of the Day UTC : " + localDate.atStartOfDay(ZoneId.of("UTC")));
        System.out.println("Local Data Start of the Day GMT : " + localDate.atStartOfDay(ZoneId.of("GMT")));

        System.out.println("Local Data : " + LocalDate.now());
        System.out.println("Local Time : " + LocalTime.now());
        System.out.println("Local Data Time : " + LocalDateTime.now());
        System.out.println("Local Data Time : " + LocalDateTime.now().atZone(ZoneId.of("-5")));
    }
}
