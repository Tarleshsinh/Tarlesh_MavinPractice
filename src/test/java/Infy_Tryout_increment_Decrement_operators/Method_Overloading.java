package Infy_Tryout_increment_Decrement_operators;

public class Method_Overloading {

	public void add (int a, int b) {
		System.out.println("Sum is :" + (a+b));
	}
	
	public void add (int a, int b, int c) {
		System.out.println("Sum is:" + (a+b+c));
	}
	public void add (int a, int b, double c) {
		System.out.println("Sum is:" + (a+b+c));
	}
	
	public static void main(String[] args) {
		Method_Overloading calculate =new  Method_Overloading ();
		calculate.add(100, 200);
		calculate.add(50, 50, 10.10);
		calculate.add(101, 101, 101);
		

	}

}
