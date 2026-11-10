package student;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        int a[] = new int[7];
        int search;
        int found = 0;
        
        System.out.println("Enter 7 elements: ");
        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to search: ");
        search = sc.nextInt();
        
        for (int i = 0; i < 7; i++) {
            if (a[i] == search) {
                System.out.println("Element is found at " + (i + 1) + " position");
                found = 1;
                break;
            }
        }
        
        if (found == 0) {
            System.out.println("Element not found");
        }

	}

}
