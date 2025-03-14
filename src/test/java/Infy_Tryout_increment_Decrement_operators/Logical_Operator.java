package Infy_Tryout_increment_Decrement_operators;

public class Logical_Operator {

	public static void main(String[] args) {
		
		double balance = 6000, amount = 1500;
		
		//short cicuit or operator
		if (amount<=0 || amount> balance) {
			System.out.println("Failed");
		}
		else {
			balance -= amount;
			System.out.println("Success");
		
		}
	
	}
	
	}


