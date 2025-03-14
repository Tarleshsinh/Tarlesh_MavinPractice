package Infy_Tryout_increment_Decrement_operators;
// Define a class to calculate the discounted bill amount
public class create_billamount {

    public static void main(String[] args) {
        // Input 1
        int billId1 = 1001;
        int customerId1 = 101;
        double discount1 = 2; // in percentage
        double billAmount1 = 199.99;

        // Input 2
        int billId2 = 1002;
        int customerId2 = 102;
        double discount2 = 4; // in percentage
        double billAmount2 = 210.5;

        // Calculate discounted bill amounts
        double discountedBillAmount1 = create_billamount(billAmount1, discount1);
        double discountedBillAmount2 = create_billamount(billAmount2, discount2);

        // Print the results
        System.out.println("Input 1:");
        System.out.println("Bill ID: " + billId1);
        System.out.println("Customer ID: " + customerId1);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount1);

        System.out.println("\nInput 2:");
        System.out.println("Bill ID: " + billId2);
        System.out.println("Customer ID: " + customerId2);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount2);
        
        create_billamount Bill = new create_billamount ();
        Double Bill1 = Bill.calculateDiscountedBill(discountedBillAmount1, discount1);
        Double Bill2 = Bill.create_billamount(discountedBillAmount2, discount2);
        System.out.println(Bill1);
        System.out.println(Bill2);
    }

    private static double create_billamount(double billAmount2, double discount2) {
		// TODO Auto-generated method stub
    	return billAmount2 - (billAmount2 * discount2 / 100);
		
	}

	// Method to calculate the discounted bill amount
    public static double calculateDiscountedBill(double billAmount1, double discount1) {
        return billAmount1 - (billAmount1 * discount1 / 100);
    }
}