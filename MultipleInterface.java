package Uniflow;
import java.util.Scanner;

interface DepositService {
    void deposit(double amount);
}

interface LoanService {
    void loan(double amount);
}

class BankCustomer implements DepositService, LoanService {
    String customerName;
    double depositAmount;
    double loanAmount;

    @Override
    public void deposit(double amount) {
        depositAmount = amount;
    }

    @Override
    public void loan(double amount) {
        loanAmount = amount;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankCustomer b = new BankCustomer();

        System.out.print("Enter Customer Name: ");
        b.customerName = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        b.deposit(dep);

        System.out.print("Enter Loan Amount: ");
        double ln = sc.nextDouble();
        b.loan(ln);

        System.out.println("\n--- Customer Details ---");
        b.displayDetails();
        
        sc.close();
    }
}