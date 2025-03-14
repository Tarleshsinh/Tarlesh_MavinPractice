package Infy_Tryout_increment_Decrement_operators;

import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Date_Local_Time {

	public static void main(String[] args) {
		System.out.println("*****LocalDate******");
		LocalDate registartionDate = LocalDate.now();//Creates an Object with system Date
		System.out.println("Today's date(system date):" + registartionDate);
		LocalDate lastDate = registartionDate.plusDays(1);//Ading 3 days to the registartion date
		System.out.println("Adding 3 Days:" + lastDate);
		if (LocalDate.now().isBefore(lastDate)) {
			System.out.println("Please take the assesment as soon as possible");
		}
		
		System.out.println();
		System.out.println("*******LocalTime******");
		LocalTime startTime = LocalTime.now(); // Creates an object with system time
		System.out.println("Start Time:" +startTime); // The time being returned here is according to the region/local/zone in which the application is hosted
		
		LocalTime endTime = startTime.plusHours(1); //Adding 1 hour
		System.out.println("End Time:" + endTime);//The time being returned here is according to the region/local/zone in which the application is hosted
		
		LocalTime current = LocalTime.now();
		int hour = current.getHour();
		int minute = current.getMinute();
		int second = current.getSecond();
		System.out.println("Hour:" + hour + "Minute: " + minute + "Second:" + second); // The time being returned here is according to the region/local/zone in which the application is hosted
		

	}

}
