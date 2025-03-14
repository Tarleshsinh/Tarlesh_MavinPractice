package Infy_Tryout_increment_Decrement_operators;

//User-defined exception class that extends Exception
class MyDIVExceptionhandling extends Exception {

  // Constructor that takes a message to describe the exception
  public MyDIVExceptionhandling(String message) {
      super(message);  // Pass the message to the parent Exception class
  }
}

//Class demonstrating the handling of user-defined exceptions
class Custom_Exception_Handling {

  // Method that performs division and throws MyDIVException if divisor is zero
  public static void divide(int x, int y) throws MyDIVExceptionhandling {
      if (y == 0) {
          throw new MyDIVExceptionhandling("The divisor should not be zero");
      }
      int z = x / y;
      System.out.println("Result: " + z);
  }

  public static void main(String[] args) {
      try {
          // Calling the divide method with zero as the divisor
          divide(10, 0);
      } catch (MyDIVExceptionhandling e) {
          // Catch the user-defined exception and print the message
          System.out.println("Exception caught: " + e.getMessage());
      }
  }
}
