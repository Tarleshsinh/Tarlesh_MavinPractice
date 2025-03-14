package Infy_Tryout_increment_Decrement_operators;

public class TryMathCube {
    public int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        TryMathCube tc = new TryMathCube();

        try {
            // Check if the correct number of arguments are passed
            if (args.length < 6) {
                System.out.println("Please provide at least 6 command-line arguments.");
            } else {
                // Parse the command-line argument (args[5] is the 6th argument)
                int num = Integer.parseInt(args[5]);

                // Call the cube method and print the result
                System.out.println("Cube of " + num + " is: " + tc.cube(num));
            }
        } catch (NumberFormatException e) {
            // Handle invalid integer input
            System.out.println("Invalid input! Please provide a valid integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle missing command-line argument
            System.out.println("No input provided! Please pass enough command-line arguments.");
        }
    }
}
