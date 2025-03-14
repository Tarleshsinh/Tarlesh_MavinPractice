package Infy_Tryout_increment_Decrement_operators;

public class multiple_inheretence {

    // Define the AfterSale interface with the abstract method
    interface AfterSale {
        double chargeOnDelivery();
        default double discount(double amount) {
            // Default implementation: no discount for RegularCustomer
            return amount;
        }
    }

    // Base Customer class
    abstract static class Customer implements AfterSale {
        protected double purchaseAmount;

        public void calculatePurchaseAmount(double amount) {
            this.purchaseAmount = amount;
        }
    }

    // RegularCustomer class
    static class RegularCustomer extends Customer {
        @Override
        public double chargeOnDelivery() {
            return purchaseAmount; // No discount for regular customers
        }
    }

    // PrivilegedCustomer class
    static class PrivilegedCustomer extends Customer {
        @Override
        public double chargeOnDelivery() {
            return discount(purchaseAmount); // Apply a 5% discount
        }

        @Override
        public double discount(double amount) {
            return amount * 0.95; // 5% discount
        }
    }

    // Main class to test the functionality
    public static class Main {
        public static void main(String[] args) {
            // Create instances of RegularCustomer and PrivilegedCustomer
            Customer regularCustomer = new RegularCustomer();
            Customer privilegedCustomer = new PrivilegedCustomer();

            // Set purchase amounts
            regularCustomer.calculatePurchaseAmount(100);
            privilegedCustomer.calculatePurchaseAmount(100);
            

            // Calculate charges on delivery
            System.out.println("Regular Customer Charge: $" + regularCustomer.chargeOnDelivery());
            System.out.println("Privileged Customer Charge: $" + privilegedCustomer.chargeOnDelivery());
        }
    }
}
