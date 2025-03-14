package Infy_Tryout_increment_Decrement_operators;
// Define the Rectangle class
class Rectangle {
    // Private instance variables
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public int calculateArea() {
        return length * breadth;
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }
}

// Main class to test the Rectangle class
public class class_Initialization {
    public static void main(String[] args) {
        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Set values for length and breadth using setter methods
        rect.setLength(10);
        rect.setBreadth(5);

        // Display the dimensions
        rect.displayDimensions();

        // Calculate and display the area
        System.out.println("Area of Rectangle: " + rect.calculateArea());
    }
}