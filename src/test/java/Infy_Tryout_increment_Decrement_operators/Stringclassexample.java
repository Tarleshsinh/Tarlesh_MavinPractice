package Infy_Tryout_increment_Decrement_operators;

//Class to demonstrate methods of the String class
public class Stringclassexample {
 public static void main(String[] args) {
     // Creating three instances of LocationChanger
     LocationChanger employee1 = new LocationChanger("Annabelle Michael", "BL003, Delhi, STP");
     LocationChanger employee2 = new LocationChanger("John Smith", "BL101, Trivandrum, SEZ");
     LocationChanger employee3 = new LocationChanger("Raju Ram", "BL102, Bhubaneswar, SEZ");
     
     
     // Invoking methods on employee1
     System.out.println("Employee 1:");
     employee1.welcomeEmployee();
     employee1.checkCity();
     employee1.editAddress();
     System.out.println();

     // Invoking methods on employee2
     System.out.println("Employee 2:");
     employee2.welcomeEmployee();
     employee2.checkCity();
     employee2.editAddress();
     
     System.out.println("Employee 3:");
     employee3.welcomeEmployee();
     employee3.checkCity();
     employee3.editAddress();
 }
}

//Class to handle employee location details
class LocationChanger {
 private String name;      // Employee's full name
 private String location;  // Employee's location

 // Constructor to initialize employee details
 public LocationChanger(String name, String location) {
     this.name = name;
     this.location = location;
 }

 // Method to display a welcome message using the first name
 public void welcomeEmployee() {
     String firstName = name.split(" ")[0]; // Extracting the first name
     System.out.println("Hello " + firstName);
 }

 // Method to check the city and display a specific message
 public void checkCity() {
     if (location.contains("Delhi")) {
         System.out.println("Welcome to Infy Mysore Delhiites!");
     } else if (location.contains("Trivandrum")) {
         System.out.println("Welcome to MyDC people of Trivandrum!");
     } else if (location.contains("Bhubaneswar")) {
         System.out.println("You came a long way down South! We welcome you!");
     } else {
         System.out.println("Welcome to Infosys!");		
     }
 }

 // Method to edit the address based on the current work location
 public void editAddress() {
     if (location.contains("STP")) {
         location = location.replace("STP", "SEZ"); // Changing STP to SEZ
         System.out.println("Your location has been changed from STP to SEZ.");
     } else if (location.contains("SEZ")) {
         System.out.println("Your location remains the same!");
     } else {
         System.out.println("Location information is invalid or not updated.");
     }
 }
}