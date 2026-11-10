package Uniflow;

import java.util.Scanner;

public class Exception
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            // 1. NumberFormatException
            System.out.print("Enter Vehicle Age: ");
            String ageText = sc.nextLine();

            int age = Integer.parseInt(ageText);

            System.out.println("Vehicle Age: " + age);

            // 2. ArrayIndexOutOfBoundsException
            String routes[] = {"Hyderabad", "Vijayawada", "Guntur"};

            System.out.print("Enter Route Index (0-2): ");
            int index = sc.nextInt();

            System.out.println("Route: " + routes[index]);

            // 3. ArithmeticException
            System.out.print("Enter Total Distance: ");
            int distance = sc.nextInt();

            System.out.print("Enter Number of Trips: ");
            int trips = sc.nextInt();

            int average = distance / trips;

            System.out.println("Average Distance: " + average);
        }

        catch(NumberFormatException e)
        {
            System.out.println("Invalid vehicle age. Enter numbers only.");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid route index. Enter 0, 1 or 2.");
        }

        catch(ArithmeticException e)
        {
            System.out.println("Number of trips cannot be zero.");
        }

        finally
        {
            System.out.println("Transport Department process completed.");
            sc.close();
        }
    }
}