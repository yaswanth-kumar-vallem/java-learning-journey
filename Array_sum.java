package Uniflow;
import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int[][] marks = new int[5][5];
        int[] total = new int[5];

        // Read marks
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter marks for Student " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
                total[i] += marks[i][j];
            }
        }

        // Display examination register
        System.out.println("\n--- Examination Register ---");

        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }

            System.out.println("Total = " + total[i]);
        }

        sc.close();

	}

}
