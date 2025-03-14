package Infy_Tryout_increment_Decrement_operators;

public class ForLOOP {

	public static void main(String[] args) {
		double balance = 100000, rateofinterest = 1.0, interest =0;
		double withdrawal = 00, deposit = 00;
		for (int i =1; i <=6; ++i) {
			balance += deposit;
			balance -= withdrawal;
			interest = balance * rateofinterest;
			balance += interest;
			System.out.println("Month" + i + "is" + interest);
		}
		System.out.println("Balance is" + balance);

	}

}
