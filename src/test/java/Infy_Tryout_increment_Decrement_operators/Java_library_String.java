package Infy_Tryout_increment_Decrement_operators;

//Class to demonstrate Java library Object methods
public class Java_library_String {

	private String name;
	 private int age;
	 private int admissionNumber;
 public static void main(String[] args) {
     // Creating three student objects with identical attributes
	 Java_library_String student1 = new Java_library_String("Peter", 24, 5001);
	 Java_library_String student2 = new Java_library_String("Peter", 24, 5002);
	 Java_library_String student3 = new Java_library_String("Tarlesh", 24, 5003);

     // Displaying student details
     System.out.println("Student 1 Details: ");
     student1.displayDetails();
     System.out.println("\nStudent 2 Details: ");
     student2.displayDetails();
     System.out.println("\nStudent 3 Details: ");
     student3.displayDetails();

     // Comparing the two student objects
     if (student1.equals(student2)) {
         System.out.println("\nRoll number already generated for the student!");
     } else {
         System.out.println("\nStudents have different roll numbers.");
     }
 }

 // Constructor to initialize student details
 public Java_library_String(String name, int age, int admissionNumber) {
     this.name = name;
     this.age = age;
     this.admissionNumber = admissionNumber;
 }

 // Method to display student details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Admission Number: " + admissionNumber);
 }

 // Overriding equals() to compare admission numbers
 @Override
 public boolean equals(Object obj) {
     if (this == obj) {
         return true; // If both references point to the same object
     }
     if (obj == null || getClass() != obj.getClass()) {
         return false; // If the object is null or of different class
     }
     Java_library_String other = (Java_library_String) obj;
     return this.admissionNumber == other.admissionNumber; // Compare admission numbers
 }

 // Overriding hashCode() (optional but recommended with equals())
 @Override
 public int hashCode() {
     return Integer.hashCode(admissionNumber);
 }
}
