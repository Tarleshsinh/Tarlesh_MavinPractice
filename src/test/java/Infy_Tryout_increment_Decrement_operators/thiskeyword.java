package Infy_Tryout_increment_Decrement_operators;

public class thiskeyword {

	 int studentId;
	 String studentName;
	
	thiskeyword (int studentID, String studentName) {
		//this keyword applied on instance variable
		this.studentId = studentID;
		this.studentName = studentName;
	}
	
	public void display () {
		System.out.println(studentId + "" + studentName);
	}
	public static void main(String[] args) {
		thiskeyword st = new thiskeyword (100,"Ram");
		thiskeyword st1 = new thiskeyword (101, "Vaju");
		st.display();
		st1.display();
		//System.out.println(studentId + "" + studentName);

		

	}

}
