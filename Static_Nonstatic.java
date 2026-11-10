package student;
class Bank{
	static String bankname="SBI Bank";
	static float interestrate=7.5f;
	int accountnumber;
	double balance;
	static void displayBankDetails() {
		System.out.println("BankName:"+bankname);
		System.out.println("Interestrate:"+interestrate+"%");
		
	}
	void displayAccountdetails() {
		System.out.println("Account Number"+accountnumber);
		System.out.println("Balance"+balance);
	}
	
}

public class Static_Nonstatic {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.accountnumber=101;
		b.balance=50000;
		System.out.println("Bank Name:"+Bank.bankname);
		System.out.println("Interest rate:"+Bank.interestrate+"%");
		System.out.println("Bank Name:"+b.bankname);
		System.out.println("Interestrate:"+b.interestrate+"%");
		System.out.println();
		System.out.println("Balance"+b.balance);
		System.out.println();
		System.out.println("------Static Metthod-----");
		Bank.displayBankDetails();
		System.out.println("------Non-Static Metthod-----");
		Bank.displayBankDetails();
		

		// TODO Auto-generated method stub
		

	}

}
