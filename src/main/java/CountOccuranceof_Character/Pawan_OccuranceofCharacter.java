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
	}

}
