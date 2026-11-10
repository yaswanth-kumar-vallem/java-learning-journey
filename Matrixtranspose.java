package Uniflow;

import java.util.Scanner;

public class Matrixtranspose {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input dimensions
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = scanner.nextInt();

	        int[][] matrix = new int[rows][cols];
	        int[][] transpose = new int[cols][rows];

	        // Input matrix elements
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Compute transpose
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }

	        // Print original matrix
	        System.out.println("\nOriginal Matrix:");
	        printMatrix(matrix, rows, cols);

	        // Print transposed matrix
	        System.out.println("\nTransposed Matrix:");
	        printMatrix(transpose, cols, rows);

	        scanner.close();
	    }

	    // Helper method to display a 2D matrix
	    private static void printMatrix(int[][] arr, int r, int c) {
	        for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                System.out.print(arr[i][j] + "\t");
	            }
	            System.out.println();
	        }

	}

}
