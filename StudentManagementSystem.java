package Uniflow;

import java.util.Scanner;

//Grandparent Class: Stores basic personal details
class Person {
 String name;
 int age;

 // Method to accept input for Person attributes
 void inputPersonDetails(Scanner scanner) {
     System.out.print("Enter Student Name: ");
     name = scanner.nextLine();
     System.out.print("Enter Student Age: ");
     age = scanner.nextInt();
     scanner.nextLine(); // Consume newline character left behind by nextInt()
 }
}

//Parent Class: Inherits Person and adds academic details
class Student extends Person {
 int rollNumber;
 String department;

 // Method to accept input for Student attributes
 void inputStudentDetails(Scanner scanner) {
     // Call the parent method to get name and age first
     inputPersonDetails(scanner);
     System.out.print("Enter Roll Number: ");
     rollNumber = scanner.nextInt();
     scanner.nextLine(); // Consume newline character
     System.out.print("Enter Department: ");
     department = scanner.nextLine();
 }
}

//Child Class: Inherits Student and manages marks and final compilation
class Result extends Student {
 double mark1, mark2, mark3;
 double total;
 double percentage;

 // Method to accept input for marks
 void inputMarks(Scanner scanner) {
     // Call the immediate parent method to collect all student details
     inputStudentDetails(scanner);
     System.out.print("Enter Marks for Subject 1: ");
     mark1 = scanner.nextDouble();
     System.out.print("Enter Marks for Subject 2: ");
     mark2 = scanner.nextDouble();
     System.out.print("Enter Marks for Subject 3: ");
     mark3 = scanner.nextDouble();
     
     // Calculate performance summary metrics
     total = mark1 + mark2 + mark3;
     percentage = (total / 300) * 100;
 }

 // Method to display all consolidated records
 void displayResultCard() {
     System.out.println("\n==================================");
     System.out.println("      STUDENT REPORT CARD");
     System.out.println("==================================");
     System.out.println("Name        : " + name);
     System.out.println("Age         : " + age);
     System.out.println("Roll Number : " + rollNumber);
     System.out.println("Department  : " + department);
     System.out.println("----------------------------------");
     System.out.println("Subject 1   : " + mark1);
     System.out.println("Subject 2   : " + mark2);
     System.out.println("Subject 3   : " + mark3);
     System.out.println("----------------------------------");
     System.out.printf("Total Marks : %.2f / 300.00\n", total);
     System.out.printf("Percentage  : %.2f%%\n", percentage);
     System.out.println("==================================");
 }
}

//Main Execution Class
public class StudentManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Instantiating only the final leaf class object
     Result studentResult = new Result();
     
     System.out.println("--- Enter University Student Records ---");
     studentResult.inputMarks(scanner);
     
     // Displaying all structural information managed across the hierarchy
     studentResult.displayResultCard();
     
     scanner.close();
 }
}
