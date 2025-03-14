package CountOccuranceof_Character;

public class Pawan_OccuranceofCharacter {

	public static void main(String[] args) {
	
		
		String s = " Java Programming Java Opps";
		int totalcount= s.length();
		int totalcount_afterremovalofa = s.replace("a","").length();
		
		int count = totalcount- totalcount_afterremovalofa;
		
		System.out.println("number of occurances of a :" + count);
		//System.out.println(s.length());
		System.out.println(s.replace("a", ""));
		
		String Name = "Tarlesh";
		
		int totalnamelength = Name.length();
		int totalofT = Name.replace("T", "").length();
		
		int countofT = totalnamelength-totalofT;
		System.out.println("Total count of T:" + countofT);
		
		
		String country = "Canada";
		
		int totalcharacterofcountry = country.length();
		int totalcharacterwithoutC = country.replace("C", "").length();
		
		int countodC = totalcharacterofcountry-totalcharacterwithoutC;
		System.out.println("Total Count of C:  " + countodC);
		
		String infy = "Infosys";
		
		StringBuilder str = new StringBuilder(infy);
		str.reverse();
		System.out.println("Reversed String "+str);
		str.reverse();
		System.out.println("after reverse again: " + str);
		
		String string = "India";
		String reverse= "";
		for (int i= string.length() -1 ; i >= 0; i--) {
			//reverse = reverse + string.charAt(i);
			System.out.println("Reversed value of Ilatest " + reverse.charAt(i));
		}
		
		
		int a = 100;
		int b = 200;
		
		System.out.println("A:   :" + a + "B   :" + b);
		
		 a = a + b; // 300
		 b = a-b; // 300-200 = 100 
		 a = a-b; 
		 System.out.println("A After Change :" + a + "B After Change " + b);
		 
		 int c = 10;
		 int d = 20;
		 
		 System.out.println("c before change:" + c + "d before change " + d);
		 
		 c =c^d;
		 d= c^d;
		 c= c^d;
		 
		 System.out.println("C after Change :" + c + "d after Change " + d);
		 
		String city = "Rexdale";
		String Reverse = "";

		
		for (int i = city.length() -1; i >= 0; i--) {
			Reverse = Reverse + city.charAt(i);
			System.out.println("Rewerse of city " + Reverse);
			
			int x = 100;
			int y = 200;
			System.out.println("Replaced numer of X befor  " + x + "Replace numer of Y" + y);
			x = x + y;
			y = x - y;
			x = x-y ;
			System.out.println("Replaced numer of X " + x + "Replace numer of Y" + y);
		}
		 
	}

}
