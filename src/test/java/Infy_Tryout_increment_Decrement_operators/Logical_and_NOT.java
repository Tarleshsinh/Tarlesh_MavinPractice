package Infy_Tryout_increment_Decrement_operators;

public class Logical_and_NOT {

	public static void main(String[] args) {
		
		int m = 1;
		int n = ++m + m++ + m;
		System.out.println(n);
		System.out.println(++m);
		System.out.println(m++);
		System.out.println(++m);
		
		double balance = 2000;
		double amount = 500;
		double limit = 10000;
		double minBalance = 500;
		
		//Short circuit OR operator
		if (!(amount<0)) {
			//Short circuit operator
			if (amount<= limit && (balance-amount) > minBalance) {
				balance -= amount;
				System.out.println("Success");
			}
			
			}
		else {
			System.out.println("failed");
			
		}
	}
}
