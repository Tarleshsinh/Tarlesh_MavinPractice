package Infy_Tryout_increment_Decrement_operators;

public class Constructor_overriding {
    int salary;
    int BasicSalary = 15000;

    // Method to calculate salary for the base class
    public void calculatesalary() {
        salary = BasicSalary;
        System.out.println("Basic Salary: " + salary);
    }
}

class permanentEmployee extends Constructor_overriding {
    int HRA = 4000;
    int DA = 3500;

    // Overriding calculatesalary method in subclass
    @Override
    public void calculatesalary() {
        salary = BasicSalary + HRA + DA;
        System.out.println("Permanent Employee Salary: " + salary);
    }
}

class MainClass {
    public static void main(String[] args) {
        // Creating object of base class
        Constructor_overriding emp = new Constructor_overriding();
        emp.calculatesalary();  // Calls base class method

        // Creating object of subclass
        permanentEmployee emp1 = new permanentEmployee();
        emp1.calculatesalary();  // Calls overridden method in subclass
    }
}
