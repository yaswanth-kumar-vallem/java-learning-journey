package Uniflow;
import java.util.Scanner;
public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Student Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        // Subject marks
        System.out.print("Enter Java Marks: ");
        double java = sc.nextDouble();

        System.out.print("Enter Mathematics Marks: ");
        double maths = sc.nextDouble();

        System.out.print("Enter Computer Fundamentals Marks: ");
        double cf = sc.nextDouble();

        System.out.print("Enter English Marks: ");
        double english = sc.nextDouble();

        // Calculate total and average
        double total = java + maths + cf + english;
        double average = total / 4;

        // Formatted output
        System.out.println("\n========== UNIFLOW ACADEMIC RECORD ==========");

        System.out.printf("Student ID   : %d%n", id);
        System.out.printf("Student Name : %s%n", name);

        System.out.println("---------------------------------------------");

        System.out.printf("Java         : %.2f%n", java);
        System.out.printf("Mathematics  : %.2f%n", maths);
        System.out.printf("Computer Fund: %.2f%n", cf);
        System.out.printf("English      : %.2f%n", english);

        System.out.println("---------------------------------------------");

        System.out.printf("Total Marks  : %.2f%n", total);
        System.out.printf("Average      : %.2f%n", average);

        System.out.println("=============================================");

        sc.close();


	}

}
