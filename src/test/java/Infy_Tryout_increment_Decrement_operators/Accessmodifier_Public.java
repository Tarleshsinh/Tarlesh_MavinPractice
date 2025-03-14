package Infy_Tryout_increment_Decrement_operators;

public class Accessmodifier_Public {

	String place;
	
	class student {
		int id = 100;
		Accessmodifier_Public accessmodifier_Public;
		//this can be acessed in same package
	}
	
	public static void main(String[] args) {
		
		Accessmodifier_Public Access = new Accessmodifier_Public ();
		Access.place= "Toronto";
		System.out.println(Access.place);
		
	}

}
