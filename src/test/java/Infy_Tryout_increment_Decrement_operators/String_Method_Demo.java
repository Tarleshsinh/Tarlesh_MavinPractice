package Infy_Tryout_increment_Decrement_operators;

import java.util.stream.Stream;

public class String_Method_Demo {

	public static void main(String[] args) {

		String s1= "   Infosys  ";
		String s2= "Limited";
		
		System.out.println(s2.repeat(4));
		
		System.out.println(s1.strip());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		
		
		String s3= "A\nB\tC\n";
		Stream<String> lines=s3.lines();
		lines.forEach(System.out::println);
		//is blankl () 
		System.out.println("car".isBlank());
		System.out.println("   car    ".isBlank());
		System.out.println("   ".isBlank());
		System.out.println(" ".isBlank());
		
		//is empty
		System.out.println("car".isEmpty());
		System.out.println("   ".isEmpty());
		//concat method
		String name = "Percy";
		name.concat("Jackson");
		System.out.println(name);

	}

}
