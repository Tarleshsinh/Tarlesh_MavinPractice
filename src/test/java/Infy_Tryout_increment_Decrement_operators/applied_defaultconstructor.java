package Infy_Tryout_increment_Decrement_operators;

public class applied_defaultconstructor {

	applied_defaultconstructor () {
		System.out.println("Inside default constructor");
	}
	
	applied_defaultconstructor (int value) {
		//this applied on default constructor
		this();
		System.out.println("Inside parameterized constructor");
	}
	public static void main(String[] args) {
		applied_defaultconstructor dfltcnstr= new applied_defaultconstructor (100);

	}

}
