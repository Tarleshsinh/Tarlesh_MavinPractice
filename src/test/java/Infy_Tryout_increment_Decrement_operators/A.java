package Infy_Tryout_increment_Decrement_operators;

import java.util.Objects;

public class A {

    private int empid;
    private String name;
    private String designation;
    private String address;

    // Default constructor
    public A() {
        super();
    }

    // Parameterized constructor
    public A(int empid, String name, String designation, String address) {
        super();
        this.empid = empid;
        this.name = name;
        this.designation = designation;
        this.address = address;
    }

    // Getters and Setters
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // hashCode() and equals() methods
    @Override
    public int hashCode() {
        return Objects.hash(address, designation, empid, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        A other = (A) obj;
        return Objects.equals(address, other.address) && Objects.equals(designation, other.designation)
                && empid == other.empid && Objects.equals(name, other.name);
    }

    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        A employee = new A(101, "John Doe", "Software Engineer", "1234 Elm Street");
        A employe = new A (103,"Jigar", "Doctor", "7 rcr");

        // Alternatively, you can create an object using the default constructor and then set values using setter methods
        A anotherEmployee = new A();
        anotherEmployee.setEmpid(102);
        anotherEmployee.setName("John Doe");
        anotherEmployee.setDesignation("Project Manager");
        anotherEmployee.setAddress("5678 Oak Avenue");

        // Display the employee details
        System.out.println("Employee 1: " + employee.getEmpid() + ", " + employee.getName() + ", " 
                           + employee.getDesignation() + ", " + employee.getAddress());
        System.out.println("Employee 2: " + anotherEmployee.getEmpid() + ", " + anotherEmployee.getName() + ", " 
                           + anotherEmployee.getDesignation() + ", " + anotherEmployee.getAddress());
        System.out.println(employe.getName() + employee.getEmpid() + employe.getAddress() + employe.getDesignation());
        // Checking if both employees are equal using equals() method
        System.out.println("Are both employees equal? " + employee.equals(anotherEmployee));
    }
}
