package Uniflow;
import java.util.Scanner;

public class Continues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("entre the n value:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+"  ");
			
		}
		
sc.close();

	}

}
