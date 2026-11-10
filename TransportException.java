
package Uniflow;

import java.util.Scanner;

public class TransportException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // NumberFormatException
            System.out.print("Enter a number: ");
            String s = sc.next();
            int n = Integer.parseInt(s);
            System.out.println("Number = " + n);

            // ArithmeticException
            System.out.print("Enter divisor: ");
            int d = sc.nextInt();
            System.out.println("Result = " + (100 / d));

            // ArrayIndexOutOfBoundsException
            int a[] = {10, 20, 30};
            System.out.print("Enter array index (0-2): ");
            int index = sc.nextInt();
            System.out.println("Value = " + a[index]);

            // NullPointerException
            String name = null;
            System.out.println(name.length());
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
      
        finally {
            System.out.println("Program Completed");
        }

        sc.close();
    }
}