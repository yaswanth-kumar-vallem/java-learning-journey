package unif;

import java.util.Scanner;

class UniflowExamMatrixoperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int marks[][] = new int[5][5];

        // Reading marks
        System.out.println("Enter marks of 5 students in 5 subjects:");

        for(int i = 0; i < 5; i++)
        {
            System.out.println("\nStudent " + (i + 1));

            for(int j = 0; j < 5; j++)
            {
                System.out.print("Enter marks in Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Display Examination Register
        System.out.println("\n========== UNIFLOW EXAMINATION REGISTER ==========");
        System.out.println("Student\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal");

        for(int i = 0; i < 5; i++)
        {
            int total = 0;

            System.out.print("S" + (i + 1) + "\t");

            for(int j = 0; j < 5; j++)
            {
                System.out.print(marks[i][j] + "\t");
                total = total + marks[i][j];
            }

            System.out.println(total);
        }

        sc.close();
    }
}