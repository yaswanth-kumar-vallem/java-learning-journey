package Uniflow;

import java.util.*;

class BankAccount {
    // Balance is kept private so methods inside perform operation on it[span_1](start_span)[span_1](end_span)
    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

public class EncapsulationDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        
        System.out.println("Enter deposit amount:");
        double amount = sc.nextDouble();
        
        account.deposit(amount);
        account.displayBalance();
    }
}