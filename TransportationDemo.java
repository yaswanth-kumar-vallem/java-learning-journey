
package uniflow;

import java.util.Scanner;

class Vehicles {
    String vehicleNumber;
    String brand;

    void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }
}

class Bus extends Vehicles {
    int seats;

    void displayBus() {
        System.out.println("No. of seats: " + seats);
    }
}

class Car extends Vehicles {
    String fuelType;

    void displayCar() {
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class TransportationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bus Details
        Bus b = new Bus();

        System.out.println("--- Bus Details ---");
        System.out.print("Enter Vehicle Number: ");
        b.vehicleNumber = sc.next();

        System.out.print("Enter Brand: ");
        b.brand = sc.next();

        System.out.print("Enter No. of seats: ");
        b.seats = sc.nextInt();

        System.out.println();
        b.displayVehicle();
        b.displayBus();

        // Car Details
        Car c = new Car();

        System.out.println("\n--- Car Details ---");
        System.out.print("Enter Vehicle Number: ");
        c.vehicleNumber = sc.next();

        System.out.print("Enter Brand: ");
        c.brand = sc.next();

        System.out.print("Enter Fuel Type: ");
        c.fuelType = sc.next();

        System.out.println();
        c.displayVehicle();
        c.displayCar();

        sc.close();
    }
}