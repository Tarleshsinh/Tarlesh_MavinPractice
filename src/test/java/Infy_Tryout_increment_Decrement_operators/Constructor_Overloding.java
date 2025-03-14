package Infy_Tryout_increment_Decrement_operators;

public class Constructor_Overloding {
int id;
String name;
Constructor_Overloding () {
	this.id=12;
	this.name= "Tarlesh";
}
Constructor_Overloding (int id){
	this.id = id;
	this.name = "Parmar";
}
Constructor_Overloding (int id, String name) {
	this.id = id;
	this.name = name;
}
	public static void main(String[] args) {
		Constructor_Overloding Constructor = new Constructor_Overloding ();
		System.out.println("Constructor 1 value is:" + Constructor.id + Constructor.name);
		Constructor_Overloding Constructor2 = new Constructor_Overloding (10);
		System.out.println("Constructor2 Value is:" + Constructor2.id + Constructor2.name);
		Constructor_Overloding Constructor3 = new Constructor_Overloding (11,"Canada");
		System.out.println("Constructor3 Value is:" + Constructor3.id + Constructor3.name);

	}

}
