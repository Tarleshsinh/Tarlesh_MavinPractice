package Infy_Tryout_increment_Decrement_operators;

public class user1 {

    // Base class: User
    static class User {
        private int id;
        private String userName;
        private String email;
        private double walletBalance;

        // Constructor
        public User(int id, String userName, String email, double walletBalance) {
            this.id = id;
            this.userName = userName;
            this.email = email;
            this.walletBalance = walletBalance;
        }

        // Method to pay a bill
        public String payBill(double billAmount) {
            if (walletBalance >= billAmount) {
                walletBalance -= billAmount;
                return userName + " paid $" + billAmount + " successfully.";
            } else {
                return userName + " does not have enough balance to pay the bill.";
            }
        }

        // Getter for wallet balance
        public double getWalletBalance() {
            return walletBalance;
        }
    }

    // Subclass: PremiumUser
    static class PremiumUser extends User {
        private int rewardPoints;

        // Constructor
        public PremiumUser(int id, String userName, String email, double walletBalance) {
            super(id, userName, email, walletBalance);
            this.rewardPoints = 0;
        }

        // Overridden method to pay a bill with rewards
        @Override
        public String payBill(double billAmount) {
            if (getWalletBalance() >= billAmount) {
                // Add reward points (1 point per $10 spent)
                rewardPoints += (int) billAmount / 10;
                return super.payBill(billAmount) + " Reward points earned: " + rewardPoints;
            } else {
                return super.payBill(billAmount);
            }
        }
    }

    // Main class to test the functionality
    public static class Main {
        public static void main(String[] args) {
            // Create User instance
            User user1 = new User(101, "John", "john@example.com", 100);
            System.out.println(user1.payBill(50)); // Successful
            System.out.println(user1.payBill(60)); // Unsuccessful

            // Create PremiumUser instance
            PremiumUser premiumUser1 = new PremiumUser(102, "Alice", "alice@example.com", 200);
            System.out.println(premiumUser1.payBill(150)); // Successful with reward points
            System.out.println(premiumUser1.payBill(100)); // Unsuccessful
        }
    }
}
