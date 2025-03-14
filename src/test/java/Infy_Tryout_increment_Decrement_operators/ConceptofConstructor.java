package Infy_Tryout_increment_Decrement_operators;

//Chocolate class
class Chocolate {
 // Instance variables
 private int barCode;
 private String name;
 private int weight;
 private int cost;

 // Constructor to initialize variables
 public Chocolate(int barCode, String name, int weight, int cost) {
     this.barCode = barCode;
     this.name = name;
     this.weight = weight;
     this.cost = cost;
 }

 // Setter methods to modify the variables
 public void setBarCode(int barCode) {
     this.barCode = barCode;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setWeight(int weight) {
     this.weight = weight;
 }

 public void setCost(int cost) {
     this.cost = cost;
 }

 // Getter methods to display the values
 public int getBarCode() {
     return barCode;
 }

 public String getName() {
     return name;
 }

 public int getWeight() {
     return weight;
 }

 public int getCost() {
     return cost;
 }

 // Method to display chocolate details
 public void displayDetails() {
     System.out.println("Chocolate Details:");
     System.out.println("Bar Code: " + barCode);
     System.out.println("Name: " + name);
     System.out.println("Weight: " + weight);
     System.out.println("Cost: " + cost);
     System.out.println();
 }
}

//Tester class
public class ConceptofConstructor {
 public static void main(String[] args) {
     // Create an object of Chocolate with initial values
     Chocolate chocolate = new Chocolate(101, "Cadbury", 12, 10);

     // Display initial values
     System.out.println("Initial Values:");
     chocolate.displayDetails();

     // Modify values using setter methods
     chocolate.setBarCode(102);
     chocolate.setName("Hershey's");
     chocolate.setWeight(24);
     chocolate.setCost(50);

     // Display modified values
     System.out.println("Modified Values:");
     chocolate.displayDetails();
 }
}