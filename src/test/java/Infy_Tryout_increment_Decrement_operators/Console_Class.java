package Infy_Tryout_increment_Decrement_operators;

import java.util.Scanner;

public class Console_Class {

    public static void main(String[] args) {
        // Scanner class demo (works in both IDE and terminal)
        Scanner scanner = new Scanner(System.in);
        
        // Read name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);
        
        // Read username
        System.out.println("Enter username:");
        String user = scanner.nextLine();
        
        // Read password (with masking using Scanner's nextLine())
        System.out.println("Enter Password:");
        String pwd = scanner.nextLine();  // Note: Password won't be masked with Scanner
        
        // Displaying entered details
        System.out.println("Username: " + user);
        System.out.println("Password: " + pwd);
        
        scanner.close(); // Close the scanner to avoid resource leak
    }
}
