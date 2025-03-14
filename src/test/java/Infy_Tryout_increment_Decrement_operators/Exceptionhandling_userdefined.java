package Infy_Tryout_increment_Decrement_operators;

// User-defined exception class to handle salary exceptions
class EmpSalaryException extends Exception {
	public EmpSalaryException(String message) {
		super(message); // Passing the message to the parent Exception class
	}
}

// Employee class to represent employee details
class Employee {
	private String empName;
	private int empAge;
	private double empSalary;

	public Employee(String empName, int empAge, double empSalary) {
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}
}

// Main class to check employee salary
public class Exceptionhandling_userdefined {

	// Method to check the employee salary and throw exception if salary is below
	// 1000
	public void checkEmployeeSalary(Employee emp) throws EmpSalaryException {
		if (emp.getEmpSalary() < 1000) {
			throw new EmpSalaryException("Salary below 1000 is not allowed for employee: " + emp.getEmpName());
		} else {
			System.out.println("Employee " + emp.getEmpName() + " has a valid salary.");
		}
	}

	public static void main(String[] args) {
		// Creating employee objects
		Employee[] employees = { new Employee("John", 25, 1500), new Employee("Jane", 30, 950),
				new Employee("Mike", 28, 1200), new Employee("Sara", 22, 800), new Employee("Chris", 35, 2000) };

		// Creating an instance of the main class to call the checkEmployeeSalary method
		Exceptionhandling_userdefined employeeService = new Exceptionhandling_userdefined();

		// Iterating over each employee and checking salary
		for (Employee emp : employees) {
			try {
				// Checking the salary of the employee
				employeeService.checkEmployeeSalary(emp);
			} catch (EmpSalaryException e) {
				// Handling the exception for employees with salary below 1000
				System.out.println(e.getMessage());
			}
		}
	}
}
