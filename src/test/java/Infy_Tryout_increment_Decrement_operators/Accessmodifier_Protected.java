package Infy_Tryout_increment_Decrement_operators;

class Adress {
	//protected access modifier
		protected String place;
}

public class Accessmodifier_Protected extends Adress {
	
	public static void main(String[] args) {
		Adress ad = new Adress();
		//This can be accessible within same package
		ad.place = "Missisagua";
		System.out.println(ad.place);
		
		//protected access is visible through inheretenece
		Accessmodifier_Protected prtcd = new Accessmodifier_Protected();
		Accessmodifier_Protected GTA = new Accessmodifier_Protected ();
		GTA.place = "Ontario";
		prtcd.place = "Brampton";
		System.out.println(prtcd.place);
		System.out.println(GTA.place);

	}

}
