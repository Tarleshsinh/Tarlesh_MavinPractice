package Infy_Tryout_increment_Decrement_operators;

import java.util.*;

//Student class implementing Comparable interface
class Student implements Comparable<Student> {
 private String name;
 private int totalMarks;

 // Constructor
 public Student(String name, int totalMarks) {
     this.name = name;
     this.totalMarks = totalMarks;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getTotalMarks() {
     return totalMarks;
 }

 // toString method for displaying student details
 @Override
 public String toString() {
     return "Student{name='" + name + "', totalMarks=" + totalMarks + "}";
 }

 // Sorting by name (default Comparable implementation)
 @Override
 public int compareTo(Student other) {
     return this.name.compareTo(other.name);
 }
}

//Comparator for sorting by total marks
class TotalMarksComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return Integer.compare(s1.getTotalMarks(), s2.getTotalMarks());
 }
}

public class collectioncomparablemap {
 public static void main(String[] args) {
     // Creating a TreeSet for sorting by name (default Comparable)
     TreeSet<Student> studentsByName = new TreeSet<>();
    
     // Adding 5 Student objects
     studentsByName.add(new Student("Alice", 85));
     studentsByName.add(new Student("Bob", 92));
     studentsByName.add(new Student("Charlie", 78));
     studentsByName.add(new Student("David", 88));
     studentsByName.add(new Student("Eve", 95));

     // Displaying students sorted by name
     System.out.println("Students sorted by name (Comparable):");
     for (Student student : studentsByName) {
         System.out.println(student);
     }

     // Creating a TreeSet for sorting by total marks (using Comparator)
     TreeSet<Student> studentsByMarks = new TreeSet<>(new TotalMarksComparator());
    
     // Adding the same Student objects
     studentsByMarks.addAll(studentsByName);

     // Displaying students sorted by total marks
     System.out.println("\nStudents sorted by total marks (Comparator):");
     for (Student student : studentsByMarks) {
         System.out.println(student);
     }
 }
}