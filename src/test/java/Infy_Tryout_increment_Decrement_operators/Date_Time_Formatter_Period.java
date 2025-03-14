package Infy_Tryout_increment_Decrement_operators;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date_Time_Formatter_Period {

    public static void main(String[] args) {
        // Using Period to calculate the difference between two dates
        System.out.println("**********Period*****");
        System.out.println(Period.between(LocalDate.now(), LocalDate.of(2025, 01, 21)));
        
        // Using Duration to calculate the difference between two times
        System.out.println("******Duration******");
        System.out.println(Duration.between(LocalTime.now(), LocalTime.of(5, 15)));
        
        // DateTimeFormatter examples
        System.out.println("******DateTimeFormatter****");
        
        // Using BASIC_ISO_DATE format
        DateTimeFormatter f = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(LocalDate.now().format(f));
        
        // Correcting the date format pattern
        f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.now().format(f));
        
        // Using a Locale to format date-time (in German Locale)
        f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("de"));
        System.out.println(LocalDateTime.now().format(f));

        // Using ZonedDateTime to get time in different time zones
        System.out.println("**********Time in Different Zones**********");
        
        // India Standard Time (Asia/Kolkata)
        ZonedDateTime indiaTime = ZonedDateTime.now(java.time.ZoneId.of("Asia/Kolkata"));
        System.out.println("India Time (IST): " + indiaTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        // England Time (Europe/London)
        ZonedDateTime englandTime = ZonedDateTime.now(java.time.ZoneId.of("Europe/London"));
        System.out.println("England Time (GMT): " + englandTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        
        // Toronto Time (America/Toronto)
        ZonedDateTime torontoTime = ZonedDateTime.now(java.time.ZoneId.of("America/Toronto"));
        System.out.println("Toronto Time (EST): " + torontoTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
