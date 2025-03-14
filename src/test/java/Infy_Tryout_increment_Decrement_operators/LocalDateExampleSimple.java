package Infy_Tryout_increment_Decrement_operators;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateExampleSimple {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's Date of Birth
        System.out.println("Enter your Date of Birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();

        // Convert input into a LocalDate object
        LocalDate dateOfBirth = LocalDate.parse(dobInput);

        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the age in years
        int age = today.getYear() - dateOfBirth.getYear();
        
        System.out.println("This is the age of person: " + age);

        // Adjust the age if the birthday hasn't occurred this year yet
        if (today.isBefore(dateOfBirth.plusYears(age))) {
            age--;
        }

        // Check if eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote. You will be eligible in " + (18 - age) + " years.");
        }

        // Close the scanner
        scanner.close();
    }
}