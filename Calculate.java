package Uniflow;
import java.util.Scanner;
public class Calculate {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
    System.out.print("Name:");
    String  n=sc.nextLine();
    double tot=0;
    for(int i=1;i<4;i++) {
    	System.out.println("course:");
    	String s=sc.nextLine();
    	System.out.println("");
    	
    	
    	System.out.println(s+" Marks:");
    	double m=sc.nextInt();
      tot=m+tot;
      sc.nextLine();}
        System.out.println("total marks:"+tot);
    sc.close();
	
	
	}
}
