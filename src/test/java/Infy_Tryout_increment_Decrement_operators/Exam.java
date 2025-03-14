package Infy_Tryout_increment_Decrement_operators;

public class Exam {

	static int total = 100;
	int scrore = 87;
	public static String totalMarks ( ) {
	int marks = 90;
	int internalmarks = 100;
	int Result = marks + internalmarks;
	System.out.println(Result);
	//System.out.println(total);
	return totalMarks();
	}
	
public static void main(String[] args) {
	int data = 50;
	Exam sem = new Exam();
	//System.out.println(sem.scrore);
	//System.out.println(sem.total);
	//System.out.println(sem.totalMarks());
	sem.totalMarks();
	
}
	
	}
	

