package Infy_Tryout_increment_Decrement_operators;

import java.util.Scanner;

public class Do_While_Loop {
	
	public static void main(String[] args) {
		double balance = 0;
		double minbal = 5000;
		double depositamount = 0;
		//Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("$100 have been added to the account");
			depositamount +=1000;  //hardcore different deposit values
			//depositamount = sc.nextInt(); //un comment when working in eclipse
		} while (depositamount <minbal);
		balance = depositamount;
		System.out.println("Transaction complete");
		}

	}


