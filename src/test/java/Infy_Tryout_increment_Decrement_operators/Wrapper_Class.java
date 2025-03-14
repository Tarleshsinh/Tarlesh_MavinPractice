package Infy_Tryout_increment_Decrement_operators;

	// Demonstration of Wrapper Classes in Java
	class Wrapper_Class {
	    public static void main(String[] args) {
	       
	        // Example of creating an Integer object and converting to primitive
	        Integer num1 = Integer.valueOf(2345); // Creating Integer object using valueOf()
	        int billNo = num1.intValue();        // Converting Integer object to primitive int
	        System.out.println(billNo);          // Output: 2345

	        // Example of creating a Double object and converting to primitive
	        Double num2 = Double.valueOf(67.0);  // Creating Double object using valueOf()
	        double avg = num2.doubleValue();    // Converting Double object to primitive double
	        System.out.println(avg);            // Output: 67.0

	        // Autoboxing: Converting primitive to Wrapper automatically
	        int a = 30;      // Primitive int
	        Integer b = a;    // Autoboxing: Primitive int to Integer object

	        // Unboxing: Converting Wrapper to primitive automatically
	        int d = b;        // Unboxing: Integer object to primitive int

	        // Converting String to Primitive type
	        String num3 = "2345";                      // String representing a number
	        int billNo1 = Integer.parseInt(num3);      // Parsing String to int
	        System.out.println(billNo1);                // Output: 2345

	        double avg1 = Double.parseDouble(num3);    // Parsing String to double
	        System.out.println(avg1);                  // Output: 2345.0

	        // Converting String to Wrapper Class
	        String num4 = "2345";                      // String representing a number
	        int billNo2 = Integer.parseInt(num4);      // Parsing String to int
	        System.out.println(billNo2);                // Output: 2345

	        Integer num5 = Integer.valueOf(num4);      // Converting String to Integer object
	        System.out.println(num5);                  // Output: 2345

	        // Example of creating Integer object using new keyword (Deprecated in Java 9+)
	        int billNo4 = 2345;                        // Primitive int
	        Integer num6 = new Integer(billNo4);        // Explicitly creating Integer object
	        int no = num6.intValue();                  // Converting Integer object to int
	        System.out.println(no);                    // Output: 2345
	    }
	}