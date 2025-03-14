package Infy_Tryout_increment_Decrement_operators;

public class Increment_Decrement_Operators {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("The value of a is:" +a);
		++a;
		System.out.println("The value of a after pre increment (++a) is:"+a);
		
		int b = 10;
		System.out.println("The value of b is:" +b);
		
		int c = b++;
		System.out.println("The value of c when assigned as c= b++ is:" +c);
		System.out.println("The value of b after post increment (b++) is:" +b);
		
		int d = 10;
		System.out.println("The value of d is:"+d);
		--d;
		System.out.println("The value of d after pre decrement (--d) is"+d);
		
		int e=10;
		System.out.println("The value of e is:"+e);
		int f = e--;
		System.out.println("The value of f when asigned as f = e-- is:"+f);
		System.out.println("The value of e after post decrement (d++) is:" +e);
		
	}

}
