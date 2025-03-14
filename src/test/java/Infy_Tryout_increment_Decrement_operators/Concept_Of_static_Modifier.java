package Infy_Tryout_increment_Decrement_operators;

public class Concept_Of_static_Modifier {

	private int id;
	private String name;
	public static int count; //static variable
	public int getId () {
		return id;
	}
	
	public void setId (int Id) {
		this.id=id;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public Concept_Of_static_Modifier (String name) {
		this.name=name;
		count++;
		this.id=count;
	}
	
	public static int getcount () { //static method
		return count;
	}
	
	static {
		count = 1000;
		System.out.println("Initial Value of ID" + count);
	}
	
	public static void main(String[] args) {
		System.out.println("ID before creating object" + Concept_Of_static_Modifier.getcount());
		Concept_Of_static_Modifier st1 = new Concept_Of_static_Modifier ("Robert");
		System.out.println("Student ID with getID method" + st1.getId());
		System.out.println("ID after creating 1st Object:" + Concept_Of_static_Modifier.getcount());
		Concept_Of_static_Modifier st2 = new Concept_Of_static_Modifier ("JOHN");
		System.out.println("Student ID with getID method:" + st2.getId());
		System.out.println("ID after creating 2nd object:" + Concept_Of_static_Modifier.getcount());
	}

}
