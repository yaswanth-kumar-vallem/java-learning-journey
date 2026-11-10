package Uniflow;


import java.util.Scanner;

class BankAcc {
	int accountNo;
	String holderName;
	double balance;
	
	void displayAccount()
	{
		System.out.println("Account Number: "+ accountNo);
		System.out.println("Account Holder: "+ holderName);
		System.out.println("Balance: " + balance);
	}
}
class SavingsAccount extends BankAcc {
	double interestRate;
	String accountType;
	
	void displaySavings() {
		System.out.println("InterestRate: " + interestRate + "%");
		System.out.println("AccountType: "+ accountType);
	}
}
public class inheri{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 SavingsAccount s = new SavingsAccount();
		 
		 System.out.print("Enter Account number: ");
		 s.accountNo = sc. nextInt();
		 
		 sc. nextLine();
		 
		 System.out.print("Enter Account Holder Name: ");
		 s.holderName = sc. nextLine();
		 
		 System.out.print("Enter Balance: ");
		 s.balance =  sc. nextDouble();
		 
		 System.out.print("Enter Interest Rate: ");
		 s.interestRate = sc. nextDouble();
		 
		 sc. nextLine();
		 
		 System.out.print("Enter Account Type: ");
		 s.accountType = sc.nextLine();
		 
		 System.out.println("\n -------Account Details--------");
		 s.displayAccount();
		 s.displaySavings();	
		
	}
}