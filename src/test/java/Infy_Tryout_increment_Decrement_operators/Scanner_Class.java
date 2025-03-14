package Infy_Tryout_increment_Decrement_operators;

import java.util.Scanner;

public class Scanner_Class {

    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter roll number
        System.out.println("Enter rollNo");
        int rollno = sc.nextInt();  // Read an integer for roll number
        
        // Prompt the user to enter the name
        System.out.println("Enter the name");
        String name = sc.next();  // Read a string for name
        
        // Print the entered roll number and name
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        
        // Close the scanner object to avoid resource leak
        sc.close();
    }
}

