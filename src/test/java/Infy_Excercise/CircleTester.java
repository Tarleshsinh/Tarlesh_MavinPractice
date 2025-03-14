package Infy_Excercise;

class Circle {
    private float radius;
    private static final float PI = 3.14f;

    // Default constructor
    public Circle() {
        this.radius = 0.0f;
    }

    // Parameterized constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public float calculateArea() {
        return PI * radius * radius;
    }

    // Override equals method to compare circles by radius
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Math.abs(this.radius - circle.radius) < 0.0001; // Handling floating-point precision
    }

    // Override hashCode to maintain contract with equals
    @Override
    public int hashCode() {
        return Float.hashCode(radius);
    }

    // Override toString to display circle details
    @Override
    public String toString() {
        return "The radius is " + radius + " and the area is " + calculateArea();
    }
}

// Tester class
public class CircleTester {
    public static void main(String[] args) {
        // Test Case 1: When circles are equal
        Circle circle1 = new Circle(10.0f);
        Circle circle2 = new Circle(10.0f);

        if (circle1.equals(circle2)) {
            System.out.println("The two circles are equal");
            System.out.println(circle1);
        } else {
            System.out.println("The two circles are not equal");
        }

        // Test Case 2: When circles are different
        Circle circle3 = new Circle(20.0f);
        Circle circle4 = new Circle(20.0f);

        if (circle3.equals(circle4)) {
            System.out.println("The two circles are equal");
            System.out.println(circle3);
        } else {
            System.out.println("The two circles are not equal");
        }
    }
}
