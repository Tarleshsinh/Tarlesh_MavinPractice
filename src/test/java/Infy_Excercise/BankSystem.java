package Infy_Excercise;

// Customer class
class Customer {
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Account class
class Account {
    private String accountNumber;
    protected double balance;
    private Customer customer;

    public Account(String accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, Customer customer, double interestRate) {
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public void addInterest() {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// CurrentAccount class
class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, Customer customer, double overdraftLimit) {
        super(accountNumber, balance, customer);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

// Main class to test the implementation
public class BankSystem {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("C001", "John Doe", "john@example.com");

        // Create a Savings Account
        SavingsAccount savingsAccount = new SavingsAccount("S12345", 5000, customer, 5.0);
        savingsAccount.deposit(2000);
        savingsAccount.addInterest();
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

        // Create a Current Account
        CurrentAccount currentAccount = new CurrentAccount("C67890", 3000, customer, 1000);
        currentAccount.withdraw(35000);
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}
