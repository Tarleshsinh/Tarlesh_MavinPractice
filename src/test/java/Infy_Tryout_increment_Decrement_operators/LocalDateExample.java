package Infy_Tryout_increment_Decrement_operators;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class LocalDateExample {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for their Date of Birth (DOB)
        System.out.println("Enter your Date of Birth in the format YYYY-MM-DD: ");
        String dobInput = scanner.nextLine();

        // Parse the input into a LocalDate object
        LocalDate dateOfBirth = LocalDate.parse(dobInput);

        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the age using Period
        Period age = Period.between(dateOfBirth, today);

        // Check if the person is eligible to vote
        if (age.getYears() >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            // Calculate remaining time to become eligible
            LocalDate eligibleDate = dateOfBirth.plusYears(18);
            Period timeLeft = Period.between(today, eligibleDate);

            // Display the time left
            System.out.println("You will be eligible to vote in " +
                timeLeft.getYears() + " years, " +
                timeLeft.getMonths() + " months, " +
                timeLeft.getDays() + " days.");
        }

        // Close the scanner
        scanner.close();
    }
}
