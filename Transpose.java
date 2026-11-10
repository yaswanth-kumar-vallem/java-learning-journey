package student;
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // A 2x3 matrix (2 rows, 3 columns)
        int a[][] = new int[2][3]; 
        
        System.out.println("Enter 6 elements:");
        // Input loops
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) { // Fixed boundary condition to 3
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Transpose of the matrix:");
        // Output loops: columns become rows
        for (int j = 0; j < 3; j++) { 
            for (int i = 0; i < 2; i++) { 
                // Print elements in the same row separated by spaces
                System.out.print(a[i][j] + " "); 
            }
            // Move to the next line after completing a row
            System.out.println(); 
        }
        
        sc.close();

	}

}
