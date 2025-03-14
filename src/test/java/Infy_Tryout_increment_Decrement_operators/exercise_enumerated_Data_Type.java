package Infy_Tryout_increment_Decrement_operators;

//Enum to represent possible grades of a student
enum Grade {
 A, B, C, D, E, F
}

//Class to store student details and calculate grade and scholarship amount
public class exercise_enumerated_Data_Type {
 private int studentId;      // ID of the student
 private String studentName;  // Name of the student
 private int totalMarks;      // Total marks scored by the student
 private Grade grade;        // Grade of the student
 private int scholarshipAmount; // Scholarship amount awarded to the student

 // Constructor to initialize student details
 public exercise_enumerated_Data_Type(int studentId, String studentName, int totalMarks) {
     this.studentId = studentId;
     this.studentName = studentName;
     this.totalMarks = totalMarks;
 }

 // Method to calculate the grade based on total marks
 public void calculateGrade() {
     if (totalMarks >= 250) {
         grade = Grade.A;
     } else if (totalMarks >= 200) {
         grade = Grade.B;
     } else if (totalMarks >= 150) {
         grade = Grade.C;
     } else if (totalMarks >= 100) {
         grade = Grade.D;
     } else if (totalMarks >= 50) {
         grade = Grade.E;
     } else {
         grade = Grade.F;
     }
 }

 // Method to calculate the scholarship amount based on the grade
 public void calculateScholarshipAmount() {
     switch (grade) {
         case A:
             scholarshipAmount = 4000;
             break;
         case B:
             scholarshipAmount = 3000;
             break;
         case C:
             scholarshipAmount = 2000;
             break;
         case D:
             scholarshipAmount = 1000;
             break;
         default:
             scholarshipAmount = 0;
             break;
     }
 }

 // Method to display student details
 public void displayStudentDetails() {
     System.out.println("Student Details");
     System.out.println("ID: " + studentId);
     System.out.println("Name: " + studentName);
     System.out.println("Total Marks: " + totalMarks);
     System.out.println("Grade: " + grade);
     System.out.println("Scholarship Amount: " + scholarshipAmount);
 }

 // Main method to test the functionality
 public static void main(String[] args) {
     // Create a student object
     exercise_enumerated_Data_Type student = new exercise_enumerated_Data_Type(1, "John", 260);
     exercise_enumerated_Data_Type student1 = new exercise_enumerated_Data_Type(2, "Parmar", 90);
     // Calculate grade and scholarship amount
     student.calculateGrade();
     student.calculateScholarshipAmount();
    
     // Display student details
     student.displayStudentDetails();
     
     student1.calculateGrade();
     student1.calculateScholarshipAmount();
     student1.displayStudentDetails();
     
 }
}