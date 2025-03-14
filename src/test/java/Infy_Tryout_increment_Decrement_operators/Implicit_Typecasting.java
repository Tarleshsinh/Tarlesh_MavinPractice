package Infy_Tryout_increment_Decrement_operators;

public class Implicit_Typecasting {

	public static void main(String[] args) {
		
		int i = 300;
		long l = i;
		float f = l;
		
		int a = 5;
		int b = 2;
		float c = a/b;
		float d = (float)a/b;
		
		System.out.println("The respective value of int i, long l and float are");
		System.out.println("i:" +i);
		System.out.println("l:" +l);
		System.out.println("f:" +f);
		
		System.out.println("The float value of implicit conversion is:" +c);
		System.out.println("The float value of explicit conversion is :" + d);
		

	}

}
