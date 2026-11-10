package Uniflow;
import java.util.Scanner;

public class Matrixdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int sum = 0;

        System.out.println("Enter 9 elements:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Calculating the sum of both diagonals
        for (int i = 0; i < 3; i++) {
            sum = sum + a[i][i];       // Main diagonal: (0,0), (1,1), (2,2)
            sum = sum + a[i][2 - i];   // Anti-diagonal: (0,2), (1,1), (2,0)
        }

        // Subtract the overlapping center element to avoid double-counting
        sum = sum - a[1][1]; 

        System.out.println("Sum of diagonal elements = " + sum);
        sc.close();
    }

	}


