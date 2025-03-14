package Infy_Tryout_increment_Decrement_operators;

abstract class Shape {
    // Abstract method that must be implemented by any subclass of Shape
    public abstract void draw();

    // Non-abstract method
    public void fill(String color) {
        System.out.println("Fill in color: " + color); // Prints the fill color
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        // Implementation of draw method specific to Circle
        System.out.println("Inside the circle class draw method");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        // Implementation of draw method specific to Square
        System.out.println("Inside the square class draw method");
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        // Create the Circle object
        Shape circle = new Circle(); // Polymorphism: Shape reference, Circle object
        circle.draw();  // Calls Circle's draw method
        circle.fill("Red");  // Calls Shape's fill method

        // Create the Square object
        Shape square = new Square(); // Polymorphism: Shape reference, Square object
        square.draw();  // Calls Square's draw method
        square.fill("Blue");  // Calls Shape's fill method
        square.fill("white");
    }
}
