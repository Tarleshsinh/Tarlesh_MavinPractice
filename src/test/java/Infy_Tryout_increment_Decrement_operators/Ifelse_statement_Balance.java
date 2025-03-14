package Infy_Tryout_increment_Decrement_operators;

public class Ifelse_statement_Balance {

	public static void main(String[] args) {
		double balance = 6000;
		double amount = -1;
		
		if (amount<0)
			{System.out.println("Withdrawl has failed as the amount is negative or zero ");}
		else if (amount>balance)
			{System.out.println("Withdrawal has failed as the amount is greater than balance");}
		else {
			balance =+ amount;
			System.out.println("Withdrawal has succeded");
			
		}
		
		
		

	}

}
