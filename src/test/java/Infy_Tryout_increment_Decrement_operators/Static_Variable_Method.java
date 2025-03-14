package Infy_Tryout_increment_Decrement_operators;

//Loan class
class Loan {
 // Instance variables
 private int accountNo;
 private int customerNo;
 private float loanAmount;
 private float loanDuration;
 private float interest;

 // Static variable to count the number of objects created
 private static int loanCounter = 0;

 // Default constructor
 public Loan() {
     loanCounter++; // Increment loanCounter for each new object
 }

 // Parameterized constructor
 public Loan(int accountNo, int customerNo, float loanAmount, float loanDuration, float interest) {
     this.accountNo = accountNo;
     this.customerNo = customerNo;
     this.loanAmount = loanAmount;
     this.loanDuration = loanDuration;
     this.interest = interest;
     loanCounter++; // Increment loanCounter for each new object
 }

 // Getter methods
 public int getAccountNo() {
     return accountNo;
 }

 public int getCustomerNo() {
     return customerNo;
 }

 public float getLoanAmount() {
     return loanAmount;
 }

 public float getLoanDuration() {
     return loanDuration;
 }

 public float getInterest() {
     return interest;
 }

 // Setter methods
 public void setAccountNo(int accountNo) {
     this.accountNo = accountNo;
 }

 public void setCustomerNo(int customerNo) {
     this.customerNo = customerNo;
 }

 public void setLoanAmount(float loanAmount) {
     this.loanAmount = loanAmount;
 }

 public void setLoanDuration(float loanDuration) {
     this.loanDuration = loanDuration;
 }

 public void setInterest(float interest) {
     this.interest = interest;
 }

 // Static method to get the loan counter
 public static int getLoanCounter() {
     return loanCounter;
 }
}

//Tester class
public class Static_Variable_Method {
 public static void main(String[] args) {
     // Create objects of Loan using the default constructor
     Loan loan1 = new Loan();
     Loan loan2 = new Loan();

     // Create objects of Loan using the parameterized constructor
     Loan loan3 = new Loan(101, 201, 50000, 5, 7.5f);
     Loan loan4 = new Loan(102, 202, 75000, 3, 8.5f);

     // Display the loanCounter for all instances
     System.out.println("Total number of Loan objects created: " + Loan.getLoanCounter());
 }
}