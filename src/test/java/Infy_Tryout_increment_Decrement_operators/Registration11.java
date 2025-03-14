package Infy_Tryout_increment_Decrement_operators;

class Registration11 {
    private String customerName;
    private String customerID;
    private String phoneNumber;
    private String planName;

    // Constructor 1: Name and Phone Number
    public Registration11(String customerName, String phoneNumber) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.customerID = generateCustomerID();
    }

    // Constructor 2: Name, Phone Number, and Plan Name
    public Registration11(String customerName, String phoneNumber, String planName) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.planName = planName;
        this.customerID = generateCustomerID();
    }

    // Constructor 3: Name and Plan Name (corrected to a proper constructor)
    public void Registration11(String customerName, String planName) {
        this.customerName = customerName;
        this.planName = planName;
        this.customerID = generateCustomerID();
    }

    // Generate a unique customer ID
    private String generateCustomerID() {
        return "CUS" + (int) (Math.random() * 10000);
    }

    // Display registration details
    public void displayDetails() {
        System.out.println("Congratulations " + customerName + "!!! You have been successfully registered for our services with the following details:");
        System.out.println("Customer ID: " + customerID);
        if (phoneNumber != null) {
            System.out.println("Phone Number: " + phoneNumber);
        }
        if (planName != null) {
            System.out.println("Plan Name: " + planName);
        }
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // Test cases
        Registration11 reg1 = new Registration11("Kevin", "9876543210");
        reg1.displayDetails();

        Registration11 reg2 = new Registration11("Julia", "9876543211", "Platinum");
        reg2.displayDetails();

        Registration11 reg3 = new Registration11("Jenny", "Gold");
        reg3.displayDetails();
        Registration11 reg4 = new Registration11(null, null);
        reg4.displayDetails();;
    }
}
