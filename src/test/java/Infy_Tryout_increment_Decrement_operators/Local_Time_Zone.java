package Infy_Tryout_increment_Decrement_operators;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Local_Time_Zone {

	public static void main(String[] args) {
		System.out.println("*******LocalDate********");
		LocalDateTime dateTime= LocalDateTime.now();
		System.out.println("Date and Time:" + dateTime);//The time being returned here is according to the region/locate/zone in which the application is hosted.
		System.out.println(dateTime.minusDays(3));// Substracting 3 days and output time is in ETC
		
		System.out.println("***********ZoneDateTime*******");
		ZonedDateTime zoneDateTime = ZonedDateTime.now();
		System.out.println("Date and Time at current Zone:" + zoneDateTime);//The time being returned here is according to the region/locate/zone in which application is hosted.
		System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Toronto")));

	}

}
