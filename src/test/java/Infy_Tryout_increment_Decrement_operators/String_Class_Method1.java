package Infy_Tryout_increment_Decrement_operators;

public class String_Class_Method1 {

	public static void main(String[] args) {
		String s1 = "   Infosys   ";
		String s2= "Limited";
		
		System.out.println(s1.trim());
		
		System.out.println(s2.length());
		
		String car = "BMW Ford Mercedec";
		String [] arr = car.split(" ");
		//for loop to print 
		
		for (String c: arr) {
			System.out.println(c);
		}
 
	}

}
