package Uniflow;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("your electricity bill");
		Scanner sc=new Scanner(System.in);
		

        // Read units
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        int energyCharge;

        // Calculate energy charge
        if (units <= 100) {
            energyCharge = units * 2;
        } 
        else if (units <= 200) {
            energyCharge = units * 3;
        } 
        else {
            energyCharge = units * 5;
        }

        // Fixed service charge
        int serviceCharge = 50;

        // Calculate total bill
        int totalBill = energyCharge + serviceCharge;

        // Display bill details
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Energy Charge  : Rs." + energyCharge);
        System.out.println("Service Charge : Rs." + serviceCharge);
        System.out.println("Total Bill     : Rs." + totalBill);

        sc.close();

	}

}
