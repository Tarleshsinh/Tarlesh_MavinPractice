package Infy_Tryout_increment_Decrement_operators;

public class Reversed_String {
    public static void main(String[] args) {
        String infy = "Infosys";
        String reversed = "";  // Store reversed string

        // Loop through the string in reverse order
        for (int a = infy.length() - 1; a >= 0; a--) {
            reversed += infy.charAt(a); // Append each character
        }

        // Print final reversed string
        System.out.println("Reversed value of Infosys: " + reversed);
        
        
        
        
        String infy1 = "Infosys";
        char[] reversed1 = new char[infy.length()]; // Create a character array to store reversed string

        // Loop to fill the array in reverse order
        for (int i = infy1.length() - 1, j = 0; i >= 0; i--, j++) {
            reversed1[j] = infy.charAt(i);
        }

        // Convert char array to string and print
        System.out.println("Reversed value of Infosys:222 " + new String(reversed1));
        
        
        
        int a = 100;
        int b= 200;
        System.out.println("Value of A:" + a + "Value of B :" + b);
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("Value of AAfter reverse :" + a + "Value of B After Reverse:" + b);
        
        int x = 20;
        int y= 30;
        System.out.println("Value of X befor convert:" + x + "Value of y: "+y);
        
        x= x^y;
        y=x^y;
        x=x^y;
        System.out.println("Value of X after convert:" + x + "Value of y: "+y);
        
        
    }
    
    }


