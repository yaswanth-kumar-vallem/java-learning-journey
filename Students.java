package student;
import java.util.Scanner;


class Students {

    int rollnum;
    String name;

    // Default Constructor
    Students()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number for Default Constructor: ");
        rollnum = sc.nextInt();

        System.out.print("Enter Name for Default Constructor: ");
        name = sc.next();
    }

    // Parameterized Constructor
    Students(int r, String n)
    {
        rollnum = r;
        name = n;
    }

    void display()
    {
        System.out.println("Roll Number: " + rollnum);
        System.out.println("Name: " + name);
    }

public class Demo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Default Constructor
        Students r1 = new Students();

        System.out.println("\nDefault Constructor:");
        r1.display();

        // Input for Parameterized Constructor
        System.out.print("\nEnter Roll Number for Parameterized Constructor: ");
        int r2 = sc.nextInt();

        System.out.print("Enter Name for Parameterized Constructor: ");
        String n2 = sc.next();

        // Parameterized Constructor
        Students s2 = new Students(r2, n2);

        System.out.println("\nParameterized Constructor:");
        s2.display();
            }
    }
}


