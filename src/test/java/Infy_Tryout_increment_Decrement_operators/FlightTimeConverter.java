package Infy_Tryout_increment_Decrement_operators;

	import java.time.LocalDateTime;
	import java.time.ZoneId;
	import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Scanner;

	public class FlightTimeConverter {
	    public static void main(String[] args) {
	        // Define the formatter for input and output
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");

	        // Flight times in IST
	        LocalDateTime departureTimeIST = LocalDateTime.of(2016, 11, 30, 21, 30, 0);
	        LocalDateTime arrivalTimeIST = LocalDateTime.of(2016, 12, 1, 6, 0, 0);

	        ZoneId indiaZoneId = ZoneId.of("Asia/Kolkata");
	        ZonedDateTime departureZonedIST = departureTimeIST.atZone(indiaZoneId);
	        ZonedDateTime arrivalZonedIST = arrivalTimeIST.atZone(indiaZoneId);

	        // Prompt user for the desired time zone
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Select the zone to display flight times:");
	        System.out.println("1. US CST");
	        System.out.println("2. UK");
	        System.out.println("3. Australia");
	        int choice = scanner.nextInt();

	        ZoneId selectedZone = null;
	        switch (choice) {
	            case 1:
	                selectedZone = ZoneId.of("America/Chicago"); // CST
	                break;
	            case 2:
	                selectedZone = ZoneId.of("Europe/London"); // UK
	                break;
	            case 3:
	                selectedZone = ZoneId.of("Australia/Sydney"); // Australia
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        // Convert departure and arrival times to the selected time zone
	        ZonedDateTime departureInSelectedZone = departureZonedIST.withZoneSameInstant(selectedZone);
	        ZonedDateTime arrivalInSelectedZone = arrivalZonedIST.withZoneSameInstant(selectedZone);

	        // Display results
	        System.out.println("Flight Times in Selected Zone:");
	        System.out.println("Departure Time: " + departureInSelectedZone.format(formatter));
	        System.out.println("Arrival Time: " + arrivalInSelectedZone.format(formatter));

	        scanner.close();
	    }
	}