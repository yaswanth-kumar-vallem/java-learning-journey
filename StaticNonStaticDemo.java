package Uniflow;
class Bank {
    // Static (class-level) variables
    static String bankName = "SBI Bank";
    static float interestRate = 7.5f;

    // Non-static (instance-level) variables
    int accountNumber;
    double balance;

    // Static method to display bank details
    static void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Non-static method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class StaticNonStaticDemo {
    public static void main(String[] args) {
        // Accessing static members directly using the class name
        System.out.println("Bank Name: " + Bank.bankName);
        System.out.println("Interest Rate: " + Bank.interestRate + "%");
        System.out.println();

        // Creating an object to access non-static members
        Bank b = new Bank();
        b.accountNumber = 101;
        b.balance = 50000.0;

        // Accessing non-static members using the object reference
        System.out.println("Account Number: " + b.accountNumber);
        System.out.println("Balance: " + b.balance);
        System.out.println();

        // Demonstrating static methods
        System.out.println("--- Static Methods ---");
        Bank.displayBankDetails();
        System.out.println();

        // Demonstrating non-static methods
        System.out.println("--- Non-Static Methods ---");
        b.displayAccountDetails();
    }
}