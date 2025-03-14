package Infy_Tryout_increment_Decrement_operators;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneConverter {
    public static void main(String[] args) {
        // Define the formatter for consistent output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd MMM yyyy");
        
        // Define the program time in India Time Zone
        LocalDateTime indiaLocalDateTime = LocalDateTime.of(2016, 11, 30, 18, 30);
        ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime indiaZonedDateTime = indiaLocalDateTime.atZone(indiaZoneId);

        // Convert to US Central Time (CST)
        ZoneId cstZoneId = ZoneId.of("America/Chicago");
        ZonedDateTime cstZonedDateTime = indiaZonedDateTime.withZoneSameInstant(cstZoneId);

        // Convert to UK Time
        ZoneId ukZoneId = ZoneId.of("Europe/London");
        ZonedDateTime ukZonedDateTime = indiaZonedDateTime.withZoneSameInstant(ukZoneId);

        // Convert to Australia Time
        ZoneId australiaZoneId = ZoneId.of("Australia/Sydney");
        ZonedDateTime australiaZonedDateTime = indiaZonedDateTime.withZoneSameInstant(australiaZoneId);

        // Print the results
        System.out.println("Programme time in India: " + indiaZonedDateTime.format(formatter));
        System.out.println("Programme time in US CST: " + cstZonedDateTime.format(formatter));
        System.out.println("Programme time in UK: " + ukZonedDateTime.format(formatter));
        System.out.println("Programme time in Australia: " + australiaZonedDateTime.format(formatter));
    }
}