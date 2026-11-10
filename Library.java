package Uniflow;

import java.util.Scanner;

class Library {
    public class Methods {
	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        DigitalLibrary d = new DigitalLibrary();
	
	        // Accepting input from the user
	        System.out.print("Enter Library Name: ");
	        d.libraryName = sc.nextLine();
	
	        System.out.print("Enter Number of Books: ");
	        d.books = sc.nextInt();
	        sc.nextLine(); // Consume the leftover newline character
	
	        System.out.print("Enter Digital Library Type (e.g., E-Books, Audio): ");
	        d.digitalType = sc.nextLine();
	
	        // Calling the overridden method to display details
	        d.displayLibrary();
	
	        sc.close();
	    }
	}

	String libraryName;
    int books;

    void displayLibrary() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Library No. of Books: " + books);
    }
}

class DigitalLibrary extends Library {
    String digitalType;

    // Overriding the displayLibrary method of the parent class
    @Override
    void displayLibrary() {
        System.out.println("--- Digital Library Details ---");
        System.out.println("Library Name: " + libraryName);
        System.out.println("No. of Books: " + books);
        System.out.println("Library Type: " + digitalType);
    }
}