package Infy_Tryout_increment_Decrement_operators;

public class Inheretence {

    int empId;
    int basicSalary = 20000;

    public int getempId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Make permanentemployee class static
    static class PermanentEmployee extends Inheretence {
        int salary;
        int HRA = 4000;
        int DA = 1000;

        public void calculateSalary() {
            salary = basicSalary + HRA + DA;
            System.out.println("Salary of Permanent Employee: " + salary);
        }
    }

    public static void main(String[] args) {
        PermanentEmployee per = new PermanentEmployee(); // Create an instance of PermanentEmployee
        per.setEmpId(10214);  // Set Employee ID
        System.out.println("Employee ID: " + per.getempId());  // Print Employee ID
        per.calculateSalary();  // Calculate and print salary
    }
}
