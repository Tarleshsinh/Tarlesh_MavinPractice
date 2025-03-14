package Infy_Tryout_increment_Decrement_operators;

public class Exception_Handling {
    
    // Method to perform division
    // This is a simple method that divides num by divisor.
    // However, it can throw an ArithmeticException if divisor is zero.
    public static void divide(int num, int divisor) {
        try {
            // Trying to divide, which can potentially throw an ArithmeticException
            int val = num / divisor; 
            System.out.println(val);
        } catch (ArithmeticException e) {
            // Handling unchecked exception (ArithmeticException is an unchecked exception)
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // The finally block is always executed, even if there is an exception
            System.out.println("Execution of divide method completed.");
        }
    }
    
    public static void main(String[] args) {
        // Example of Unchecked Exception: ArithmeticException
        // This occurs when you try to divide by zero (which is illegal)
        System.out.println("Attempting to divide by zero...");
        divide(10, 0);
        
        // Example of Checked Exception: FileNotFoundException
        // A checked exception is one that must be either handled or declared in the method signature.
        // Unchecked exceptions (like ArithmeticException) do not require explicit handling.
        
        try {
            // This code is an example of a checked exception scenario, but it is commented out here
            // since we aren't actually performing file operations.
            // This would throw FileNotFoundException (a checked exception) if the file is not found.
            // throw new java.io.FileNotFoundException("File not found");
            
            // Uncomment the above line to see how a checked exception is handled using a try-catch block.
            
        } finally {
            // This block will execute after the try-catch block regardless of whether an exception occurred
            System.out.println("Checked exception handling demonstration completed.");
        }
        
        // Example of NullPointerException (Unchecked Exception)
        // This is another common unchecked exception.
        try {
            String str = null;
            // Attempting to call a method on a null object reference will throw NullPointerException
            System.out.println(str.length());
        } catch (NullPointerException e) {
            // Handling the NullPointerException
            System.out.println("Error: Attempted to call a method on a null object!");
        }
        
        // Example of ArrayIndexOutOfBoundsException (Unchecked Exception)
        // This occurs when you try to access an index that is out of bounds in an array.
        try {
            int[] arr = new int[5];
            // Accessing an invalid index will throw ArrayIndexOutOfBoundsException
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index out of bounds!");
        }
        
        // Example of a custom exception handling (Unchecked exception)
        try {
            // Simulating a custom exception
            throw new IllegalArgumentException("This is a custom unchecked exception");
        } catch (IllegalArgumentException e) {
            // Handling the custom unchecked exception
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        
        // Example of a custom checked exception
        try {
            // Simulating a custom checked exception (we have to declare it in the method signature)
            throw new MyCheckedException("This is a custom checked exception");
        } catch (MyCheckedException e) {
            // Handling the custom checked exception
            System.out.println("Caught custom checked exception: " + e.getMessage());
        }
    }
    
    // A custom checked exception class
    static class MyCheckedException extends Exception {
        public MyCheckedException(String message) {
            super(message);  // Passing the message to the parent Exception class
        }
    }
}
