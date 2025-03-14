package Infy_Tryout_increment_Decrement_operators;
public class CarTravel {
    public static void main(String[] args) {
        // Given speed in km/h
        double speed = 120.0;
        
        // Time in minutes
        double timeInMinutes = 100.0;
        
        // Convert time to hours
        double timeInHours = timeInMinutes / 60.0;
        
        // Calculate distance traveled
        double distance = speed * timeInHours;
        
        // Display the result
        System.out.println("The car will travel " + distance + " kilometers in " + timeInMinutes + " minutes.");
    }
}
