package Infy_Tryout_increment_Decrement_operators;

// Enum representing different pizza sizes with their respective values
enum PizzaSizes {
    SMALL(30), MEDIUM(40), LARGE(50); // Enum constants with values

    private int noOfPizza; // Private field to store the value associated with each pizza size

    // Constructor for enum constants
    PizzaSizes(int noOfPizza) {
        this.noOfPizza = noOfPizza;
    }

    // Getter method to retrieve the number of pizzas associated with a size
    public int getNoOfPizza() {
        return noOfPizza;
    }
}

// Class representing pizza with a method for availability
class PizzaAvailability {
    // Method to check availability of a particular pizza size
    public void availabilityTry(PizzaSizes p) {
        // Prints the number of pizzas available for the given size
        System.out.println(p.getNoOfPizza());
    }
}

// Main class to demonstrate the use of the enum and Pizza class
class EnumDemo {
    public static void main(String[] args) {
        // Creating an instance of the Pizza class
        PizzaAvailability obj = new PizzaAvailability();

        // Checking availability for the MEDIUM pizza size
        obj.availabilityTry(PizzaSizes.MEDIUM);

        // Looping through all the values of the PizzaSizes enum
        for (PizzaSizes psize : PizzaSizes.values()) {
            // Printing each pizza size with its associated value
            System.out.println("PizzaSize: " + psize.name() + " Value: " + psize.getNoOfPizza());

            // Printing the ordinal (index) of the enum constant
            System.out.println(psize + " " + psize.ordinal());

            // Printing whether the enum constant is equal to "SMALL"
            System.out.println(psize + " == SMALL: " + (psize == PizzaSizes.SMALL));
        }
    }
}
