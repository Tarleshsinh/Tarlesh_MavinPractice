package Infy_Tryout_increment_Decrement_operators;

public class Shiftoperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		int c = a<<b;
		System.out.println("a<<b:"+c);
		System.out.println("Binary Value of 10 is:" + Integer.toBinaryString(10));
		System.out.println("Binary Value of 2 is" +Integer.toBinaryString(2));
		System.out.println("Binary Value of 40 is:"+Integer.toBinaryString(40));
		int d = a>>b;
		System.out.println("a>>b:"+d);
		System.out.println(++c);
		System.out.println(--c);
		System.out.println(--c);
		System.out.println(++c);
		
		

	}

}
