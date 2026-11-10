package student;
import java.util.Scanner;

public class Student_attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int count = 1;

        while (count <= 5) {

            System.out.println("\nEnter details of Student " + count);

            System.out.print("Student ID: ");
            int id = sc.nextInt();

            System.out.print("Student Name: ");
            String name = sc.next();

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            System.out.println("Details Entered Successfully!");

            count++;
        }

        System.out.println("\n========== UNIFLOW STUDENT ATTENDANCE ==========");
        System.out.println("All 5 student records have been processed.");

        sc.close();


	}

}
